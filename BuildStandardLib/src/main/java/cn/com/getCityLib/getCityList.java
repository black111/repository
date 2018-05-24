package cn.com.getCityLib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class getCityList {
	static String urlDZ="https://www.dianping.com/ajax/json/index/citylist/getCitylist?do=allCitylist&_nr_force=1499311785902";
	static String urlMT="http://www.meituan.com/index/changecity/initiative?mtt=2.index%2Ffloornew.0.0.j4ruvt0m";
	List<String> list=new ArrayList<String>();
	String jsonstr = "";
	
	public static void getDZcityList() throws MalformedURLException, IOException{
		BufferedReader bis = null;
		HttpURLConnection conn=(HttpURLConnection) new URL(urlDZ).openConnection();
		conn.connect();
		bis=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer result=new StringBuffer();
		String line = null;

		try {
			while((line= bis.readLine())!=null){
				result.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.toString());
		//JsonArray array=json.get("msg").getAsJsonArray();
		JSONObject json = null;
		try {
			json = new JSONObject(result.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			JSONObject object=(JSONObject) json.get("msg");
			JSONArray cityList=(JSONArray) object.get("html");

			
			for(int i=0; i<cityList.length();i++){
				
				String city=cityList.get(i).toString();
				String cityPinyin="";
				String cityName="";
				Pattern p=Pattern.compile("[\u4E00-\u9FFF]+");
				Matcher m=p.matcher(city);
				if(m.find()){
					cityName=m.group(0);
				}
				
			
				//可以写入文件
				//System.out.println(cityPinyin);
				System.out.println(city);
			}
			//System.out.println(cityList);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<String> getMTcityList(String html) throws MalformedURLException, IOException {
		List<String> list=new ArrayList<>();
		BufferedReader bis = null;
		HttpURLConnection conn=(HttpURLConnection) new URL(urlMT).openConnection();
		conn.connect();
		bis=new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer result=new StringBuffer();
		String line = null;

		try {
			while((line= bis.readLine())!=null){
				result.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.toString());
		Document doc=Jsoup.parse(result.toString());
		Elements ele=doc.getElementsByClass("hasallcity");
		for(int i=0;i<ele.size();i++){
			Elements citys=ele.get(i).getElementsByTag("a");
			for(int j=0;j<citys.size();j++){
				
				String cityHref=citys.get(j).attr("href");
				String cityName=citys.get(j).text();
				System.out.println(cityHref+"  |  "+cityName);
				list.add(cityName+"|"+cityHref);
			}
		}
		return list;
	}
	public static void main(String[] args) throws MalformedURLException, IOException {
		getCityList.getDZcityList();
	}
}