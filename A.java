package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\PorterAirlinesProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spirit.com/");
		WebElement e1 = driver.findElement(By.xpath("//select[@id='departCityCodeSelect']"));
		Select s=new Select(e1);
		s.selectByVisibleText("Aguadilla, Puerto Rico (BQN)");
		
		WebElement e2 = driver.findElement(By.xpath("//select[@id='destCityCodeSelect']"));
		Select s1=new Select(e2);
		s1.selectByVisibleText("Akron/Canton, OH (CAK)");
		
		driver.findElement(By.xpath("//input[@id='departDate']")).click();
		driver.findElement(By.xpath("(//a[text()='26'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='returnDate'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='1'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='pull-right btn btn-sm btn-primary button primary secondary flightSearch']")).click();
		
	}

}
