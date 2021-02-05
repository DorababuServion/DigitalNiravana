package com.DigitalNiravan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends StepDefinitionClass {
	
	
	public Login() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}


	@FindBy(id="signInFormUsername")
	private WebElement username;
	
	@FindBy(id="signInFormPassword")
	private WebElement password;
	
	@FindBy(name="signInSubmitButton")
	private WebElement signin;
	
	
	
	

}
