package cn.zr.JZoffer;

public class JumpFloor1 {
    public static void main(String[] args) {

    }
    public int jumpfloor(int target){
        int count=2;
        int a =1;
        int b =1;
        int c =0;
        if(target>2){
            while (count !=target){
                c=b;
                b=a;
                a=b+c;
                count++;
            }
        }else if (target==1||target==2){
            return 1;
        }else{
            return 0;
        }
        return a;

    }
}
