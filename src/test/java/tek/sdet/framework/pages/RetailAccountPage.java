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
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPassword;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//button[@id = 'credentialsSubmitBtn']")
	public WebElement changePasswordButton;
	
	@FindBy(xpath = "//div[text() = 'Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyBanner;
	
	@FindBy(xpath = "//p[text() = 'Add a payment method']")
	public WebElement addPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(xpath = "//input[contains(@id, 'securityCodeInput')]")
	public WebElement securityCodeInput;
	
	@FindBy(xpath = "//button[contains(@id,'paymentSubmitBtn')]")
	public WebElement addYourCardButton;
	
	@FindBy(xpath = "//div[contains(@text(),'Payment Method added sucessfully')]")
	public WebElement paymentMethodAddedSuccesfullyBanner;
	
	@FindBy(xpath = "(//img[@alt = 'Master Card'])[1]")
	public WebElement clickOnCardToEdit;
	
	@FindBy(xpath = "(//button[@class = 'text-blue-800 cursor-pointer hover:underline'])[1]")
	public WebElement creditCardEditButton;
	
	@FindBy(xpath = "//button[@id = 'paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath = "//div[text()= 'Payment Method updated Successfully']")
	public WebElement cardUpdatedMessage;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")	
	public WebElement removeCardLink;
	
	@FindBy(xpath = "(//div[contains(@class,'account__address-new')])[1]")
	public WebElement addAddressButton;
	
	@FindBy(id = "countryDropdown")
	public WebElement countrySelect;
	
	@FindBy(id = "fullNameInput")
	public WebElement inputFullName;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(xpath = "//input[@id = 'cityInput']")
	public WebElement cityInput;
	
	@FindBy(xpath = "(//select[@class = 'account__address-new-dropdown'])[2]")
	public WebElement stateSelect;
	
	@FindBy(xpath = "//input[@id = 'zipCodeInput']")
	public WebElement zipCodeInput;
	
	@FindBy(xpath = "//button[@id = 'addressBtn']")
	public WebElement updateAddressButton;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Address Added Successfully')]")
	public WebElement addressAddedSuccesfully;
	
	@FindBy(xpath = "(//button[@class= 'account__address-btn'])[1]")
	public WebElement editAddressButton;
	
	@FindBy(xpath = "//div[contains(text(), 'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfully;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeAddressButton;
	
	
	
	
	
	
}
