package com.wipro.ImplicitlywaitAssignment;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitlyWaitAssignment {

	public static void main(String[] args) throws Exception {
		
		//Launching the Application
		System.setProperty("webdriver.chrome.driver", "D:\\TestNG Onwards\\ImplicitlywaitAssignment\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//selecting source and destination
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Del");
		WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/input[1]"));
		element.click();
		Thread.sleep(3000);
		element.sendKeys("ben");
		Thread.sleep(2000);
		element.sendKeys("g");
		
		
		//selecting day, month and year
		String Day="20";
		String mon="July";
		String year="2023";
		
		List<WebElement> sel=driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
		for (WebElement select:sel) {
			
				String monandyear=select.getText();
				String[] date=monandyear.split(" ");
				String dmonn=date[0];
				String dyear=date[1];
				System.out.println(dmonn+" "+dyear);
				
				if(dmonn.equalsIgnoreCase(mon) && dyear.equalsIgnoreCase(year)) {
					break;
				}Thread.sleep(3000);
		}driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]")).click();	
		
		List<WebElement>daylist =driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1euycsn']//div[3]//div//div//div//div//div//div"));
		for(WebElement day:daylist) {
			String date=day.getText();
			if(date.equalsIgnoreCase(Day)){
				day.click();
				break;
			}
		}
	
		
		//selecting adult upto 5
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		for (int a=0; a<4; a++) {
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]//*[name()='svg']")).click();
		}	driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();

		
		// selecting family and friends
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		
		//selecting submit button
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		
		//clicking on popup
		driver.findElement(By.xpath("//*[name()='rect' and contains(@width,'100%')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		Thread.sleep(5000);
		
		
		// Taking Screenshot of the screen
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File file =new File("D:\\TestNG Onwards\\ImplicitlywaitAssignment\\ScreenShot\\screen.png");
		FileUtils.copyFile(screenshot, file);
		
		//closing brouser
		driver.quit();
	}

}
