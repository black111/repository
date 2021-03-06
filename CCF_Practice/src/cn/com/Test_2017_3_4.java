package cn.com;  
  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Scanner;  
  
public class Test_2017_3_4 {  
  
    int [] par;  
    int [] rank;  
      
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner scan=new Scanner(System.in);  
        int n=scan.nextInt();  
        int m=scan.nextInt();  
        Edge [] es=new Edge[m];  
        ArrayList<Edge> alist=new ArrayList<Edge>();  
        for(int i=0;i<m;++i){  
            es[i]=new Edge(scan.nextInt(),scan.nextInt(),scan.nextInt());  
            alist.add(es[i]);  
        }  
          
        Test_2017_3_4 f=new Test_2017_3_4();  
        f.par=new int[n+5];  
        f.rank=new int[n+5];  
        f.init(n);  
        Collections.sort(alist);  
        for(int i=0;i<alist.size();++i){  
            f.unite(alist.get(i).a,alist.get(i).b);  
            if(f.same(1, n)){  
                System.out.println(alist.get(i).day);  
                return;  
            }  
        }  
    }  
      
    public void init(int n){  
        for(int i=1;i<=n;++i){  
            par[i]=i;  
            rank[i]=0;  
        }  
    }  
      
    public int find(int x){  
        if(par[x]==x){  
            return x;  
        }  
        else{  
            return par[x]=find(par[x]);  
        }  
    }  
      
    public void unite(int x,int y){  
        x=find(x);  
        y=find(y);  
        if(x==y){  
            return ;  
        }  
        if(rank[x]<rank[y]){  
            par[x]=y;  
        }  
        else{  
            par[y]=x;  
            if(rank[x]==rank[y]){  
                rank[x]++;  
            }  
        }  
    }  
      
    public boolean same(int x,int y){  
        return find(x)==find(y);  
    }  
  
}  
  
  
class Edge implements Comparable<Edge>{  
      
    int a;  
    int b;  
    int day;  
  
    Edge(int a,int b,int day){  
        this.a=a;  
        this.b=b;  
        this.day=day;  
    }  
      
    public int compareTo(Edge e){  
        if(this.day<e.day){  
            return -1;  
        }  
        else if(this.day>e.day){  
            return 1;  
        }  
        else{  
            return 0;  
        }  
    }  
}  