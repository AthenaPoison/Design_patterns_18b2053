package design_patterns_18b2053.iterator_pattern;

public class iteratorDemo {
    public static void main(String[] args){
        nameRepository namesRepository = new nameRepository();

        for(iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
