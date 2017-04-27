package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule35 extends Rule {
    @Override
    public boolean isValid(String x) {
    String nguyenam35_1 = "é ẹ ";
    String nguyenam35_2 = "e è ẻ ẽ";
    String phuam1 = "n m o";
    String phuam2 = "n m t c p o";

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

        return ("Các nguyên âm được phép sau \"e\", \"é\", \"è\", \"ẻ\", \"ẹ\", \"ẽ\" thì chỉ có: \"o\"");
    }
}
