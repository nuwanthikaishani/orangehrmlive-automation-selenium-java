package testcases.login;

import org.base.BaseTest;
import org.pages.login.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("Admin");
        loginPage.enterUserPassowrd("admin123");
        loginPage.clickLoginButton();
    }
}
