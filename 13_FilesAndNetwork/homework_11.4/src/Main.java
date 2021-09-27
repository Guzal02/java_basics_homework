import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Урок 11,4 ------- скачать и сохранить изображения при помощи библиотеки jsoup!!!!!!!!!!!!!!!!!
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static final String JPG = "jpg";
    public static final String SRC = "src";
    public static final String IMAGES = "images/";
    public static final String IMG = "img";

    public static void main(String[] args) {
        String url = "https://lenta.ru/";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements imageElements = doc.select(IMG);
            for (Element imageElement : imageElements) {
                String attr = imageElement.attr("abs:src");
                String extension = null;
                int i = attr.lastIndexOf('.');
                if (i >= 0) {
                    extension = attr.substring(i + 1);
                }
                if (JPG.equals(extension)) {
                    try (InputStream in = new URL(attr).openStream()) {
                        String url1 = imageElement.attr(SRC);
                        String filename = IMAGES + Paths.get(new URI(url1).getPath()).getFileName().toString();
                        Files.copy(in, Paths.get((filename)));
                        System.out.println(filename);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
________________________________________________________________________________________-*/
// Урок 11,5 ----- Научиться получать данные из HTML-страницы, создавать и читать JSON-файлы!!!!!
public class Main {
    public static void main(String[] args) {
        File url = new File("metro/metro.html");
        try {
            Document doc = Jsoup.parse(url, "UTF-8", "https://www.moscowmap.ru/metro.html#lines");
            JSONObject jsonMetro = new JSONObject();
            Elements metroData = doc.select("#metrodata");
            Elements lines = metroData.select(".js-metro-line");
            JSONObject jsonLines = new JSONObject();
            for (Element line : lines) {
                jsonLines.put(line.attr("data-line"), line.text());
            }
            Elements stations = metroData.select(".js-metro-stations");
            JSONObject jsonStations = new JSONObject();
            for (Element station : stations) {
                jsonStations.put(station.attr("data-line"), Arrays.toString(station.select(".name").text().split(" ")));
            }
            jsonMetro.put("station", jsonStations);
            jsonMetro.put("lines", jsonLines);

            System.out.println(jsonMetro);
            FileWriter file = new FileWriter("data/metro.json");
            file.write(jsonMetro.toJSONString());
            file.flush();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
