package model.Rule;

import static model.Rule.Define_Character.consonants18;
import static model.Rule.Define_Character.vowel18;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule18 extends Rule {
    @Override
    public boolean isValid(String x) {
        for(int i=0;i<x.length()-1;i++){
            if("ả".contains(x.charAt(i)+"")){
                if(vowel18.contains(x.charAt(i+1)+""))
                    return false;
            }
            if("ả".contains(x.charAt(i)+"")){
                if(consonants18.contains(x.charAt(i+1)+""))
                    return false;
            }

        }

        return true;
    }

    @Override
    public String showError() {
        return ("Rule18:\tChỉ có một số nguyên âm được phép đứng đằng sau \"ả\" để tạo thành cặp nguyên âm: ải, ảo, ảy.");
    }
}
