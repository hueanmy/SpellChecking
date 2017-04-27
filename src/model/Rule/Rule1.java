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
public class Rule1 extends Rule{
     public String ShowError(){

            return "Rule 1: Có mốt số phụ âm chỉ được phép đứng đầu từ: q,s,d,đ,k,l,x,v,b";
        }
        public boolean isValid(String x){
            String firstConsonants = "q s d đ k l x v b";
            for(int j = 1;j<x.length();j++){
                if(firstConsonants.contains(x.charAt(j)+"")){
                    return false;
                }
            }
            return true;
        }
    }

