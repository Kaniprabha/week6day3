package pages;

import org.openqa.selenium.By;

public class CreateLeadPage extends MyLeadsPage{
	
    public void enterCompanyName() {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
    public void enterFirstName() {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	}
    public void enterLastName() {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
    }
    public void enterPhno() {
    	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
    }
    public void clickSubmitButton() {
    	driver.findElement(By.name("submitButton")).click();
    }

}
