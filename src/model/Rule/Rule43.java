package model.Rule;

import static model.Rule.Define_Character.nguyenam;
import static model.Rule.Define_Character.vowelsCount;

/**
 * Created by katie on 16/03/2017.
 */
public class Rule43 extends Rule {
    @Override
    public boolean isValid(String x) {
         if (vowelsCount(x) == 2) {
            for (int i = 0; i < x.length() - 1; i++) {
                if ((x.charAt(i) + "").equalsIgnoreCase("u") && nguyenam.contains(x.charAt(i + 1) + "")) {
                    if (nguyenam.contains(x.charAt(i + 1) + "")) {
                        return true;
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ý")) {
                        if (x.equalsIgnoreCase("quý")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("e")) {
                        if (x.equalsIgnoreCase("que")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ơ")) {
                        if (x.equalsIgnoreCase("quơ")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ồ")) {
                        if (x.equalsIgnoreCase("buồn") || x.equalsIgnoreCase("buồm")
                                || x.equalsIgnoreCase("buồng") || x.equalsIgnoreCase("luồng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("â")) {
                        if (x.equalsIgnoreCase("quân") || x.equalsIgnoreCase("luân")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ấ")) {
                        if (x.equalsIgnoreCase("quấn") || x.equalsIgnoreCase("quất")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ầ")) {
                        if (x.equalsIgnoreCase("quần") || x.equalsIgnoreCase("quầng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ậ")) {
                        if (x.equalsIgnoreCase("quật") || x.equalsIgnoreCase("thuận")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("á")) {
                        if (x.equalsIgnoreCase("quá") || x.equalsIgnoreCase("quáng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ả")) {
                        if (x.equalsIgnoreCase("quả") || x.equalsIgnoreCase("quảng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ạ")) {
                        if (x.equalsIgnoreCase("quạ") || x.equalsIgnoreCase("quạng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("à")) {
                        if (x.equalsIgnoreCase("quà") || x.equalsIgnoreCase("quàng")) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                    if ((x.charAt(i + 1) + "").equalsIgnoreCase("ắ")) {
                        if (x.equalsIgnoreCase("quắc")) {
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

        return ("Rule43:\tNguyên âm \"u\" đi đằng sau sẽ là các nguyên âm \"i\", \"a\", \"y\", \"ê\", \"ở\",  \"ế\"");
    }
}
