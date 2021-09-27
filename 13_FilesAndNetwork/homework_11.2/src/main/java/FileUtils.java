import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.copy;

public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        // TODO: write code copy content of sourceDirectory to destinationDirectory

       File folder = new File(sourceDirectory);
        File[] listOfFiles = folder.listFiles();
        Path destDir = Paths.get(destinationDirectory);
        if (listOfFiles != null)
            for (File file : listOfFiles)
                if(file.isFile()) {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                } else {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                }



/*        Path sourcePath = Paths.get(sourceDirectory);
        Path destinationPath = Paths.get(destinationDirectory);
        try {
            Files.walk(sourcePath)
                    .forEach(source -> {
                        try {
                            copy(source, destinationPath.resolve(sourcePath.relativize(source)));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

