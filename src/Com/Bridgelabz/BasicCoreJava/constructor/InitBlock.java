package Com.Bridgelabz.BasicCoreJava.constructor;

public class InitBlock {
    static {
        System.out.println("init Static block");
    }

    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    InitBlock() {
        System.out.println("default");
    }

    // constructor with one arguemnt.
    InitBlock(int x) {
        System.out.println(x);
    }

    public static void main(String args[]) {
        // Object creation by calling no-argument
        // constructor.
        new InitBlock();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new InitBlock(10);
    }
}
