package cn.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProblemL {
	public class poly{
		int exp;//指数
		int coef;//系数
		public poly(int exp,int coef){
			this.exp=exp;
			this.coef=coef;
		}
	}	
	public void excution(){
		Scanner sc=new Scanner(System.in);
		List<poly> p1=new ArrayList<poly>();
		List<poly> p2=new ArrayList<poly>();
		List<poly> pSum=new ArrayList<poly>();
		while(true){
			poly p=new poly(sc.nextInt(),sc.nextInt());
			if(p.exp==0&&p.coef==0) break;
			p1.add(p);
			
		}
		while(true){
			poly p=new poly(sc.nextInt(),sc.nextInt());
			if(p.exp==0&&p.coef==0) break;
			p2.add(p);			
		}
		int i0=0;
		int j0=0;
		while(p1.size()>0){
			
			if(p1.get(i0).exp==p2.get(j0).exp){
				poly p=new poly(p1.get(i0).exp,p1.get(i0).coef+p2.get(j0).coef);
				pSum.add(p);
				p1.remove(i0);
				p2.remove(j0);
				i0=0;
				j0=0;
			}else{
				j0++;
				if(j0==p2.size()) {
					poly p=new poly(p1.get(i0).exp,p1.get(i0).coef);
					pSum.add(p);
					p1.remove(i0);	
					j0=0;
				}
			}
		}
		for(int i=0;i<p2.size();i++){
			pSum.add(p2.get(i));
		}
		
		Collections.sort(pSum, new Comparator<poly>() {

			@Override
			public int compare(poly o1, poly o2) {
				// TODO Auto-generated method stub
				if(o1.exp<o2.exp) return 1;
				else return -1;
			}
		});
		for(int i=0;i<pSum.size();i++){
			System.out.println(pSum.get(i).exp+" "+pSum.get(i).coef);
		}
	}
	public static void main(String[] args) {
		new ProblemL().excution();;
	}
}


