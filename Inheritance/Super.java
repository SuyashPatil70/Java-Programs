class Demo1 {
    int a = 10;

    // Constructor of Demo1
    Demo1() {
        System.out.println("Constructor of Demo1");
    }

    // Parameterized Constructor of Demo1
    Demo1(int a) {
        System.out.println("Parameterized Constructor of Demo1");
    }

    void display() {
        System.out.println("Display method of Demo1");
    }
}

class Demo2 extends Demo1 {
    // Constructor of Demo2
    Demo2() {
        System.out.println("Constructor of Demo2");
    }

    // Parameterized Constructor of Demo2
    Demo2(int a) {
        super(10); // Calls the parameterized constructor of Demo1
        System.out.println("Parameterized Constructor of Demo2");
    }

    void display() {
        System.out.println("Display method of Demo2");
        System.out.println("a = " + super.a); // Accessing 'a' from Demo1
    }
}

public class Super {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2(); // Calls the constructor chain
        d1.display();
    }
}
