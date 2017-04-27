package model.Rule;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule29 extends Rule{
    @Override
    public boolean isValid(String x) {
        boolean check = false;
        for(int i=0;i<x.length()-1;i++){
            if("i".contains(x.charAt(i)+"")){
                if("ữ".contains(x.charAt(i+1)+""))
                    check = true;
                else
                    return true;
            }
        }
        if(check=true){
            if(x!="giữ")
                check= false;
        }
        return check;
    }

    @Override
    public String showError() {

        return ("Nguyên âm i được phép đi cùng \"ữ\", nhưng đó phải là từ \"giữ\" ");
    }
}
