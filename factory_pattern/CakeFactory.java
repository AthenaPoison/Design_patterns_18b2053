package design_patterns_18b2053.factory_pattern;

public class CakeFactory {
    public Flavor getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CHOCOLATE")){
            return new Chocolate();
        } else if(shapeType.equalsIgnoreCase("MINT")){
            return new Mint();
        }else if (shapeType.equalsIgnoreCase("CHEESE")){
            return new Cheese();
        }
        return null;
    }
}
