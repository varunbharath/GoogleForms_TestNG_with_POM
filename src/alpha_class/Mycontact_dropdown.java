package alpha_class;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mycontact_dropdown {
	Random ran=new Random();
	
	@FindBy (xpath = "(//select[@id='q8'])[1]")
	public static WebElement usstate;
	@FindBy (xpath="(//select[@id='q8'])[1]//option")
	public static List<WebElement> listusstates;
	@FindBy(xpath = "(//select[@id='q10'])[1]")
	public static WebElement candatian;
	@FindBy(xpath = "(//select[@id='q10'])[1]//option")
	public static List<WebElement> candaianProvincesoflist;
	 public  Mycontact_dropdown randomdop() {
		 //canadian_dropdown
		int sizeofcanadian =candaianProvincesoflist.size();
		int storedcanadian=ran.nextInt(sizeofcanadian);
		candaianProvincesoflist.get(storedcanadian).click();
		// usstatedropdown
		int usstatesize=listusstates.size();
		int storedsize=ran.nextInt(usstatesize);
		listusstates.get(storedsize).click();
		return this;
	 }
	 
	

}
