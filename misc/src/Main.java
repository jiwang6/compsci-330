public class Main { // explore difference between static and non-static methods

    public static void main(String[] args) {
        System.out.println("hello");

        Main maa = new Main();

        maa.sayHey();

        sayHello();
    }

    public void sayHey() {
        System.out.println("Hey");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
