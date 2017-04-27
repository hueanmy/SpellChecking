/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.VietnameseVowels;

/**
 *
 * @author dinhq
 */
public class Rule4 extends Rule {

    @Override
    public boolean isValid(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (VietnameseVowels.contains(x.charAt(i) + "")) {
                return true;
            }
        }
        return true;
    }

    @Override
    public String showError() {
        return("Rule4:\tTừ trên không có nguyên âm nào!");
    }
    
}
