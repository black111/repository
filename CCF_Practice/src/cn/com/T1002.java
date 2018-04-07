package cn.com;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T1002 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			if(map.containsKey(num)){
				int m=map.get(num);
				m++;
				map.put(num, m);
			}
			else{
				map.put(num, 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>>list_data=new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list_data, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer>o2){
				if(o2.getValue().compareTo(o1.getValue())>0){
					return 1;
				}else if(o2.getValue().compareTo(o1.getValue())==0){
					if(o2.getKey().compareTo(o1.getKey())<0){
						return 1;
					}else{
						return -1;
					}
				}else{
					return -1;
				}
			}
		});
//		System.out.println(list_data);
		for(Map.Entry<Integer, Integer> v:list_data){
			System.out.println(v.getKey()+" "+v.getValue());
		}
	}
}
