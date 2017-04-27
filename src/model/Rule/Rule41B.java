package model.Rule;

import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule41B extends Rule{
    @Override
    public boolean isValid(String x) {
        if(vowelsCount(x)==2){
            for(int i=0; i<x.length()-1; i++){
                if((x.charAt(i)+"").equalsIgnoreCase("ỡ")){
                    if((x.charAt(i+1)+"").equalsIgnoreCase("i")){
                        if(x.equalsIgnoreCase("hỡi")) {
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
    public String showError() {

        return ("Rule41B:\tNguyên âm \"ỡ\" nếu đi sau nó là \"i\" thì từ đó phải là \"hỡi\"");
    }
}
