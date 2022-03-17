package design_patterns_18b2053.iterator_pattern;

public class nameRepository implements container {
    public String names[]= {"Robert", "John", "Julie", "Jude"};

    @Override
    public iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements iterator{
        int index;

        @Override
        public boolean hasNext(){
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
