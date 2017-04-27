package model.Rule;

/**
 * Created by katie on 17/03/2017.
 */
public class Rule29B extends Rule {
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        String[] words ={"gió","giống","giỗ","giọng","giỏ","giò","giá","giấc","giặc"};
        String s = "ó ố ỗ ọ ỏ ò á ấ ặ";
        for (int i = 0; i < x.length() - 1; i++) {
            if ("i".contains(x.charAt(i) + "")) {
                if (s.contains(x.charAt(i+1) + ""))
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
    public String showError() {

        return ("Nguyên âm i được phép đi cùng \"ó\", \"ố\", \"ỗ\", \"ọ\", \"ỏ\", \"ò\", \"á\", \"ấ\", \"ặ\" :" +
                "\"gió\" , \"giống\", \"giỗ\", \"giọng\", \"giỏ\", \"giò\", \"giá\", \"giấc\", \"giặc\"");
    }
}
