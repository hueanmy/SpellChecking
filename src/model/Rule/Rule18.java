package model.Rule;

import static model.Rule.Define_Character.nguyenam;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule18 extends Rule{

    public String ShowError() {
        return("Rule 18: Đi kèm với ả phải là i, o, y: ải, ảo, ảy");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("ả") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("i")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("o")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("y")) {
                    return true;
                }else if((x.charAt(i + 1) + "").equalsIgnoreCase("u")
                        &&(i-2)>-1&&(x.charAt(i-1)+"").equalsIgnoreCase("h")
                        &&(x.charAt(i-2)+"").equalsIgnoreCase("n")){
                    return true;
                }  else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
