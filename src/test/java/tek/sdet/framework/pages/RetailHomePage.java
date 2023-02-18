package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	
	
	public RetailHomePage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id="signinBtn") public WebElement signIn;
	
	
	@FindBy(id = "search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css="#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath="// button[@id='searchBtn']")
	public WebElement searchButton;
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement tekSchoolLogo;
	
	@FindBy(xpath = "//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemonProductImage;
	

	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountTab;

	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath = "//div[@class")
	public List<WebElement> sideBarElements;
	
	
	
}
