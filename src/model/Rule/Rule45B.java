package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule45B extends Rule{
    public boolean isValid(String x) {
        String words = "a ơ ở ợ ờ ớ n";
        for(int i=0;i<x.length()-1;i++){
            if("ư".contains(x.charAt(i)+"")){
                if(!words.contains(x.charAt(i+1)+""))
                    return false;
            }
        }
        return true;
    }

    public String ShowError() {
        return ("Rule45B: Nguyên âm \"ư\" đứng đầu và nguyên âm khác đi sau là : a , ơ , ở , ợ , ờ , ớ , n");
    }
}
