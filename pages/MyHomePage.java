package pages;

import org.openqa.selenium.By;

public class MyHomePage extends WelcomePage{
	
    public void clickLeadsTab() {
    	driver.findElement(By.linkText("Leads")).click();
	}

}
