package alpha_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_contact_Page_checkbox {
	@ FindBy(xpath = "(//input[@name='email_to[]'])[1]")
	public static WebElement sent_to_checkbox1;
	@FindBy (xpath = "(//input[@name='email_to[]'])[2]")
	public static WebElement sent_to_checkbox2;
	@FindBy (xpath = "(//input[@name='email_to[]'])[3]")
public static WebElement sent_to_checkbox3;
	
}
