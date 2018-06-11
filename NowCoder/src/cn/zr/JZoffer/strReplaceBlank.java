package cn.zr.JZoffer;

public class strReplaceBlank {
    public static void main(String[] args) {
        String s="helloworld ";
        StringBuffer s1 =new StringBuffer(s);
        System.out.println(s1);
        String ss= new strReplaceBlank().replaceSpace(s1);
        System.out.println(ss);
    }

    public String replaceSpace(StringBuffer str) {

        StringBuffer newstr =new StringBuffer();
        for (int i =0;i<str.length();i++){
            if (str.substring(i,i+1).equals(" ")) {
               str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
