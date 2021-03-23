package interpreter.interpreter;

import java.util.Map;

public class Number implements Expression {
    final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return value;
    }
}
