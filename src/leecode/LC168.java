package leecode;

public class LC168 {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder=new StringBuilder();
        while (n>26){
            char temp=(char)(n%26+'A'-1);
            if(temp=='@'){
                stringBuilder.insert(0,'Z');
                n/=26;
                n--;
            }else{
                stringBuilder.insert(0,temp);
                n/=26;
            }

        }
        char temp=(char)(n+'A'-1);
        stringBuilder.insert(0,temp);
        return stringBuilder.toString();
    }
}
