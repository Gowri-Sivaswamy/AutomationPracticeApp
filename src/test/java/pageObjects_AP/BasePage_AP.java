package pageObjects_AP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class BasePage_AP {
	public WebDriver driver;
	
	public BasePage_AP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
