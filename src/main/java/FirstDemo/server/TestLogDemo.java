package FirstDemo.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by sunholdIng on 2017/4/13.
 */
@Component
public class TestLogDemo {
    private static Logger logger = LoggerFactory.getLogger(TestLogDemo.class);

    public  void testLog(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}
