import org.testng.annotations.AfterTest;

/**
 * Created by kirillk on 11.04.17.
 */
abstract class AfterClass extends BasicTest {
    @AfterTest
    abstract public void closeMethod();
}
