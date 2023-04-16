package Bingtest;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBingTest {
	
	@Test
	public void validateBing() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.bing.com/");
		WebElement input= wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:/Batch 253/I1_GithubTest/Screenshot/bing.png"));
		wd.quit();

	}
}
