package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import junit.framework.*;

public class definition {
	@Given("user is already on Login page")
	public void user_is_already_on_login_page() {
		System.out.println("asdhsa");
	}
	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
		System.out.println("asdhsa");
	}
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		System.out.println("asdhsa");
	}
	@Then("user is on the home page")
	public void user_is_on_the_home_page() {
		System.out.println("free");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("safaadasfasf");
	}
	@Then("user is on home page")
			public void user_is_on_home_page() {
		System.out.println("safasf");
	}

}
