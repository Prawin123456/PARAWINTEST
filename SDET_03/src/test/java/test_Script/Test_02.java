package test_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_02 {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		Actions act=new Actions(driver);
		act.moveByOffset(1268, 14).perform();
	}

}
