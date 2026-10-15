package Day9;

// Multi type parameters
class Pair<K, V> {
    private K key;
    private V value;


    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }


    public V getValue() {
        return value;
    }
}


class Gen2{
    public static void main(String[] args){
        Pair<String, Integer> p = new Pair<>("Age", 25);


        String k = p.getKey();
        Integer v = p.getValue();


        System.err.println(k + ":" + v);
    }
}