package com.plamenti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./libraries/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

    	System.setProperty("webdriver.chrome.driver", "./libraries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.fadata.eu/");

		String expectedTitle = "Fadata | Innovative Insurance Software and IT Solutions";
		String actualTitle = driver.getTitle();

		if(expectedTitle.equals(actualTitle)){
			System.out.println("Title is correct. Test Pass!");
		}else{
			System.out.println("Title is not correct. Test Fail!");
			System.out.println("Actual Title: " + actualTitle);
			System.out.println("Expected Title: " + expectedTitle);
		}

		driver.findElement(By.linkText("Clients")).click();
		driver.findElement(By.linkText("Company")).click();
		driver.findElement(By.linkText("Clients")).click();
		WebElement element = driver.findElement(By.xpath("//img[@alt='Generali']"));

		if(element != null){
			System.out.println("Element is present. Test Pass!");
		} else{
			System.out.println("Element is not present. Test Fail!");
		}

		driver.quit();
    }
}
