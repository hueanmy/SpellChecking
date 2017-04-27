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
public class Rule8 extends Rule {

    public String ShowError() {
        return "Rule 8: Nguyên âm trước t hoặc p phải là nguyên âm có dấu nặng hoặc sắc";
    }

    public boolean isValid(String x) {
        String list = "éẹếệúụứựíịóọốộớợáạấậắặỵý";
        for (int i = 1; i < x.length(); i++) {
            if ((x.charAt(i) + "").equalsIgnoreCase("t") || (x.charAt(i) + "").equalsIgnoreCase("p") && x.length() > 1) {
                if (list.contains(x.charAt(i - 1) + "")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
