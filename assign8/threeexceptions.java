package assign8;
import java.util.Scanner;

class Threeexceptions {
    public static void errorValidate(int age, char passkey, String genders) throws AgevalidationException, CharactersallowedException, GenderException {
        if(age< 21){
            throw new AgevalidationException("Age is not valid");
        }
        else{
            System.out.println("Age is Valid");
        }
        if(passkey>='d' && passkey<='h'){
            throw new CharactersallowedException("Passkey is not allowed");
        }
        else{
            System.out.println("Age is valid");
        }
        if(genders!= "male"){
            throw new GenderException("Males are only allowed");
        }
        else{
            System.out.println("Males are allowed");
        }

    }

    public static void main(String[] args) {
        int age;
        char passkey;
        String genders;
        Scanner read = new Scanner(System.in);
        age = read.nextInt();
        passkey= read.next().charAt(0);
        genders = read.next();
        try{
            errorValidate(age,passkey,genders);
        }
        catch(AgevalidationException | CharactersallowedException | GenderException obj){
            System.out.println("Exception occured: " + obj);
        }
        finally {
            System.out.println("Yes, Finally block is excecuted");
        }
    }
}
