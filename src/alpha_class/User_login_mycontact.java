package alpha_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_login_mycontact {
@FindBy(xpath = "//input[@id='user']")
public static WebElement username;
@FindBy(xpath = "//input[@id='pass']")
public static WebElement password;
@FindBy(xpath = "//input[@name='btnSubmit']")
public static WebElement login;
}
