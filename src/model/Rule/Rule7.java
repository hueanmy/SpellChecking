package model.Rule;

import static model.Rule.Define_Character.phu_am;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule7 extends Rule{

    public String ShowError() {
        return("Rule 7: Một từ tiếng việt có tối đa 5 phụ âm");
    }

    public boolean isValid(String x) {
        int count = 0;
        for(int i=0;i<x.length();i++){
            if(phu_am.contains(x.charAt(i)+"")){
                count++;
            }
        }
        if(count>5){
            return false;
        } else return true;
    }
    
}
