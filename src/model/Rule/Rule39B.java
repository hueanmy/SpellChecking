package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule39B extends Rule {
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        String[] words = {"boong","xoong"};
        for(int i=0;i<x.length()-1;i++){
            if("o".contains(x.charAt(i)+"")){
                if("o".contains(x.charAt(i+1)+""))
                    check = true; break;
            }
        }
        if(check==true){
            for(String c : words){
                if(x.equals(c)){
                    check = true;
                }
                else
                    check= false;
            }
        }
        return check;
    }

    @Override
    public String showError() {

        return ("Cặp nguyên âm \"oo\" chỉ có thể thuộc về xoong, boong,");
    }
}
