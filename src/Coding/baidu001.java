package Coding;

public class baidu001 {

    class Node{
        int val;
        Node next;
    }

    public Node solve(Node node,int n){

        Node nplusNode;
        Node curr=node;
        for(int i=1;i<n;i++){
            curr=curr.next;
        }
        nplusNode=curr.next;
        curr.next=null;

        Node ans=fanzhuan(node);
        node.next=nplusNode;
        return ans;

    }

    public Node fanzhuan(Node node){
        if(node==null)
            return null;
        else if(node.next==null)
            return node;

        Node nextN=node.next;
        Node temp=nextN;
        node.next=fanzhuan(nextN);
        temp.next=null;

        return node;
    }
}
