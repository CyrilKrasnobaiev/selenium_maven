import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by kirillk on 11.04.17.
 */
public class PerformTest extends DefaultTest {

    @Override
    @Test
    void test2(Method method){
        driver.get("https://templatemonster.com");
    }
}
