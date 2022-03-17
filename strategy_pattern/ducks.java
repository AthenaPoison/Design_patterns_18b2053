package design_patterns_18b2053.strategy_pattern;

public class ducks {
    public static void main(String [] args){
        String duck1 = "wild duck";
        String duck2 = "domestic duck";
        Context context1 = new Context(new quackBehaviour());
        Context context2 = new Context(new flyBehaviour());
        Context context3 = new Context(new swimBehaviour());
        
        String printOutput = context1.executeOp(duck1) + context2.executeOp(duck1);
        System.out.println(printOutput);

        printOutput = context1.executeOp(duck2) + context3.executeOp(duck2);
        System.out.print(printOutput);
    }
}
