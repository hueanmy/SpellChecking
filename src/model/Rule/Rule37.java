package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule37 extends Rule {
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        String[] words = {"tễu", "phễu", "nghễu", "ễu"};
        for (int i = 0; i < x.length() - 1; i++) {
            if ("ễ".contains(x.charAt(i) + "")) {
                if ("u".contains(x.charAt(i + 1) + ""))
                    check = true;
                break;
            }
        }
        if (check == true) {
            for (String c : words) {
                if (x.equals(c)){
                    check = true;
                    break;
                }
                else {check = false;}
            }
        }
        return check;
    }




    @Override
    public String showError () {

        return ("Rule37:\tNguyên âm \"ễu\" chỉ được phép đi trong từ \"Tễu\" và \"phễu\"");
    }
}