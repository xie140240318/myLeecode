package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class baidu002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int T=in.nextInt();
            List<List<Integer>> list=new ArrayList<>();

            for(int t=0;t<T;t++){
                List<Integer> curr=new ArrayList<>();
                int N=in.nextInt();//奶牛数量
                int M=in.nextInt();//特性数量
                int [] feature=new int [N];
                for(int m=0;m<M;m++){
                    int K=in.nextInt();//每种特性的个区间
                    for(int k=0;k<K;k++){
                        int left=in.nextInt();
                        int right=in.nextInt();
                        for(int index=left-1;index<right;index++){
                            feature[index]++;
                        }
                    }
                }
                for(int n=0;n<N;n++){
                    if(feature[n]==M){
                        curr.add(n+1);
                    }
                }
                list.add(curr);
            }
            for(List<Integer> curr:list){
                System.out.println(curr.size());
                StringBuilder stringBuilder=new StringBuilder();

                String nums[]=new String[curr.size()];
                for(int i=0;i<curr.size();i++){
                    nums[i]= String.valueOf(curr.get(i));
                }
                Arrays.sort(nums);

                for(String number:nums){
                    stringBuilder.append(number);
                    stringBuilder.append(' ');
                }
                if(stringBuilder.length()>0){
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                    System.out.println(stringBuilder);
                }

            }
        }
    }
}
