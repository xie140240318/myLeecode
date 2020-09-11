package Coding;

import java.util.Scanner;

public class Qihu001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N=in.nextInt();
            int M=in.nextInt();
            int recode[][]=new int [M][2];
            int person[]=new int[N+1];
            boolean nothead=false;
            boolean notend=false;

            //1代表上班卡。0代表下班卡
            for (int i = 0; i < M; i++) {
                recode[i][0]=in.nextInt();
                recode[i][1]=in.nextInt();
                if(person[recode[i][0]]==0){//未上班
                    if(recode[i][1]==1){
                        person[recode[i][0]]=1; //表示正常上班卡
                    }else{
                        person[recode[i][0]]=3;//表示无上班卡的下班卡
                        nothead=true;
                    }
                }else{
                    if(recode[i][1]==1&&person[recode[i][0]]==1){
                        person[recode[i][0]]=2;//表示正常下班卡
                    }
                }
            }

            for (int i = 1; i <= N; i++) {
                if(person[i]==1){
                    notend=true;
                    break;
                }
            }
            StringBuilder stringBuilder=new StringBuilder();
            if(notend&&nothead){

            }else if(notend){
                if(person[recode[0][0]]==1){
                    person[recode[0][0]]=0;
                }
            }else if(nothead){
                if(person[recode[M-1][0]]==3){
                    person[recode[M-1][0]]=0;
                }
            }else{
                if(recode[M-1][0]==recode[0][0]){
                    person[recode[M-1][0]]=0;
                }
            }
            for (int i = 1; i <=N ; i++) {
                if(person[i]==0){
                    stringBuilder.append(i+" ");
                }
            }
            if(stringBuilder.length()>0)
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            System.out.println(stringBuilder);
        }
    }
}
