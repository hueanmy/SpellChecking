package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule45 extends Rule {
    @Override
    public boolean isValid(String x) {
        for(int i=0;i<x.length()-1;i++){
            if("ũ".contains(x.charAt(i)+"")){
                if(!"y i m n".contains(x.charAt(i+1)+""))
                    return false;
            }
        }
        return true;
    }

    @Override
    public String showError() {
        return ("Rule45:\tsau ũ có chỉ có các ký tự: y,i,m,n");
    }
}
