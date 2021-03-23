package interpreter.interpreter;

import java.util.Map;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        Expression expression = context.get(name);
        if (expression == null) {
            return 0;
        }
        return expression.interpret(context);
    }
}
