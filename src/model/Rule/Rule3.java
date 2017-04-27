package model.Rule;

import static model.Rule.Define_Character.VietnameseCharacters;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luc Hoang
 */
public class Rule3 extends Rule {

    @Override
    public String showError() {
        return("Rule 3: Không thể xuất hiện từ này trong tiếng Việt");
    }

    @Override
    public boolean isValid(String x) {
        for (int j = 0; j < x.length(); j++) {
            if (!VietnameseCharacters.contains(x.charAt(j) + "")&&!VietnameseCharacters.toUpperCase().contains(x.charAt(j) + "")) {
                return false;
            }
        }
        return true;
    }

}
