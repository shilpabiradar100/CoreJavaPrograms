package Com.Bridgelabz.BasicCoreJava.finalKeyword;


/*The final keyword in java is used to restrict the user.
 * The java final keyword can be used in many context. Final can be:
 * 		variable
 * 		method
 * 		class
 *
 * The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable.
 * It can be initialized in the constructor only.
 * The blank final variable can be static also which will be initialized in the static block only.
 *
 * 1) Java final variable:
 * 	If you make any variable as final, you cannot change the value of final variable(It will be constant).
 *
 * */

class FinalVariable {
    int speedlimit = 90;// final variable

    void run() {
        speedlimit = 400;
    }

    public static void main(String args[]) {
        FinalVariable obj = new FinalVariable();
        obj.run();
    }
}// end of class