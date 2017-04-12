import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.ArrayList;



/**
 * Created by kirif on 11.04.2017.
 */
public class IncorrectEmailValidationTest extends BasicTest {

    @BeforeClass
    void beforeClass() {
        //System.setProperty("webdriver.chrome.driver", "C:/work/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        }

    @Test
    public void neededPageTest() {
        driver.get("https://templatemonster.com");
        driver.findElement(By.id("header-signin-link")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id-index-continue-button"))));
    }


    @Test(dependsOnMethods = "neededPageTest", dataProvider = "incorrectEmailsData", dataProviderClass = EmailValidationData.class)
    public void emailValidationTest(String invalidEmail) {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(invalidEmail);
        driver.findElement(By.id("id-index-continue-button")).click();
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='notification']"))));
        String errorTest = driver.findElement(By.xpath("//span[@class='notification']")).getText();
        System.out.println(errorTest);
//        if(errorTest == "Please specify a valid email") {
//            System.out.println("Fuck Yeahh!!!");
//        }
//        else{
//            System.out.println("Fuck No!!!");
//        }
    }
}




