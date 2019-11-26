package xyz.ronella.template.lib;

import org.apache.logging.log4j.LogManager;
import xyz.ronella.template.lib.commons.LoggerPlus;

public class Main {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LogManager.getLogger(Main.class));

    public String hello(String name) {
        try (var mLOG = LOGGER_PLUS.logByMethodCall("hello")) {
            var output = String.format("Hello %s", name);
            mLOG.debug(output);
            return output;
        }
    }

}