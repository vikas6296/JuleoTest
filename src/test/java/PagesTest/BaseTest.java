package PagesTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Homepage;
import pages.LoginPage;

public class BaseTest extends BasePage
{
    LoginPage lp  = new LoginPage();
    @BeforeMethod
    @Parameters({"browser","url"})
    public void setup(@Optional("chrome") String browser, @Optional("https://www.Amazon.in")String url)
    {

        Assert.assertTrue(gotoHomePage(browser,url));
        Homepage hp = lp.userSignIn();


    }

   // @AfterMethod
   @Test
    public void tearDownBrowser()
    {
        //tearDown();
    }
}
