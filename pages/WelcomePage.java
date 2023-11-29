package pages;

import org.openqa.selenium.By;

public class WelcomePage extends LoginPage{
	
	public WelcomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		WelcomePage wp = new WelcomePage();
    	return wp;
	}
    public LoginPage clickLogoutButton() {
    	System.out.println("Logout Successfull");
    	return new LoginPage();
		
	} 
    public WelcomePage verifyLoginPage() {
    	System.out.println("Login Successful");
    	return this;
    }

}
