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
public class Rule6 extends Rule {


    public String ShowError() {
        return("Rule 6: Các nguyên âm trong từ phải đứng cạnh nhau, không có phụ âm chen vào");
    }

    public boolean isValid(String x) {
        int count = 0;
        int check = 0;
        for (int j = 0; j < x.length(); j++) {
            if (nguyenam.contains(x.charAt(j) + "")) {
                count++;
            }
        }
        if (count >= 2) {
            for (int i = 1; i < x.length(); i++) {
               if(nguyenam.contains(x.charAt(i-1)+"")){
                   if(nguyenam.contains(x.charAt(i)+"")){
                       return true;
                   } else return false;
               }
            }
        }
        return true;
    }

}
