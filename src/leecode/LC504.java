package leecode;

public class LC504 {
    public String convertToBase7(int num) {
        if(num<0){
            return '-'+convertToBase7(-num);
        }
        StringBuilder stringBuilder=new StringBuilder();
        while(num>=7){
            int temp=num%7;
            num/=7;
            stringBuilder.insert(0,temp);
        }
        stringBuilder.insert(0,num);
        return stringBuilder.toString();
    }
}
