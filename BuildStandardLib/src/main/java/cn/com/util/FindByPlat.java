package cn.com.util;
//输入参数搜索每个区域的酒店
public class FindByPlat {
	static String city="西安";//城市
	static String area="新城区";//区域
	static String platform="艺龙";//搜索平台	
	static SearchCriteria s=new SearchCriteria();
	//输入城市和区域搜索酒店
	public static SearchCriteria FindHotelByArea() {		
		switch (platform) {
		case "携程":
			//进入到携程的搜索页进行操作
			s.setURL("http://hotels.ctrip.com/");
			//模拟输入搜索城市和区域进行酒店搜索
			s.setCity(city);
			s.setArea(area);			
			break;
		case "大众点评":
			
			break;
		case "美团":
			s.setURL("http://hotel.meituan.com/");
			s.setCity(city);
			s.setArea(area);			
			break;
		case "艺龙":
			s.setURL("http://hotel.elong.com/");
			s.setCity(city);
			s.setArea(area);
			break;
		case "阿里旅行":
			s.setURL("http://www.fliggy.com/jiudian/");
			s.setCity(city);
			s.setArea(area);
			break;
		case "去哪儿":
			s.setURL("http://hotel.qunar.com");
			s.setCity(city);
			s.setArea(area);
			break;
		default:
			break;
		}
		return s;
	}

}
