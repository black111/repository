package cn.com.Url;

import java.util.List;

import org.cyberneko.html.filters.Writer;
import org.openqa.selenium.WebDriver;

import com.hotelInfo.data.DZ;
import com.hotelInfo.data.MT;
import com.hotelInfo.data.QN;
import com.hotelInfo.data.XC;
import com.hotelInfo.data.YL;
import com.other.tools.WriteToFile;

import cn.com.util.Drive;
import cn.com.util.FindByPlat;
import cn.com.util.SearchHotelurl;

public class crawlingURL {
	public static void main(String[] args) throws InterruptedException {
//		String url=new SearchHotelurl().SimuClickXC(FindByPlat.FindHotelByArea());
//		List<String> href=new XC().crawlingHref(url);
//		for(int i=0;i<href.size();i++){
//			System.out.println(href.get(i));
//			
//		}
		//String url=new SearchHotelurl().SimuClickYL(FindByPlat.FindHotelByArea());
		String url="http://hotel.qunar.com/city/xian/q-"+"新城区";
		List<String> href=new QN().crawlingHref(url);
		for(int i=0;i<href.size();i++){
			System.out.println(href.get(i));
			
		}
	}
}
