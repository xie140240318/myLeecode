package Coding;

import java.util.Scanner;

public class TX003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int T=in.nextInt();
            int [] Val=new int[T];

            for(int i=0;i<T;i++){
                String curr=String.valueOf(in.next());
                if(curr=="0"){
                    Val[i]=0;
                }else{
                    int temp=0;
                    for(int j=0;j<curr.length();j++){
                        temp+=curr.charAt(j)-'0';
                        if(curr.charAt(j)-'0'==9&&(j!=0))
                            temp-=9;
                    }
                    temp+=9*(curr.length()-1);
                    Val[i]=temp;
                }

            }
            for(int i=0;i<T;i++){
                System.out.println(Val[i]);
            }


//            for(int i=0;i<T;i++){
//                int curr=in.nextInt();
//                int temp=0;
//                while(curr>0){
//                    if(curr>10){
//                        temp+=9;
//                    }
//                    temp+=curr%10;
//                    curr/=10;
//                }
//                Val[i]=temp;
//            }
//            for(int i=0;i<T;i++){
//                System.out.println(Val[i]);
//            }
        }
    }
}
