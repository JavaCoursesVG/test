
public class MyClass {

    private final MyClass INSTANCE =new MyClass();

    public static void main(String... args) {
        MyClass test = new MyClass();
                test.sayHello();
    }

    private void sayHello() {
        System.out.println("Hello!");
    }

}
