package test_Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_01 {

	public static void main(String[] args) {

		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
		//open browser
		driver.get("http://localhost:8888/");
		
		//logine
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		
		//click contacts
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//click create contact +
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		
		//fill mandatory fields
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("POK");
		driver.findElement(By.xpath("(//input[@name=\"assigntype\"])[2]")).isSelected();
		
		//seve and verify
		driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();
		String lastname = driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"")).getText();
		if(lastname.contains("POK")) {
			System.out.println(lastname+ "passed");
		}
		else {
			System.out.println(lastname+ "failed");
			
		}
		
		//WebElement adminstrator = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		Actions act=new Actions(driver);
		act.moveByOffset(1268, 14).perform();
		//click logout
		driver.findElement(By.linkText("Sign Out")).click();
		
		//quit
		driver.quit();
	}

}
