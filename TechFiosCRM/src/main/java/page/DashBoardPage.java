package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage  extends BasePageA{
	
	WebDriver driver;
	
	
	public DashBoardPage(WebDriver driver) {
		
	this.driver = driver;
		
		}
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),Dashboard )]") WebElement PageTitle;
	@FindBy(how = How.LINK_TEXT,using = "Add Deposit") WebElement AddDepositButton;
	
	public void waitForPage() {
		
		waitForElement(PageTitle,driver);
	}
	
	public void clickAddDeposit() {
		
		AddDepositButton.click();	
	}
	
	
	
	

}
