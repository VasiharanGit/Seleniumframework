package utils;

import java.util.Properties;

public class ConfigReader {
    static Properties prop = new Properties();

    static {
        try {
            prop.load(ConfigReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}