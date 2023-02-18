package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	 
	private POMFactory factory = new POMFactory();
	
	

@When("User click on Account option")
public void userClickOnAccountOption() {
   click(factory.homePage().accountTab);
   logger.info("User clicked on Account Tab");
}


@When("User update Name {string} and Phone {string}")
public void userUpdateNameAndPhone(String string, String string2) {
	clearTextUsingSendKeys(factory.accountPage().nameField);
	sendText(factory.accountPage().nameField,string);
	clearTextUsingSendKeys(factory.accountPage().phoneField);
	sendText(factory.accountPage().phoneField,string2);
   logger.info("User enters new Name");
}


@When("User click on Update button")
public void userClickOnUpdateButton() {
	click(factory.accountPage().updateButton);
	logger.info("User clicked on Update Button");
	
    
}


@Then("user profile information should be updated")
public void userProfileInformationShouldBeUpdated() {
	waitTillPresence(factory.accountPage().profileInformationUpdatedBanner);
	Assert.assertTrue(isElementDisplayed(factory.accountPage().profileInformationUpdatedBanner));
    logger.info("Profile Information Updated Banner is Displayed");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	