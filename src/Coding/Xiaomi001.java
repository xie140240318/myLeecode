package Coding;

import java.util.Scanner;

public class Xiaomi001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String pwds[]=in.next().split(" ");
            for(String pwd:pwds){
                int len=pwd.length();
                if(len<8||len>120){
                    System.out.println("1");
                }else{
                    System.out.println(solve(pwd));
                }
            }
        }
    }

    private static String solve(String pwd) {
        char chars[]=pwd.toCharArray();
        boolean upCase=false;
        boolean lowCase=false;
        boolean numCase=false;
        boolean otherCase=false;
        for(char c:chars){
            if(c<='Z'&&c>='A'){
                upCase=true;
            }else if(c<='z'&&c>='a'){
                lowCase=true;
            }else if(c<='9'&&c>='0'){
                numCase=true;
            }else
                otherCase=true;
        }
        if(upCase&&lowCase&&numCase&&otherCase)
            return "0";
        else
            return "2";

    }
}
