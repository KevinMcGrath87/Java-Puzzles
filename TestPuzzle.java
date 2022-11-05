public class TestPuzzle {
    public static void main(String[] args){
        PuzzleJava puzzler = new PuzzleJava();
        // puzzler.randMachine.nextInt(0);
        puzzler.getTenRolls(20);

        System.out.println(puzzler.getRandomLetter());

        System.out.println(puzzler.generatePassword(8));

        System.out.println(puzzler.getPasswordSet(12, 10));
    }

}