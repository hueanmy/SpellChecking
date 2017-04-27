package model.Rule;

import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule37 extends Rule {
    @Override
    public boolean isValid(String x) {
        if(vowelsCount(x)==2){
            for(int i=0; i<x.length()-1; i++){
                if((x.charAt(i)+"").equalsIgnoreCase("ễ")){
                    if((x.charAt(i+1)+"").equalsIgnoreCase("u")){
                        if(x.equalsIgnoreCase("tễu") || x.equalsIgnoreCase("phễu")) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String showError () {

        return ("Rule37:\tNguyên âm \"ễu\" chỉ được phép đi trong từ \"Tễu\" và \"phễu\"");
    }
}