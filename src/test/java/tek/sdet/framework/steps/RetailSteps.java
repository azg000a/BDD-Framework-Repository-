package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	
	
	private POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		// we will use Junit assertion to match the actual vs expected
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " +  actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
		
	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar,productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
		
	}
	
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonProductImage));
		logger.info("the Product is displayed on Home Page");
	}
	
	

	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	   
	}	
	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for(WebElement option : sideBarOptions) {
			if(option.getText().equals (department)) {
				click(option);
				logger.info(option.getText() +" is present");
				break;
			}
		}
		

	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarElements;
		for(int i = 0; i <expectedDepartmentOptions.get(0).size(); i++) {
			for(WebElement dept: actualDepartmentOptions) {
				if(dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
