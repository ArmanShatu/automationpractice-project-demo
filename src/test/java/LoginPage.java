import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(className = "login")
    WebElement btnLogin;
    @FindBy(id = "email")
    WebElement txtEmail;
    @FindBy(id= "passwd")
    WebElement txtPassword;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmit;
    @FindBy(className = "logout")
    WebElement btnLogout;
    @FindBy(className = "header_user_info")
    List<WebElement> lblUsername;
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String doLogin(){
        btnLogin.click();
        txtEmail.sendKeys("user1n@test.com");
        txtPassword.sendKeys("user1n");
        btnSubmit.click();
//        btnLogout.isDisplayed();
         return lblUsername.get(0).getText();
    }


}
