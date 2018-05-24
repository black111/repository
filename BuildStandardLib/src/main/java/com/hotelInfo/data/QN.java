package com.hotelInfo.data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.other.tools.WriteToFile;

import cn.com.util.Drive;

public class QN {
	WebDriver driver=null;
	public List<String> crawlingHref(String url){
		//定义存取超链接的列表
		List<String> list_hotel_href=new ArrayList<String>();
	    //打开一个新的浏览器
	    driver= Drive.webdriver();
		//获得连接
	    driver.get(url);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  //滑动到底部
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		//获得所有页的酒店的超链接
		int count=0;
		for(int i=1;i<=6;i++){
			//获得此页酒店的超链接
			List<WebElement> hrefs_hotel=driver.findElements(By.xpath("//*[@class=\"hotel_item\"]"));
			System.out.println(hrefs_hotel.size());
			//一页酒店的所有超链接
			String href="";
			String urlJson="";
			for(int j=0;j<hrefs_hotel.size();j++){    
				//获得这一页所有酒店的超链接。。
				String hotel_code=hrefs_hotel.get(j).getAttribute("data-link");
				href="http://hotel.qunar.com"+getHref(hotel_code);
				String hotel_name=hrefs_hotel.get(j).findElement(By.xpath("//*[@class=\"hotel_item\"]")).getAttribute("title");
				urlJson="{\"name\":"+hotel_name+"\",\"hotelUrl\":\""+href+"\",\"from\":\"qunar\"}";
				//				String hotel_name=hrefs_hotel.get(j).attr("")
				list_hotel_href.add(urlJson+'\n');
				count++;
				
			}
			System.out.println(urlJson);
			WriteToFile w_href_toFile=new WriteToFile();
			w_href_toFile.writer2file("C:/Users/LivelyRong/Desktop/Url/qn.txt", urlJson);
			
			
			//获取下一页的链接
			WebDriverWait wait = new WebDriverWait(driver, 20);

			try{
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"item next\"]"))).click();

				//				driver.findElement(By.id("downHerf")).click();
			}catch(WebDriverException e){
				e.printStackTrace();
//				break;
			}				
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//				
		}
		driver.close();
		//返回酒店超链接列表
		return list_hotel_href;
	}
	
	public static String getHref(String href){
		if(href!=null){
			Pattern p_phone=Pattern.compile("(.*)(#)");
			Matcher m_phone=p_phone.matcher(href);
			while(m_phone.find()){
				href=m_phone.group(1);
			}
			return href;
		}
		return href;
	}
}
