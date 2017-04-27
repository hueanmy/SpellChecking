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
public class Rule4 extends Rule {

    public String ShowError() {
        return ("Rule 4: Từ phải có tối thiểu 1 nguyên âm");
    }

    public Rule4() {
    }

    public boolean isValid(String x) {
        int count = 0;
        for (int j = 0; j < x.length(); j++) {
            if (nguyenam.contains(x.charAt(j) + "")) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

}
