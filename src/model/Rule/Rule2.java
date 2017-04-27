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
public class Rule2 extends Rule {

    public String ShowError() {
        return ("Rule 2: Không thể xuât hiện từ này trong Tiếng Việt");
    }

    public boolean isValid(String x) {
        String firstConsonants = "w z j f";
        for (int j = 0; j < x.length(); j++) {
            if (firstConsonants.contains(x.charAt(j) + "")) {
                return false;
            }
        }
        return true;
    }

}
