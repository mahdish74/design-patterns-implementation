package interpreter.client;

import interpreter.interpreter.Evaluator;
import interpreter.interpreter.Expression;
import interpreter.interpreter.Number;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Expression evaluator = new Evaluator("x y z + - ");
        Map<String, Expression> map = new HashMap<>();
        map.put("x", new Number(10));
        map.put("y", new Number(12));
        map.put("z", new Number(13));
        int result = evaluator.interpret(map);
        System.out.println(result);
    }
}
