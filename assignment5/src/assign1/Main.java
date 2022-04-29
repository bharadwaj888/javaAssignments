package assign1;


public class Main {
    public static void main(String[] args) {


        bharat1 shivva = new bharat1();
        shivva.printVariables();
        /* here in this part the compiler gives error because java does not support uninitialized local variables.
        They have to be initialized before their first use. Because there will be uncertainty in where these
        local variables are declared
         */
        shivva.localVariables();
        bharat1 sh1 = bharat.method1("Revanth");
        sh1.printstring();

    }
}
