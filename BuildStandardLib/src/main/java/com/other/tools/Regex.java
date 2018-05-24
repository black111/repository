package com.other.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static String getPhoneNum(String phone){
		if (phone != null) {
			Pattern p_phone=Pattern.compile("(电话)((\\d{3,4}-\\d{7,9})|(\\d{11}))");//用正则匹配电话号码
			Matcher m_phone=p_phone.matcher(phone);
			while(m_phone.find()){
				phone=m_phone.group(2);
			}
			return phone;
		}
		return phone;		
	}
}
