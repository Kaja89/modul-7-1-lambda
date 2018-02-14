package com.kodilla.modul71stream.stream;

import com.kodilla.modul71stream.stream.beautifier.MoreRealBeautifier;
import com.kodilla.modul71stream.stream.beautifier.PoemBeautifier;
import com.kodilla.modul71stream.stream.beautifier.PoemDecorator;
import com.kodilla.modul71stream.stream.lambda.Processor;
import com.kodilla.modul71stream.stream.lambda.SaySomething;
import com.kodilla.modul71stream.stream.lambda.ExecuteSaySomething;
import com.kodilla.modul71stream.stream.lambda.Executor;
import com.kodilla.modul71stream.stream.lambda.ExpressionExecutor;
import com.kodilla.modul71stream.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args){
        System.out.println("Module 7");

        //SaySomething saySomething = new SaySomething();
        //saySomething.say();

        //Processor processor = new Processor();

        //processor.execute(() -> System.out.println("text"));

        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);//co to jest?!?!?!?!?
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiply);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divide);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::add);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subtract);*/


        //Zadanie 7.1
        PoemBeautifier beautifier = new PoemBeautifier();

        PoemDecorator codeToExecuteDecoration = (String string) -> System.out.println("To upperCase: " + string.toUpperCase());
        beautifier.beautify("some text", codeToExecuteDecoration);

        PoemDecorator codeToExecuteDecoration2 = (String string) -> System.out.println("to lowerCase: " + string.toLowerCase());
        beautifier.beautify("VEry StAnGe StrIng", codeToExecuteDecoration2);

        beautifier.beautify("Shorter version", (String string) -> System.out.println(string + "@@@@@@@@"));

        beautifier.beautify("This is another example with a flower", (String string) -> System.out.println(string + " @--`,---"));

        beautifier.beautify("example", MoreRealBeautifier::addLetters);
        beautifier.beautify("Some poem", MoreRealBeautifier::addSmile);
    }
}
