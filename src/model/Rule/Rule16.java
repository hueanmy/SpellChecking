package model.Rule;

import static model.Rule.Define_Character.nguyenam;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luc Hoang
 */
public class Rule16 extends Rule{

    public String ShowError() {
        return("Rule 16: Đi kèm với ã phải là i, o, y: ãi, ão, ãy");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("ã") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("i")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("o")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("y")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
