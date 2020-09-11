package Coding;

import java.util.Scanner;

public class Qihu002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            int len=str.length();
            boolean upCase=false;
            boolean lowCase=false;
            boolean numCase=false;
            boolean otherCase=false;
            if(len<8)
                System.out.println("Irregular password");
            else{
                for(int i=0;i<len;i++){
                    char c=str.charAt(i);
                    if(c>='0'&&c<='9')
                        numCase=true;
                    else if(c>='a'&&c<='z'){
                        lowCase=true;
                    }else if(c>='A'&&c<='Z'){
                        upCase=true;
                    }else
                        otherCase=true;
                }
                if(upCase&&lowCase&&numCase&&otherCase)
                    System.out.println("Ok");
                else
                    System.out.println("Irregular password");
            }
        }
    }
}
