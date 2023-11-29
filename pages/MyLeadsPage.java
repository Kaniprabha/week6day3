package pages;

import org.openqa.selenium.By;

public class MyLeadsPage extends MyHomePage{
	
    public void clickCreateLead() {
    	driver.findElement(By.linkText("Create Lead")).click();
	}

}
