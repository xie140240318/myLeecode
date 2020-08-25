package Coding;

import java.util.Scanner;

public class MT002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            String initC=" ";
            int count=0;
            for(int i=0;i<n;i++){
                String beginC=in.next();
                String endC=in.next();
                if(initC.equals(" ")){

                    initC=beginC;
                    if(initC.equals(endC)){
                        initC=" ";
                        count++;
                    }

                }else{
                    if(initC.equals(endC)){
                        initC=" ";
                        count++;
                    }

                }
            }
            System.out.println(count);
        }
    }
}
