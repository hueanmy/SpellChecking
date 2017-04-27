package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule43B extends Rule {
    public boolean isValid(String x) {
        boolean check = false;
        String word43 = "ý e ơ á ả ạ à ỳ ở";
        String[] words = {"quý","quỳ","quả","que","quơ","huơ","quá","quạ","quà","thuở"};
        for (int i = 0; i < x.length() - 1; i++) {
            if ("u".contains(x.charAt(i) + "")) {
                if (word43.contains(x.charAt(i+1) + ""))
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

    public String ShowError() {

        return ("Rule43B: Nguyên âm \"ý\", \"e\" và \"ơ\", \"á\", \"ả\", \"ạ\" \"à\" cũng đi sau \"u\" được " +
                "nhưng đó phải là các từ \"quý\" \"que\", quơ, \"huơ\", \"quá\" quả, quạ, quà");
    }
}
