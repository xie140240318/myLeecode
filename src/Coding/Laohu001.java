package Coding;

import java.util.Arrays;
import java.util.Scanner;

public class Laohu001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str=in.next();
            int len=str.length();
            int[][] count=new int [26][2];

            //0-25代表字母
            for(int i=0;i<26;i++)
                count[i][0]=i;

            char []c=str.toCharArray();
            for(char cc:c){
                if(cc<='z'&&cc>='a')
                    count[cc-'a'][1]++;
            }

            Arrays.sort(count,(a,b)->b[1]-a[1]);

            System.out.print("\"");
            for(int i=0;i<26;i++){
                char curr= (char) ('a'+count[i][0]);
                int num=count[i][1];
                for(int j=0;j<num;j++)
                    System.out.print(curr);
            }
            System.out.print("\"");
        }
    }
}
