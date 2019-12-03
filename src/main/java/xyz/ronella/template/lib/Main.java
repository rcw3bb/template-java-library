package xyz.ronella.template.lib;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;

public class Main {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(Main.class));

    public String hello(String name) {
        try (var mLOG = LOGGER_PLUS.logByMethodCall("hello")) {
            var output = String.format("Hello %s", name);
            mLOG.debug(output);
            return output;
        }
    }

}
