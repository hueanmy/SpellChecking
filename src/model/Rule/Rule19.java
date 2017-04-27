package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule19 extends Rule{
    @Override
    public boolean isValid(String x) {
        if(vowelsCount(x)==2){
            for(int i=0; i<x.length()-1; i++){
                if((x.charAt(i)+"").equalsIgnoreCase("ả") && nguyenam.contains(x.charAt(i+1)+"")){
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("i")
                            || (x.charAt(i + 1) + "").equalsIgnoreCase("o")
                            || (x.charAt(i + 1) + "").equalsIgnoreCase("y")) {
                        return true;
                    } 
                    if((x.charAt(i+1)+"").equalsIgnoreCase("u")){
                        if(x.equalsIgnoreCase("nhảu")){
                            return true;
                        }
                        else return false;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String showError() {

        return ("Rule19:\tNếu có \"ảu\" thì từ này bắt buộc phải nằm trong từ \"nhảu\"");
    }
}
