package Com.Bridgelabz.BasicCoreJava.finalKeyword;

/*If you make any class as final, you cannot extend it.
 */


final class Bike {
}

class FinalClass extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        FinalClass honda = new FinalClass();
        honda.run();
    }
}