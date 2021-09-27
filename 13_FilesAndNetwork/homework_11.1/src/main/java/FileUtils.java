import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class FileUtils {

    public static long calculateFolderSize(String path) {
        long size = 0;
        try {
            File folder = new File(path);
            if (folder.isFile()) {
                size = folder.length();
            } else {
                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {
                            size += file.length();
                        } else {
                            size += calculateFolderSize(String.valueOf(file));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }

    public static String readableFileSize(long size) {
        if(size <= 0) return "0";
        final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
        int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }

        /* !!!!!!!!!!!!Второй вариант написания кода!!!!!!!!!!!!!!

        long size = 0;
        try {
            size = Files.walk(Paths.get(path))
                    .map(Path::toFile)
                    .filter(File::isFile)
                    .mapToLong(File::length)
                    .sum();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }*/

}