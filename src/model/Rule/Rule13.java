package model.Rule;

/**
 * Created by katie on 14/03/2017.
 */
public class Rule13 extends Rule {
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        String consonants = "h g";
        if(x.endsWith(consonants)) {
            check = true;
        }
        if(check=true){
            if(!"n c".contains(x.charAt(x.length()-2)+"")){
                if("h".contains(x.charAt(x.length()-1)+""))
                    check = false;
            }
            if(!"n".contains(x.charAt(x.length()-2)+"")){
                if("g".contains(x.charAt(x.length()-1)+""))
                    check = false;
            }
        }
        return check;
    }

    @Override
    public String showError() {
        return ("Rule13:\tmột số phụ âm được phép đứng cuối:nh, ch, ng");
    }
}
