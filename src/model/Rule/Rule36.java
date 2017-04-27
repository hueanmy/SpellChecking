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
public class Rule36 extends Rule {

    public String ShowError() {
        return ("Rule 36: Đi sau nguyên âm ơ ớ ờ ở phải là i hoặc u trong hươu và bướu");
    }

    public boolean isValid(String x) {
        String list = "ơớờở";
        for (int i = 0; i < x.length() - 1; i++) {
            if (list.contains(x.charAt(i) + "") && nguyenam.contains(x.charAt(i + 1) + "")) {
                if (x.equalsIgnoreCase("bướu")) {
                    return true;
                } else if (x.equalsIgnoreCase("hươu")) {
                    return true;
                } else if ((x.charAt(i + 1) + "").equalsIgnoreCase("i")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
