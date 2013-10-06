import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Kacis
 * Date: 6.10.13
 * Time: 22:17
 */
public class Example {
    private static Log logger = LogFactory.getLog(Example.class);

    public static void main(String[] args) {
        logger.trace("TRACE!");
        logger.debug("DEBUG!");
        logger.info("INFO!");
        logger.warn("WARM!");
        logger.error("ERROR!");
        logger.fatal("FATAL!");
    }
}
