package design_patterns_18b2053.strategy_pattern;

public class quackBehaviour implements iBehaviour{
    @Override
    public String doBehaviour(String duckType){
        String quack = " 'Quack! Quack!' says the " + duckType;
        return quack;
    }
    
}
