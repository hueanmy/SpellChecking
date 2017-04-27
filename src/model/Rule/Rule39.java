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
public class Rule39 extends Rule{
    public String ShowError() {
        return("Rule 39: Đi sau nguyên âm ú ù ủ ụ là i a y");
    }

    public boolean isValid(String x) {
        String list ="úùủụ";
        String list2 = "iay";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i)+"") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if (list2.contains(x.charAt(i+1)+"")) {
                    return true;
                }  else {
                    return false;
                }
            }
        }
        return true;
    }
}
