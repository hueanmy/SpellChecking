package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule36 extends Rule {
    @Override
    public boolean isValid(String x) {
    String nguyenam35_1 = "ế ệ";
    String nguyenam35_2 = "ê ề";
    String phuam1 = "n m u";
    String phuam2 = "n m t c p u";

    for(int i=0;i<x.length()-1;i++){
        if(nguyenam35_1.contains(x.charAt(i)+"")){
            if(!phuam2.contains(x.charAt(i+1)+""))
                return false;
        }
        else if (nguyenam35_2.contains(x.charAt(i)+"")){
            if(!phuam1.contains(x.charAt(i+1)+""))
                return false;
        }
    }

        return true;
    }

    @Override
    public String showError() {

        return ("Các nguyên âm được phép sau \"ê\", \"ế\", \"ề\", \"ệ\",  thì chỉ có: \"u\"");
    }
}
