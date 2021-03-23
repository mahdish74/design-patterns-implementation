package interpreter.interpreter;

import java.util.Map;

public class Plus implements Expression{

    private final Expression left;
    private final Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return left.interpret(context) + right.interpret(context);
    }

}
