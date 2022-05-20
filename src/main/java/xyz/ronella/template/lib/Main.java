package xyz.ronella.template.lib;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;
import xyz.ronella.trivial.decorator.Mutable;

import java.util.function.Consumer;

public class Main {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(Main.class));

    public String hello(String name) {
        try (var mLOG = LOGGER_PLUS.groupLog("hello")) {
            final var mString = new Mutable<>("Hello ");
            final Consumer<String> process = (___string) -> mString.set(mString.get().concat(___string));
            process.accept("World");
            mLOG.debug(mString.get());
            return mString.get();
        }
    }

}
