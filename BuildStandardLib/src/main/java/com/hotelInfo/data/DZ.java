package com.hotelInfo.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.other.tools.Regex;
import com.other.tools.WriteToFile;
import com.sql.entity.HotelInfo;

import cn.com.util.Drive;

public class DZ {
	public WebDriver driver=null;
	
		//解析酒店详情页
	public static void parse(String html){
		String hotel_code="";
		String phone="";
		String hotel_name="";
		String star_level="";
		String lnkLocation="";
		String lnkCity="";
		String lbAddress="";
		String lnkRoadCross="";
		Document doc=Jsoup.parse(html);
//			System.out.println(html);
		hotel_code=doc.select("a[data-id]").attr("data-id");//酒店代码
		hotel_name=doc.select("[itemprop=name]").text();//获取酒店名
		String Contact="";
		Contact=doc.select("[id=J_realContact]").attr("data-real").toString();//获取包含酒店电话的文本	
		phone=Regex.getPhoneNum(Contact);
		//酒店星级
		star_level =doc.select("[id=ctl00_MainContentPlaceHolder_commonHead_imgStar]").attr("title");
		//所在商圈
		lnkLocation=doc.select("[id=ctl00_MainContentPlaceHolder_commonHead_lnkLocation]").text();
		//所在市
		lnkCity=doc.select("span[itemprop=addressLocality]").text();		
		//所在街道
		lnkRoadCross=doc.select("span[id=ctl00_MainContentPlaceHolder_commonHead_lnkRoadCross]").text();
		//具体位置
		lbAddress=doc.select("span[id=ctl00_MainContentPlaceHolder_commonHead_lbAddress]").text();
		String address=lnkCity+" "+lnkLocation+" "+lbAddress+" "+lnkRoadCross;
		System.out.println("酒店代码："+hotel_code
							+" 酒店名称："+hotel_name
							+" 酒店电话："+phone
							+" 酒店星级："+star_level);
		System.out.println("所在商圈:"+lnkLocation
							+" 酒店地址："+address);
		HotelInfo hotel=new HotelInfo();
		hotel.setHotel_code(hotel_code);
		hotel.setHotel_name(hotel_name);
		hotel.setStar_level(star_level);
		hotel.setAddress(address);
		hotel.setPhone(phone);		
		WriteToFile w_hotel_info=new WriteToFile();
		w_hotel_info.writer2file("C:/Users/LivelyRong/Desktop/xc/上海静安区.txt", "酒店代码："+hotel_code
				+" 酒店名称："+hotel_name
				+" 酒店电话："+phone
				+" 酒店星级："+star_level+" 酒店地址："+address);
	}	
	public List<String> crawlingHref(String url){
		//定义存取超链接的列表
		List<String> list_hotel_href=new ArrayList<String>();
	    //打开一个新的浏览器
	    driver= Drive.webdriver();
		//获得连接
	    driver.get(url);
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		    //此区域的酒店源码
	    String html = driver.getPageSource();
	    Document doc=Jsoup.parse(html);
		int Maxpage=1;		
		//获得这个区域酒店的页数
		Elements pages=doc.select("a[data-ga-page]");
		Maxpage=Integer.parseInt(pages.last().attr("data-ga-page").toString());
		System.out.println(Maxpage);
		//获得所有页的酒店的超链接
		int count=0;
		for(int i=1;i<=7;i++){
			//从第一页的酒店开始解析
			Document doc1=Jsoup.parse(html);
			//获得此页酒店的超链接
			Elements hrefs_hotel=doc1.select("[class=\"hotel-block J_hotel-block\"]");			
			System.out.println(hrefs_hotel.size());
			//一页酒店的所有超链接
			String href="";
			
			for(int j=0;j<hrefs_hotel.size();j++){    
				//获得这一页所有酒店的超链接。。
				String hotel_code=hrefs_hotel.get(j).attr("data-shop-url");
//				String hotel_name=hrefs_hotel.get(j).attr("")
				list_hotel_href.add("https://www.dianping.com/shop/"+hotel_code+"/review_more");
				count++;
				if(j!=hrefs_hotel.size()-1){
					href+="https://www.dianping.com/shop/"+hotel_code+"/review_more"+'\n';					
		
				}else{
					href+="https://www.dianping.com/shop/"+hotel_code+"/review_more";
				}
			}
			System.out.println(href);
			WriteToFile w_href_toFile=new WriteToFile();
			w_href_toFile.writer2file("C:/Users/LivelyRong/Desktop/Url/dz.txt", href);
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
	public static void main(String[] args) {
		
	}
}
