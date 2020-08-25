package Coding;

public class tets0824 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder);



    }
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}
