package com.wipro.ImplicitlywaitAssignment;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitAssignment {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestNG Onwards\\ImplicitlywaitAssignment\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@data-focusvisible-polyfill='true']")).sendKeys("Del");
		driver.findElement(By.xpath("//input[@data-focusvisible-polyfill='true']")).sendKeys("Beng");
		
		driver.findElement(By.xpath("//div[contains(text(),'Wed, 31 May 2023')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		for(int i=1; i<5; i++) {
			driver.findElement(By.xpath("//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'nonzero')]")).click();
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='rect' and contains(@width,'100%')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("D:\\TestNG Onwards\\ImplicitlywaitAssignment\\ScreenShot\\sr.png");
		FileUtils.copyfile(src, file);
		
		driver.quit();
	}

}
