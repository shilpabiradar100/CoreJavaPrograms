package Com.Bridgelabz.BasicCoreJava.finalKeyword;
/*If you make any method as final, you cannot override it.
 */


class Bike {
    final void run() {
        System.out.println("running");
    }
}

class FinalMethod extends Bike {
    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        FinalMethod honda = new FinalMethod();
        honda.run();
    }