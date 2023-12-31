package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
    public WelcomePage clickLoginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage();    	
	}
    public WelcomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		WelcomePage wp = new WelcomePage();
    	return wp;
	}
}
