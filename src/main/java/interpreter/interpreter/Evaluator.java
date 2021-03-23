package interpreter.interpreter;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression {

    private final Expression mainExpression;
    public Evaluator(String stringExpression) {
        final Stack<Expression> expressionStack =new Stack<>();
        for (String exp: stringExpression.split(" ")) {
            if (exp.equals("+")){
                final Expression left =expressionStack.pop();
                final Expression right =expressionStack.pop();
                expressionStack.push(new Plus(left,right));
            }else if (exp.equals("-")){
                final Expression left =expressionStack.pop();
                final Expression right =expressionStack.pop();
                expressionStack.push(new Minus(left,right));
            }else {
                expressionStack.push(new Variable(exp));
            }
        }
        mainExpression=expressionStack.pop();
    }


    @Override
    public int interpret(Map<String, Expression> context) {
        return mainExpression.interpret(context);
    }
}
