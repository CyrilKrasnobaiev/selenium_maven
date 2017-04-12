import org.testng.annotations.DataProvider;

/**
 * Created by kirif on 11.04.2017.
 */
public class EmailValidationData{
    @DataProvider
    public Object[][] incorrectEmailsData() {
        return new Object[][]{
                {"2@e.e"},
//                {"erwerwer"},
//                {"434534534@f"}
        };
    }
}
