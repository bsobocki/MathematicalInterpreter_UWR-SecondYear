package function.symbol.function.twoArgs;

import ONP_interpreter.exceptions.ONP_Exception;
import function.symbol.Symbol;

public class Minus extends TwoArgs {

    public Minus (Symbol a1, Symbol a2){
        super(a1,a2,3);
        name ="-";
    }
    public Minus() {
        super(3);
        name ="-";
    }

    @Override
    public double calc() throws ONP_Exception {
        check();
        return arg1.calc() - arg2.calc();
    }
}
