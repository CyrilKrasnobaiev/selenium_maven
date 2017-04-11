import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by kirillk on 11.04.17.
 */

public class DefaultTest extends BasicTest {

    @BeforeClass
    void beforeClass() {
        driver = new ChromeDriver();
    }

    @Test
    void test2(Method method) {
        System.out.println("============================================ " + getClass() + "." + method.getName() + "()");
        driver.get("https://google.com");
    }

    @Test
    private void test() {
        System.out.println("============================================ " + getClass() + ".test()");
        driver.get("https://google.com");
        driver.findElement(By.id("lst-ib")).sendKeys("Ебать, я Гений!");
    }

    @AfterTest
    void closeMethod() {
        driver.close();
    }
}

