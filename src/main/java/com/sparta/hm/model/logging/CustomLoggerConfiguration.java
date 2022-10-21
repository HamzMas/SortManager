package com.sparta.hm.model.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLoggerConfiguration {
    public static void configureLogger(Logger logger) {
        logger.setUseParentHandlers(false);

        logger.addHandler(CustomFileHandler.getFileHandler());
        logger.addHandler(CustomConsoleHandler.getConsoleHandler());

        logger.setLevel(Level.ALL);
    }
}
