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
public class Rule35 extends Rule{
    public String ShowError() {
        return("Rule 35: Đi sau nguyên âm ó ò ỏ ọ phải là e, i hoặc a");
    }

    public boolean isValid(String x) {
        String list = "óòỏọ";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i) + "") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("e")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("i")
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
