package example;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Abc {

	WebDriver driver;
	List<String> a1=new ArrayList<String>();
@BeforeMethod
	public void base(){
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		driver=new ChromeDriver();
	}
@Test
public void launch(){
	driver.get("https://news.google.co.in/");
	driver.manage().window().maximize();
	List<WebElement> a2=driver.findElements(By.tagName("a"));
	for(WebElement a3:a2){
		String a4=a3.getAttribute("href");
		System.out.println(a4);
	}
	
}
}
