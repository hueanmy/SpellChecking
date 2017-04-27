/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.VietnameseCharacters;

/**
 *
 * @author katie
 */
public class Rule3 extends Rule {

    @Override
    public boolean isValid(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (VietnameseCharacters.contains(x.charAt(i) + "")) {
                return true;
            }
        }
        return true;
    }

    public String showError() {
        return("Rule3:\tchữ cái này không tồn tại trong bảng chữ cái tiếng Việt");
    }
    
}
