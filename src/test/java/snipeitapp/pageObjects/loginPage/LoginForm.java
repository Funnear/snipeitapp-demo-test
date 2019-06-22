package snipeitapp.pageObjects.loginPage;

import org.openqa.selenium.By;

public class LoginForm {

    public static By USERNAME_FIELD = By.cssSelector("input[placeholder='Username']");
    public static By PASSWORD_FIELD = By.cssSelector("input[placeholder='Password']");
    public static By LOGIN_BUTTON = By.cssSelector("button.btn.btn-lg.btn-primary.btn-block");

}
