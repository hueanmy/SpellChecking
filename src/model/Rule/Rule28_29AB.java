package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.nguyenamsau_i;
import static model.Rule.Define_Character.phuamkhongdivs_i;
import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 15/03/2017.
 */
public class Rule28_29AB extends Rule {

    @Override
    public boolean isValid(String x) {
        
     if (vowelsCount(x) == 2) {
            for (int i = 0; i < x.length() - 1; i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("i") && nguyenam.contains(x.charAt(i + 1) + "")) {
                    if ((x.charAt(i + 1) + "").matches("[aùúuêếệểễề]")) {
                        return true;
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ữ")) {
                        if (x.equalsIgnoreCase("giữ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ụ")) {
                        if (x.equalsIgnoreCase("giục")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ù")) {
                        if (x.equalsIgnoreCase("giùm")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ũ")) {
                        if (x.equalsIgnoreCase("giũ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ú")) {
                        if (x.equalsIgnoreCase("giúp")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ó")) {
                        if (x.equalsIgnoreCase("gió")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ô")) {
                        if (x.equalsIgnoreCase("giông")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ẻ")) {
                        if (x.equalsIgnoreCase("giẻ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ố")) {
                        if (x.equalsIgnoreCase("giống")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ỗ")) {
                        if (x.equalsIgnoreCase("giỗ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ọ")) {
                        if (x.equalsIgnoreCase("giọng") || x.equalsIgnoreCase("giọt")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ỏ")) {
                        if (x.equalsIgnoreCase("giỏ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ò")) {
                        if (x.equalsIgnoreCase("giò")||x.equalsIgnoreCase("giòn")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ơ")) {
                        if (x.equalsIgnoreCase("giơ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ờ")) {
                        if (x.equalsIgnoreCase("giờ") || x.equalsIgnoreCase("giời")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ở")) {
                        if (x.equalsIgnoreCase("giở")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ỡ")) {
                        if (x.equalsIgnoreCase("giỡn")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("á")) {
                        if (x.equalsIgnoreCase("giá") || x.equalsIgnoreCase("giáng") || x.equalsIgnoreCase("giác")||x.equalsIgnoreCase("giáp")||x.equalsIgnoreCase("giám")||x.equalsIgnoreCase("giát")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ả")) {
                        if (x.equalsIgnoreCase("giả") || x.equalsIgnoreCase("giảm") || x.equalsIgnoreCase("giảng")||x.equalsIgnoreCase("giản")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("à")) {
                        if (x.equalsIgnoreCase("già") || x.equalsIgnoreCase("giàng")||x.equalsIgnoreCase("giàn")||x.equalsIgnoreCase("giành")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ã")) {
                        if (x.equalsIgnoreCase("giã")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ằ")) {
                        if (x.equalsIgnoreCase("giằng")||x.equalsIgnoreCase("giằn")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ắ")) {
                        if (x.equalsIgnoreCase("giắt")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ẫ")) {
                        if (x.equalsIgnoreCase("giẫm")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
		    
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ấ")) {
                        if (x.equalsIgnoreCase("giấc") || x.equalsIgnoreCase("giấy")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ậ")) {
                        if (x.equalsIgnoreCase("giận")||x.equalsIgnoreCase("giật")||x.equalsIgnoreCase("giậm")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ặ")) {
                        if (x.equalsIgnoreCase("giặc") || x.equalsIgnoreCase("giặt")) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String showError() {

        return ("Rule28_29AB:\tCác nguyên âm được phép sau nguyên âm \"i\": ia, iu, iê, iế, iệ, iể, iễ, iề,"
		+ "\tNguyên âm i được phép đi cùng \"ữ\", nhưng đó phải là từ \"giữ\" "
		+ "Nguyên âm i được phép đi cùng \"ó\", \"ố\", \"ỗ\", \"ọ\", \"ỏ\", \"ò\", \"á\", \"ấ\", \"ặ\":"
		+ "\"gió\" , \"giống\", \"giỗ\", \"giọng\", \"giỏ\", \"giò\", \"giá\", \"giấc\", \"giặc\", giằng, giản,giáp,giật,giông,giành,giẫm,giảm,giậm,giũ,giã");
    }
}
