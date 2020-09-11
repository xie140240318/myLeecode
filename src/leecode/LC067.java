package leecode;

public class LC067 {
    public String addBinary(String a, String b) {
        if(a==null||a.length()==0){
            if(b==null||b.length()==0)
                return "0";
            else
                return b;
        }
        if(b==null||b.length()==0){
            if(a==null||a.length()==0)
                return "0";
            else
                return a;
        }

        return "";


    }
}
