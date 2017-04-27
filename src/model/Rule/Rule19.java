package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule19 extends Rule{
    @Override
    public boolean isValid(String x) {
        String s = "nhảu";
        boolean check = false;
        for(int i=0;i<x.length()-1;i++){
            if("ả".contains(x.charAt(i)+"")){
                if("u".contains(x.charAt(i+1)+""))
                    check = true;
//                else
//                    return true;
            }
        }
        if(check=true){
            if(x != s)
                check = false;
        }
        return check;
    }

    @Override
    public String showError() {

        return ("Rule19:\tNếu có \"ảu\" thì từ này bắt buộc phải nằm trong từ \"nhảu\"");
    }
}
