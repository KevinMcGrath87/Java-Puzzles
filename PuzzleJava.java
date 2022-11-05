import java.util.Random;
import java.util.ArrayList;
import java.lang.reflect.Array;


public class PuzzleJava {
    Random randMachine = new Random();

    
    public void getTenRolls(int bound) {
        ArrayList<Integer> randomIntegers= new ArrayList<Integer>();
        for( int i = 0; i < 10; i++){
            randomIntegers.add(randMachine.nextInt(bound));
        }
        System.out.println(randomIntegers);
    }

    public char getRandomLetter() {
        char[] alphabet = {'a','b','c','d','e','f','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w', 'x', 'y','z'};
        char returnedChar = alphabet[(randMachine.nextInt(25))];
        return returnedChar;
    }

    public String generatePassword(int length){
        String password = "";

        for(int i = 0; i < length; i++){
            password = password + getRandomLetter();
        }
        return password;

    }
    public ArrayList<String> getPasswordSet(int size, int length){
        ArrayList<String> passSet = new ArrayList<String>();
        for( int x = 0; x < size; x++){
            passSet.add(generatePassword(length));
        }
        return passSet;

    }



}