package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
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
		sendText(factory.accountPage().nameField, string);
		clearTextUsingSendKeys(factory.accountPage().phoneField);
		sendText(factory.accountPage().phoneField, string2);
		logger.info("User enters new Name and Phone number");
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

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> passwordUpdate = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, passwordUpdate.get(0).get("previous Password"));
		sendText(factory.accountPage().newPassword, passwordUpdate.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassword, passwordUpdate.get(0).get("confirmPassword"));
		logger.info("User enters information to update password");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("User clicks on Change Password Button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		
		if(string.equals ("Password Updated Successfully")) {
			waitTillPresence(factory.accountPage().passwordUpdatedSuccessfullyBanner);	
		Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfullyBanner));
		logger.info("Password Updated Successfully");
		
		}else if(string.equals ("Payment Method added successfully")) {
			try{Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccesfullyBanner));}
			catch (Exception e ) {				
			}
			
			logger.info("Payment Method added Successfully");
			
		} else if(string.equals("Payment Method updated successfully")) {
			waitTillPresence(factory.accountPage().cardUpdatedMessage);
			try{Assert.assertTrue(isElementDisplayed(factory.accountPage().cardUpdatedMessage));}
			catch(Exception e) {				
			}
			logger.info("card updated message is displayed");
			
		} else if(string.equals("Address Added Successfully")) {
			waitTillPresence(factory.accountPage().addressAddedSuccesfully);
			try{Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccesfully));
			}catch (Exception e) {
				
			}
			logger.info("User adds new address successfully!");
			
		} else if(string.equals("Address Updated Successfully")) {
			waitTillPresence(factory.accountPage().addressUpdatedSuccessfully);
			try{Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfully));
			} catch(Exception e ) {
				
			}
			logger.info("user successfully updates address");
		}
		
	}
		
		

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {

		click(factory.accountPage().addPaymentMethod);
		logger.info("User clicks on Add a Payment Method Button");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> addingNewCard = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, addingNewCard.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, addingNewCard.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthInput, addingNewCard.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput, addingNewCard.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, addingNewCard.get(0).get("secuirtyCode"));
		logger.info("User Enters all required information into add your card form");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {

		click(factory.accountPage().addYourCardButton);
		logger.info("user clicks on add your card button");	
		
		}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	 
		click(factory.accountPage().clickOnCardToEdit);
	   click(factory.accountPage().creditCardEditButton);
 
	   logger.info("user clicks on edit card button");
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String,String>> updatingCard = dataTable.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput,updatingCard.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput,updatingCard.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthInput, updatingCard.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput, updatingCard.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput,updatingCard.get(0).get("securityCode"));
		logger.info("user enters new card information");
	}
	@When("User click on Update your card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("User clicks on update your card button");
	 
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().clickOnCardToEdit);
	    click(factory.accountPage().removeCardLink);
	    
	    logger.info("user successfully clicks on remove card link");
	}
	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		try{Assert.assertTrue(isElementDisplayed(factory.accountPage().removeCardLink));
		}catch(Exception e) {
			
		}
		logger.info("user successfully removes card");	    
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountPage().addAddressButton);
	    logger.info("user clicks on add your address button");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> addAddressInfo = dataTable.asMaps(String.class, String.class);
	    selectByValue(factory.accountPage().countrySelect, addAddressInfo.get(0).get("country"));
	    clearTextUsingSendKeys(factory.accountPage().inputFullName);
	    sendText(factory.accountPage().inputFullName, addAddressInfo.get(0).get("fullName"));
	    clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
	    sendText(factory.accountPage().phoneNumberInput, addAddressInfo.get(0).get("phoneNumber"));
	    clearTextUsingSendKeys(factory.accountPage().streetInput);
	    sendText(factory.accountPage().streetInput, addAddressInfo.get(0).get("streetAddress"));
	    clearTextUsingSendKeys(factory.accountPage().apartmentInput);
	    sendText(factory.accountPage().apartmentInput, addAddressInfo.get(0).get("apt"));
	    clearTextUsingSendKeys(factory.accountPage().cityInput);
	    sendText(factory.accountPage().cityInput, addAddressInfo.get(0).get("city"));
	    selectByVisibleText(factory.accountPage().stateSelect, addAddressInfo.get(0).get("state"));;
	    clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
	    sendText(factory.accountPage().zipCodeInput, addAddressInfo.get(0).get("zipCode"));
	    logger.info("User successfully enters new address information");
	    
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().updateAddressButton);
		logger.info("User clicks on add address button");
	   
	}
	
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().editAddressButton);
	    logger.info("user clicks on edit address button");
	}
	
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		
		click(factory.accountPage().updateAddressButton);
		logger.info("user clicks update address button");
	  
	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressButton);
		logger.info("user successfully removes address");
	    
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		
		try{Assert.assertFalse(isElementDisplayed(factory.accountPage().removeAddressButton));
		}catch (Exception e ) {
			
		}
		logger.info("address should be removed after clicking remove");
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

} 
