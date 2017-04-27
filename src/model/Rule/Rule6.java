/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.VietnameseVowels;
import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/**
 *
 * @author katie
 */
public class Rule6 extends Rule {

    @Override
    public boolean isValid(String x) {
       if(vowelsCount(x)>1){
            for(int i=0; i<x.length();i++){
                if(nguyenam.contains(x.charAt(i)+"")){
                    for(int j=i+1; j<x.length(); j++){
                        if(!nguyenam.contains(x.charAt(j)+"")){
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String showError() {
       return("Rule6:\tTừ nếu có 2 nguyên âm phải đứng cạnh nhau!");
    }
    
}
