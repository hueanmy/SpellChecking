package model.Rule;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule13 extends Rule{

    public String ShowError() {
        return("Rule 13: Phụ âm đứng cuối phải là nh, ch hoặc ng");
    }

    public boolean isValid(String x) {
        String lastC = x.length()>1?x.charAt(x.length()-1)+"":"";
        String nearLastC = x.length()>1?x.charAt(x.length()-2)+"":"";
        if(lastC.equalsIgnoreCase("h")){
            if(nearLastC.equalsIgnoreCase("n")||nearLastC.equalsIgnoreCase("c")){
                return true;
            } return false;
        } else if(lastC.equalsIgnoreCase("g")){
            if(nearLastC.equalsIgnoreCase("n")){
                return true;
            } else return false;
        }
        return true;
    }
    
}
