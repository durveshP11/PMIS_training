package Day9;

class Box1<T>{
    private T item;
    void set(T item){
        this.item = item;
    }
    T get(){
        return item;
    }
}


class Gen4{
    public static void main(String[] args){
        Box1<String> box = new Box1<>();
        box.set("Hello All");
        String s = box.get();
        System.out.println(s);
    }
}
