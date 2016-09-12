package org.yakimovdenis.Calculator;

import org.yakimovdenis.Calculator.Validators.WrongNumberOfArgumentsValidator;

/**
 * Created by Gvozd on 12.09.2016.
 */
class MCAdd extends CalcAction{

    public MCAdd() {
        super.setActionSign("+");
        super.setValidators(null);
    }

    @Override
    Number performAction(String[] arguments) {
        WrongNumberOfArgumentsValidator.validateArgumentsNumber(this.getClass().getCanonicalName(), 2, arguments.length);
        Long result = Long.parseLong(arguments[0]) + Long.parseLong(arguments[1]);
        return result;
    }
}
