import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;

public class ResultTest {


    ChromeDriver driver;
    HomePage page;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lusine.yeritsyan\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();
        page = new HomePage(driver);
    }

    @Test
    public void search() throws InterruptedException
    {
        page.visitTo("https://www.google.am/?gws_rd=cr&dcr=0&ei=yXI3WrStMI35kwXL0YLADg");
        page.type("Armenia");
        page.clickOnButton();
        Assert.assertTrue(page.isContain("ikipedia"));
    }

    @AfterMethod
    public void closeTheBrowser()
    {
        driver.quit();
        driver.close();
    }
}
