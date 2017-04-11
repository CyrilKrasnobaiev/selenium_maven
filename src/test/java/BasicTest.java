import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

/**
 * Created by kirillk on 11.04.17.
 */
abstract class BasicTest{

    public static WebDriver driver;
    abstract void beforeClass();
}
