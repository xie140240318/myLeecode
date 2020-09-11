package Coding;

import java.util.Scanner;

public class baidu01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int countNine=0;
            int countZero=0;
            for(int i=0;i<n;i++){
                int temp=in.nextInt();
                if(temp==0){
                    countZero++;
                }else{
                    countNine++;
                }
            }
            if(countZero<1){
                System.out.println("-1");
            }else if(countNine<9){
                System.out.println("0");
            }else {
                StringBuilder stringBuilder=new StringBuilder();
                int finalNine=countNine-countNine%9;
                for(int i=0;i<finalNine;i++){
                    stringBuilder.append('5');
                }
                for(int i=0;i<countZero;i++){
                    stringBuilder.append('0');
                }
                System.out.println(stringBuilder);
            }


        }
    }

}
