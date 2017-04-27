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
public class Rule23 extends Rule{
    public String ShowError() {
        return("Rule 23: Đi kèm với ẫ phải là u, y: ẫu, ấy");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("ẫ") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("u")
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
