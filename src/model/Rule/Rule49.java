/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

/**
 *
 * @author katie
 */
public class Rule49 extends Rule {

    String list_khong_dau = "aăâeêyuưioôơ";

    public String ShowError() {
        return "Rule 49: Trước c phải là nguyên âm có dấu";
    }

    public boolean isValid(String x) {
        if (x.length() > 1) {
            for (int i = 1; i < x.length(); i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("c")) {
                    if (list_khong_dau.contains(x.charAt(i - 1) + "")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
