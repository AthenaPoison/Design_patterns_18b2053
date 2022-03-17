package design_patterns_18b2053.strategy_pattern;

public class flyBehaviour implements iBehaviour{
    @Override
    public String doBehaviour(String ducktType){
        return " before flying away.";
    }
}
