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
public class Rule28 extends Rule {

    public String ShowError() {
        return("Rule 28: Đi sau nguyên âm ỉ, ì, ị, ĩ, í phải là u hoặc a");
    }

    public boolean isValid(String x) {
        String list = "ỉìịĩí";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i) + "") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("u")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("a")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
