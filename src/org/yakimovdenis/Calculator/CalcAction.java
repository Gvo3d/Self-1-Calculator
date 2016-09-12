package org.yakimovdenis.Calculator;

import org.yakimovdenis.Calculator.Validators.Validator;

/**
 * Created by Gvozd on 12.09.2016.
 */
abstract class CalcAction {
    private static String actionSign;
    private Validator[] validators;

    public String getActionSign() {
        return actionSign;
    }

    void setActionSign(String actionSign) {
        this.actionSign = actionSign;
    }

    protected Validator[] getValidators() {
        return validators;
    }

    protected void setValidators(Validator[] validators) {
        this.validators = validators;
    }

    abstract Number performAction(String[] arguments);

}
