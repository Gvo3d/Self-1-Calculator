package org.yakimovdenis.Calculator.Validators;

/**
 * Created by Gvozd on 12.09.2016.
 */
public class WrongNumberOfArgumentsValidator {
    public static void validateArgumentsNumber(String throwedBy, int asserted, int real) {
        if (asserted != real) throw new IllegalArgumentException("Throwed by "+throwedBy+", asserted arguments:"+asserted+", have:"+real);
    }
}
