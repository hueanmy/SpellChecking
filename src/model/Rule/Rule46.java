/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

/**
 *
 * @author katie
 */
public class Rule46 extends Rule {

    public String ShowError() {
        return "Rule 46: Sau ngh và gh phải là i hoặc e";
    }

    public boolean isValid(String x) {
        String to_hop_e = "eéèẻẹẽêệễểềế";
        String to_hop_i = "iíìỉịĩ";
        for(int i = 0;i<x.length();i++){
            if(x.length()>3&&(x.charAt(0)+"").equalsIgnoreCase("n")&&(x.charAt(1)+"").equalsIgnoreCase("g")&&(x.charAt(2)+"").equalsIgnoreCase("h")){
                if(to_hop_i.contains(x.charAt(3)+"")||to_hop_e.contains(x.charAt(3)+"")){
                    return true;
                } else return false;
            } else if(x.length()>2&&(x.charAt(0)+"").equalsIgnoreCase("g")&&(x.charAt(1)+"").equalsIgnoreCase("h")){
                if(to_hop_i.contains(x.charAt(2)+"")||to_hop_e.contains(x.charAt(2)+"")){
                    return true;
                } else return false;
            }
        }
        return true;
    }
    
}



