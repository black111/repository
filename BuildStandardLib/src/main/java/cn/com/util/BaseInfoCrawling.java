package cn.com.util;

import java.util.ArrayList;
import java.util.List;

import com.hotelInfo.data.XC;

public class BaseInfoCrawling {	
	public static void main(String[] args) {
		//
		GetSourcePage get=new GetSourcePage();
		//按城市和区域进行模拟点击，返回一个url
		String url=SearchHotelurl.SimuClickXC(FindByPlat.FindHotelByArea());
		System.out.println(url);
		List<String> list=new ArrayList<String>();
		XC baseinfo=new XC();
		//抓取这个区域酒店的href
		list=baseinfo.crawlingHref(url);		
		String html="";
		for(int i=0;i<list.size();i++){
			//获得每个酒店的源码
			try{
				html=get.getHtml(list.get(i));
			}catch(Exception e){
				e.printStackTrace();
				continue;
			}			
			//得到酒店的信息
			XC.parse(html);			
		}
	}
}
