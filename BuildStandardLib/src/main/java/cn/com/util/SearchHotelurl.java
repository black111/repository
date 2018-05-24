package cn.com.util;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 按照城市名+区域来搜索此区域所有酒店
 * 返回酒店的超链接/源码
 */
public class SearchHotelurl {
	private static  WebDriver driver=null;
//	static File pathToFirefoxBinary = new File("E:/Firefox/firefox.exe");
//    static FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
	//传入酒店网址，城市名，区域名进行模拟点击
	public static String SimuClickXC(SearchCriteria criteria){			
        driver=new Drive().webdriver();
		driver.get(criteria.getURL());
		// navigation.to(url);	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//找到待搜索的城市
		driver.findElement(By.id("txtCity")).clear();
		driver.findElement(By.id("txtCity")).sendKeys(criteria.getCity());	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//按商圈搜索
		driver.findElement(By.id("txtKeyword")).clear();
		driver.findElement(By.id("txtKeyword")).sendKeys(criteria.getArea());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//回车
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		
		//找到搜索按钮
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url=driver.getCurrentUrl();
		//driver.close();
		return url;
	}
	public static String SimuClickYL(SearchCriteria criteria){			
        driver=Drive.webdriver();
		driver.get(criteria.getURL());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//找到待搜索的城市
		
//		WebElement city=driver.findElement(By.xpath("//li[1][@method=liHotData]"));
//		System.out.println(city.getText());
		driver.findElement(By.xpath("//input[@class='input_text']")).clear();
		driver.findElement(By.xpath("//input[@class='input_text']")).sendKeys(criteria.getCity()+"市");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//点击 确定
		new Actions(driver).sendKeys(Keys.ENTER).perform();
		//按商圈搜索
		driver.findElement(By.xpath("//input[@class='input_text c999']")).clear();	
		driver.findElement(By.xpath("//input[@class='input_text c999']")).sendKeys(criteria.getArea());	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//点击 确定
		new Actions(driver).sendKeys(Keys.ENTER).perform();		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url=driver.getCurrentUrl();
		//driver.close();
		return url;
	}
//	public static void main(String[] args) {
//		Logger logger = Logger.getLogger(System.class.getName());	
//		logger.info("log：");
//		new FindByPlat();
//		SearchCriteria s=FindByPlat.FindHotelByArea();
//		new SearchHotelurl();
//		String s1=SearchHotelurl.SimuClickYL(s);
//		System.out.println(s1);
//	}
}
