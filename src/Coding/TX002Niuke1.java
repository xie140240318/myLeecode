package Coding;

import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        int k=sc.nextInt();

        List<Character> pp=get(p);
        Collections.sort(pp);
        String qq=getI(pp);
        if(qq.length()>6){
            qq=qq.substring(1,6);//最关键的一步。。。因为k最多也就是5.。所以如果一两万长度去后面操作就超内存
        }

        // System.out.println(qq2);
        //System.out.println(qq);
        List<String> res=help(qq);
        //  System.out.println(res.size());
        // System.out.println(res);
        Set<String> set=new HashSet<>();

        for (int i = 0; i < res.size(); i++) {
            set.add(res.get(i));
        }
        // System.out.println(set.size());
        List<String> b=new ArrayList<>();
        Object[] set2=set.toArray();
        for (int i = 0; i < set.size(); i++) {
            b.add((String) set2[i]);
        }
        Collections.sort(b);

        System.out.println(b.get(k-1));


    }
    static String getI(List<Character> a){
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < a.size(); i++) {
            res.append(a.get(i));
        }
        return res.toString();
    }
    static List<Character> get(String b){
        List<Character> res=new ArrayList<>();
        for (int i = 0; i <b.length() ; i++) {
            res.add(b.charAt(i));
        }
        return res;
    }
    static List<String> help(String a){
        List<String> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i <= a.length(); i++) {
            for (int j = i+1; j <= a.length(); j++) {
                String b=a.substring(i,j);
                if(!map.containsKey(b)){
                    map.put(b,1);
                    res.add(b);
                }else {
                    map.put(b,1);
                }
            }
            // System.out.println(b);

        }
        return res;
    }

}