/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;



public class Rule38 extends Rule{
@Override
    public boolean isValid(String x) {
	if(vowelsCount(x)==2){
            for(int i=0; i<x.length()-1; i++){
                if((x.charAt(i)+"").equalsIgnoreCase("ể")){
                    if(nguyenam.contains(x.charAt(i+1)+"")){
                        return false;
                    }
                    else return true;
                }
            }
        }
        return true;

	}

    @Override
    public String showError() {
        return "Luật 38:\t Nguyên âm \"ể\" không có nguyên âm khác đi sau";
    }

	
}
