package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(500);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println("Total of" +text);

List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
System.out.println("------------Brands----------------" );
for (WebElement e : brands) {
	String brand=e.getText();
	
	System.out.println(brand);
	
}

List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
System.out.println("----------------Names---------------");
for (WebElement n : names) {
	String name=n.getText();
	
	System.out.println(name);
	
}
	}

}
