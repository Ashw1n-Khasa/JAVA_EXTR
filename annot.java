import java.lang.annotation.*;

//custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}


@MyAnnotation("This is a class annotation")
class MyClass {
    
    @MyAnnotation("This is a method annotation")
    public void myMethod() {
        System.out.println("Inside myMethod");
    }
}

public class annot {
    public static void main(String[] args) {
        
        MyAnnotation classAnnotation = MyClass.class.getAnnotation(MyAnnotation.class);
        System.out.println("Class Annotation: " + classAnnotation.value());

        
        try {
            MyAnnotation methodAnnotation = MyClass.class.getMethod("myMethod").getAnnotation(MyAnnotation.class);
            System.out.println("Method Annotation: " + methodAnnotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
