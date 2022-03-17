package design_patterns_18b2053.factory_pattern;

public class cakeShop {
    public static void main(String[] args){
        CakeFactory factory = new CakeFactory();
        //get an object of chocolate and call its flavor method
        Flavor flavor1 = factory.getShape("CHOCOLATE");
        flavor1.flavor();
        //get an object of mint and call its flavor method
        Flavor flavor2 = factory.getShape("MINT");
        flavor2.flavor();
        //get an object of chesese and call its flavor method
        Flavor flavor3 = factory.getShape("CHEESE");
        flavor3.flavor();
    }
}
