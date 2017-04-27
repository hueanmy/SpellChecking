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
public class Rule20 extends Rule {

    public String ShowError() {
        return("Rule 20: Đi kèm với â phải là u, y: âu, ây");
    }

    public boolean isValid(String x) {
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("â") && nguyenam.contains(x.charAt(i + 1) + "")) {
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
