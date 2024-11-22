/**
 * This module is a library module that provides a template for creating a Java library.
 */
module template.java.lib {
    requires org.slf4j;
    requires ch.qos.logback.classic;
    requires java.scripting;

    requires xyz.ronella.logging.logger.plus;
    requires xyz.ronella.casual.trivial;
}