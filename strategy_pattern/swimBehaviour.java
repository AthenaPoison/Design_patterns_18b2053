package design_patterns_18b2053.strategy_pattern;

public class swimBehaviour implements iBehaviour{
    @Override
    public String doBehaviour(String duckType){
        String swim = " before swimming away.";
        return swim;
    }
}
