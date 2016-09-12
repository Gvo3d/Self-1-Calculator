package org.yakimovdenis.Calculator.Validators;

/**
 * Created by Gvozd on 12.09.2016.
 */
public class DivizionByZeroValidator extends Validator {

    @Override
    public void validate(String[] argument) {
        WrongNumberOfArgumentsValidator.validateArgumentsNumber(this.getClass().getCanonicalName(), 2, argument.length);
        if (Integer.parseInt(argument[0]) == 0) throw new IllegalArgumentException("Throwed by: " + argument[0] + " division by zero!");
    }
}
