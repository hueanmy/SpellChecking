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
public class Rule37 extends Rule{
    public String ShowError() {
        return("Rule 37: Đi sau nguyên âm ô ố ồ ổ ộ ỗ phải là i");
    }

    public boolean isValid(String x) {
        String list = "ôốồổộỗ";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i) + "") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("i")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
