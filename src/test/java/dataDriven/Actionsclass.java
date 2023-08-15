package dataDriven;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Chrome.driver", "C:\\Java\\chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		//creating action class object
		Actions a = new Actions(driver);
		//creating a variable for webElement element
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		//type something in the search box in capital latter
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("formals").doubleClick().build().perform();
		//move to particular element where we want to perform actions
		a.moveToElement(move).contextClick().build().perform();
		
	}

}
