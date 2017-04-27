package model.Rule;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class Rule14 extends Rule {

    public String ShowError() {
        return("Rule 14: Nguyên âm sau a không hợp lệ");
    }

    public boolean isValid(String x) {
        String nguyenam = "eyuioa" + "èéẹẻẽ" + "ê" + "ềếệểễ" + "ùúụủũ"
                + "ư" + "ừứựừữ" + "ìíịỉĩ" + "òóọỏõ" + "ô" + "ồốộổỗ" + "ơ" + "ờớợởỡ"
                + "àáạảã" + "â" + "ầấậẩẫ" + "ă" + "ằắặẳẵ" + "ỳýỵỷỹ";
        for (int i = 0; i < x.length() - 1; i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("a") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if ((x.charAt(i + 1) + "").equalsIgnoreCase("a")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("ô")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("ê")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("ư")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("ơ")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("ă")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("â")
                        || (x.charAt(i + 1) + "").equalsIgnoreCase("e")) {
                    return false;
                }
            }
        }
        return true;
    }

}
