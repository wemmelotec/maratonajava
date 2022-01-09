package SOLID;

public class Main {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
class A{
    String name = "meu nome é A";

    public String getName() {
        return name;
    }
}
class B extends A{
    public String getName() {
        return "meu nome é B";
    }
}

