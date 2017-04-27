package model.Rule;

/**
 * Created by katie on 05/03/2017.
 */
public abstract class Rule {
    public abstract boolean isValid(String x);
    public abstract String showError();
}
