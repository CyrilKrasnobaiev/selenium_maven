import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by kirif on 11.04.2017.
 */
public class IncorrectEmailValidationTest extends BasicTest {
    @BeforeClass
    void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/work/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        }

    @Test
    public void getNeededPage() {
        driver.get("https://templatemonster.com");
        driver.findElement(By.id("header-signin-link")).click();
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id-index-continue-button"))));
    }


    @Test(dataProvider = "validation")
    public void EmailValidation(String nonValidate1, String nonValidate2, String nonValidate3){
        System.out.println(nonValidate1 + nonValidate2 + nonValidate3);
    }
}



