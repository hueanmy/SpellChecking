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
public class Rule29 extends Rule{

    public String showError() {
        return("Rule 29: Đi sau nguyên âm e é è ẻ ẹ ẽ chỉ có o");
    }

    @Override
    public boolean isValid(String x) {
        String list = "eéèẻẹẽ";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i) + "") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("o")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
