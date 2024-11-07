package alpha_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MY_contact_sendkey {
	@FindBy(xpath = "(//input[@id='subject'])[1]")
	public static WebElement Subject;
	@FindBy(xpath = "(//input[@id='email'])[1]")
public static WebElement email_address;
	@FindBy(xpath = "(//input[@id='q1'])[1]")
	public static WebElement textboxfield;
	@FindBy (xpath = "(//textarea[@id='q2'])[1]")
	public static WebElement multiline;
}