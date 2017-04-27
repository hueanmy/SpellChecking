package model.Rule;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule45C extends Rule{
    public boolean isValid(String x) {
        boolean check = false;
        String[] words = {"ngửi","gửi","chửi","ngửa","lửa","cửa","mửa","thửa","cửi"};
        if("ử".contains(x.charAt(x.length()-1)+"")){
            return true;
        }
        for(int i=0;i<x.length()-1;i++){
            if("ử".contains(x.charAt(i)+"")){
                if("i a".contains(x.charAt(i+1)+""))
                    check = true;
                    break;
            }
        }
        if(check==true){
           for(String c : words){
               if(x.equals(c)){
                   check = true;
                   break;
               }
               else{
                   check = false;
               }
           }
        }
        return check;
    }

    public String ShowError() {
        return ("Rule45C:Nếu nguyên âm ử đi sau là nguyên âm i, a thì chỉ có các từ: ngửi,gửi,chửi,ngửa,lửa,cửa,mửa,thửa,cửi");
    }
}
