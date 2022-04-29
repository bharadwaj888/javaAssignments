package assign1;

public class bharat1 {
    int variable1 ;
    char variable2 ;
    public void printVariables(){
        System.out.println("Number is " + variable1 + "Character is "+variable2 );
    }
    public void localVariables(){
        int var1 ;
        char var2;
        /* here in this part the compiler gives error because java does not support uninitialized local variables.
        They have to be initialized before their first use. Because there will be uncertainty in where these
        local variables are declared
         */
        System.out.println("Number is " + var1 + "Character is "+var2);
    }
}
