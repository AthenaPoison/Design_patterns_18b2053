package design_patterns_18b2053.strategy_pattern;

public class Context {
    private iBehaviour iop;

    public Context(iBehaviour iop){
        this.iop = iop;
    }

    public String executeOp(String duckType){
        String output = iop.doBehaviour(duckType);
        return output;
    }
}
