package com.sparta.hm.model.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

//Create and configure the Custom file handler
public class CustomFileHandler {
    public static FileHandler getFileHandler() {
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/my-log.log", 0,1,true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            return fileHandler;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
