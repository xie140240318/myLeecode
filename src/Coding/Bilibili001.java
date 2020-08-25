package Coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bilibili001 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//
//        }
//
//    }
    public boolean IsValidExp (String s) {
        char[] ss=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:ss){
            if((c==']'&&stack.peek()=='[')||(c==')'&&stack.peek()=='(')||(c=='}'&&stack.peek()=='{')){
                    stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;

    }


    public int GetCoinCount (int N) {
        int ans=0;
        int money=1024-N;
        ans+=money/64;
        money%=64;
        ans+=money/16;
        money%=16;
        ans+=money/4;
        money%=16;
        ans+=money/16;
        money%=4;

        ans+=money;

        return ans;
    }

    public boolean Game24Points (int[] arr) {

            Queue queue=new LinkedList();
        return true;
    }


}
