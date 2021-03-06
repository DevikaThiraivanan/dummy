package com.capg.roombooking.stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capg.roombooking.beans.ConfernaceRoomBookingPageBean;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRoomBookingStepDefinition {
	
	
	private WebDriver driver;
	private ConfernaceRoomBookingPageBean pageBean ;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas_Trainer\\Drivers\\chromedriver.exe ");
	}		 
	
	@Given("^User is on Conference room booking page$")
	public void user_is_on_Conference_room_booking_page() throws Throwable {
	     
		driver = new ChromeDriver();
		driver.get( "http://localhost:4444/ExampleImpl/ConferenceRegisteration.html" );
		driver.manage().window().maximize();
		pageBean= new ConfernaceRoomBookingPageBean();
		PageFactory.initElements(driver, pageBean);
		pageBean.clickNextPageLink();
		
	}

	@When("^select 'Next' link without entering 'FirstName'$")
	public void select_Next_link_without_entering_FirstName() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the First Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setFirstName("Devika");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Last Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setLastName("Thiraivanan");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Email";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please fill the Email message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setEmail("devika.thiraivanan capgemini.com");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering invalid 'Email' address$")
	public void user_select_Next_link_after_entering_invalid_Email_address() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Email Id.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please enter valid Email Id\\. message should display$")
	public void please_enter_valid_Email_Id_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setEmail(" devika.thiraivanan@capgemini.com");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without entering 'Contact No'$")
	public void user_select_Next_link_without_entering_Contact_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Contact No.";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please fill the Contact No message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setContactNo("123456789");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering invalid 'Contact No'$")
	public void user_select_Next_link_after_entering_invalid_Contact_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Contact no.";
		Assert.assertEquals(expectedMessage, actualMessage); 
	}

	@Then("^'Please enter valid Contact no message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setContactNo("9930856957");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'Number of people attending'$")
	public void user_select_Next_link_without_selecting_Number_of_people_attending() throws Throwable {
	
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Number of people attending";
		Assert.assertEquals(expectedMessage, actualMessage);
	
	}

	@Then("^'Please fill the Number of people attending' message should display$")
	public void please_fill_the_Number_of_people_attending_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setNoOfPerson("3");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without entereing  'Building Name & Room No'$")
	public void user_select_Next_link_without_entereing_Building_Name_Room_No() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Building & Room No";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Building & Room No' message should display$")
	public void please_fill_the_Building_Room_No_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setBuildingAndRoomNo("No.12,GopalStreet");
		pageBean.clickNextPageLink(); 
	}

	@When("^User select 'Next' link without entereing  'Area Name'$")
	public void user_select_Next_link_without_entereing_Area_Name() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Area name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please fill the Area name' message should display$")
	public void please_fill_the_Area_name_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setAreaName("SatyaGarden,Saligramam");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'City'$")
	public void user_select_Next_link_without_selecting_City() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select city";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setCity("Pune");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'State'$")
	public void user_select_Next_link_without_selecting_State() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select state";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		driver.switchTo().alert().dismiss();
		 
		pageBean.setState("Maharashtra");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link without selecting  'MemberShip Status '$")
	public void user_select_Next_link_without_selecting_MemberShip_Status() throws Throwable {
		
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please Select MemeberShip status";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Please Select MemeberShip status' message should display$")
	public void please_Select_MemeberShip_status_message_should_display() throws Throwable {
		pageBean.setMemberStatus("member");
		pageBean.clickNextPageLink();
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable {
		
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Personal details are validated.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^'Personal details are validated message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
		pageBean.setFirstName("Devika");
		pageBean.setLastName("Thiraivanan");
		pageBean.setEmail("devika.thiraivanan@capgemini.com");
		pageBean.setContactNo("9930856957");
		pageBean.setNoOfPerson("3");
		pageBean.setBuildingAndRoomNo("No.12,GopalStreet");
		pageBean.setAreaName("SatyaGarden,Saligramam");
		pageBean.setCity("Pune");
		pageBean.setState("Maharashtra");
		pageBean.setMemberStatus("member");
		pageBean.clickNextPageLink();
		
	}

}
