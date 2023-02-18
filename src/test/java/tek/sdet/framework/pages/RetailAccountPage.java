package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id= "nameInput")
	public WebElement nameField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneField;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement profileInformationUpdatedBanner;
	
	
}
