/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.VietnameseVowels;

/**
 *
 * @author katie
 */
public class Rule5 extends Rule {

    @Override
    public boolean isValid(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (VietnameseVowels.contains(x.charAt(i) + "")) {
                count ++;
            }
        }
        if (count >= 1 && count <= 3){
            return true;
	}
	
	return true;
    
    }

    @Override
    public String showError() {
        return("Rule5:\t1 từ chỉ có tối đa 3 nguyên âm!");
    }
    
}
