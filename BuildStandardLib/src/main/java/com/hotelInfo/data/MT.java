package com.hotelInfo.data;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.other.tools.WriteToFile;

import cn.com.util.Drive;
	
public class MT {
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
//		    //此区域的酒店源码
	    String html = driver.getPageSource();
	    Document doc=Jsoup.parse(html);
		int Maxpage=1;		
		//获得这个区域酒店的页数
		Elements pages=doc.select("li[data-page]");
		//Maxpage=Integer.parseInt(pages.get(6).attr("data-ga-page").toString());
		System.out.println(Maxpage);
		//获得所有页的酒店的超链接
		int count=0;
		for(int i=1;i<=6;i++){
			//从第一页的酒店开始解析
			Document doc1=Jsoup.parse(html);
			//获得此页酒店的超链接
			Elements hrefs_hotel=doc1.select("[class=\"hotel\"]");			
			System.out.println(hrefs_hotel.size());
			//一页酒店的所有超链接
			String href="";
			
			for(int j=0;j<hrefs_hotel.size();j++){    
				//获得这一页所有酒店的超链接。。
				String hotel_code=hrefs_hotel.get(j).attr("data-poiid");
//				String hotel_name=hrefs_hotel.get(j).attr("")
				list_hotel_href.add("http://www.meituan.com/shop/"+hotel_code+"/");
				count++;
				if(j!=hrefs_hotel.size()-1){
					href+="http://www.meituan.com/shop/"+hotel_code+"/"+'\n';					
		
				}else{
					href+="http://www.meituan.com/shop/"+hotel_code+"/";
				}
			}
			System.out.println(href);
			WriteToFile w_href_toFile=new WriteToFile();
			w_href_toFile.writer2file("C:/Users/LivelyRong/Desktop/Url/mt.txt", href);
			//获取下一页的链接
			try{
				driver.findElement(By.xpath("//*[@class=\"next\"]")).click();
//				driver.findElement(By.id("downHerf")).click();
			}catch(WebDriverException e){
				e.printStackTrace();
//				break;
			}				
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			html=driver.getPageSource();
//				System.out.println(driver.getTitle());
//				
		}
		driver.close();
		//返回酒店超链接列表
		return list_hotel_href;
	}
}
