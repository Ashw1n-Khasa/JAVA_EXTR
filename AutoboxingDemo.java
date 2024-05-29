public class AutoboxingDemo {
    public static void main(String[] args) {
        
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // autoboxing

        
        boolean primitiveBool = true;
        Boolean wrapperBool = primitiveBool; // autoboxing

        
        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar; // autoboxing

       
        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble; // autoboxing

        
        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2; // autoboxing

        
        Boolean wrapperBool2 = false;
        boolean primitiveBool2 = wrapperBool2; // autoboxing

       
        Character wrapperChar2 = 'B';
        char primitiveChar2 = wrapperChar2; // autoboxing

        
        Double wrapperDouble2 = 6.28;
        double primitiveDouble2 = wrapperDouble2; // autoboxing

        
        System.out.println("Autoboxing from primitive to wrapper:");
        System.out.println("Primitive int: " + primitiveInt + ", Wrapper Integer: " + wrapperInt);
        System.out.println("Primitive boolean: " + primitiveBool + ", Wrapper Boolean: " + wrapperBool);
        System.out.println("Primitive char: " + primitiveChar + ", Wrapper Character: " + wrapperChar);
        System.out.println("Primitive double: " + primitiveDouble + ", Wrapper Double: " + wrapperDouble);

        System.out.println("\nAutoboxing from wrapper to primitive:");
        System.out.println("Wrapper Integer: " + wrapperInt2 + ", Primitive int: " + primitiveInt2);
        System.out.println("Wrapper Boolean: " + wrapperBool2 + ", Primitive boolean: " + primitiveBool2);
        System.out.println("Wrapper Character: " + wrapperChar2 + ", Primitive char: " + primitiveChar2);
        System.out.println("Wrapper Double: " + wrapperDouble2 + ", Primitive double: " + primitiveDouble2);
    }
}
