class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class generic {
    public static void main(String[] args) {
        

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Integer value: " + integerBox.getItem());

        System.out.println();
        
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println("String value: " + stringBox.getItem());
    }
}
