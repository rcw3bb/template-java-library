package xyz.ronella.template.lib;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;
import xyz.ronella.trivial.decorator.Mutable;

import java.util.function.Consumer;

/**
 * The Main class is the main class of the library.
 *
 * @since 1.0.0
 */
public class Main {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(Main.class));

    /**
     * The constructor of the Main class.
     */
    public Main() {
    }

    /**
     * The hello method returns a greeting message.
     * @param name The name to greet.
     * @return The greeting message.
     */
    public String hello(String name) {
        try (var mLOG = LOGGER_PLUS.groupLog("hello")) {
            final var mString = new Mutable<>("Hello ");
            final Consumer<String> process = (___string) -> mString.set(mString.get().concat(___string));
            process.accept(name);
            mLOG.debug(mString.get());
            return mString.get();
        }
    }

}
