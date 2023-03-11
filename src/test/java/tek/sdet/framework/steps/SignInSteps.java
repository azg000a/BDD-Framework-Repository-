package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class SignInSteps extends CommonUtility{
	
	private POMFactory factory = new POMFactory();

	
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("user clicked on Sign in Button");
	}
	
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String text, String text2) {
		
		sendText(factory.signInPage().emailField,text);
		sendText(factory.signInPage().passwordField,text2);
		logger.info("user successfully entered email "+text+ "and password"+text2);
	}
	
	@And ("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginPageButton);
		logger.info("user clicked login button");
	}
	
	@Then("User should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountTab));
		logger.info("Account Button is present");
		
	}
	

	
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createAccountButton);
		logger.info("User clicked on Create New Account Button");	}

	
	@When("User fill the signUp information with bellow data")
	public void userFillTheSignUpInformationWithBellowData(DataTable dataTable) {
		List<Map<String,String>> signUpInformation = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpNameField,DataGeneratorUtility.data(signUpInformation.get(0).get("name")));

	
		sendText(factory.signInPage().signUpEmailField,signUpInformation.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordField,signUpInformation.get(0).get("password"));
		sendText(factory.signInPage().signUpConfirmPassword,signUpInformation.get(0).get("confirmPassword"));
		logger.info("user filled the signUp information form");
		
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpFormButton);
		logger.info("user should be logged into account");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("User is logged into account page");
	
	}



	


}