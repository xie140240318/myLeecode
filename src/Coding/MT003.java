package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MT003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int m=in.nextInt();

            boolean[] book=new boolean[n+1];
            List<List<Integer>> list=new ArrayList<>();
            for(int i=0;i<m;i++){
                int one=in.nextInt();
                int two=in.nextInt();
                if(book[one]==false&&book[two]==false){
                    book[one]=true;
                    book[two]=true;
                    List<Integer> temp=new ArrayList<>();
                    temp.add(one);
                    if(one==two)
                        temp.add(two);
                    list.add(temp);
                }else if(book[one]==false){
                    book[one]=true;
                    //List<Integer> temp=new ArrayList<>();
                    for(List curr:list){
                        if(curr.contains(two)){
                            curr.add(one);
                            break;
                        }
                    }
                }else if(book[two]==false){
                    book[two]=true;
                    for(List curr:list){
                        if(curr.contains(one)){
                            curr.add(two);
                            break;
                        }
                    }
                }else{
                    List<Integer> temp1=new ArrayList<>();
                    List<Integer> temp2=new ArrayList<>();
                    for(List curr:list){
                        if(curr.contains(one)){
                            temp1=curr;
                        }
                        if(curr.contains(two)){
                            temp2=curr;
                        }
                    }
                    if(temp1!=temp2){
                        list.remove(temp2);
                        temp1.addAll(temp2);
                    }
                }
            }
            for(int i=1;i<=n;i++){
                if(book[i]==false){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    list.add(temp);
                }
            }

            System.out.println(list.size());
            //List<List<List<Integer>>> arrayList=Arrays.asList(list);
            for(List curr:list){
                for(Object nums:curr){
                    System.out.print(curr);
                }

            }
        }
    }
}
