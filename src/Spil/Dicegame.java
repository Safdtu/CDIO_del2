package Spil;
import java.util.Scanner;

public class Dicegame {
    static int startNytSpil() {

        Die die1 = new Die();
        Die die2 = new Die();

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv navnet på første spiller");
        Player player1 = new Player(sc.nextLine(), 0);

        System.out.println("Skriv navnet på anden spiller");
        Player player2 = new Player(sc.nextLine(), 0);
        while (true) {

            System.out.println(player1.getNavn() + " kast terningerne");
            sc.nextLine();

            int sumOfDice = die1.getFaceValue() + die2.getFaceValue();

            int money = 1000;

            if (sumOfDice == 2) {
                System.out.println(player1.getNavn() + "du er landet på Tower og modtager derfor 250");
                money += 250;
            } else if (sumOfDice == 3) {
                System.out.println(player1.getNavn() + "du er landet på Crater og mister derfor 100");
                money -= 100;
            } else if (sumOfDice == 4) {
                System.out.println(player1.getNavn() + "du er landet på Palace gates og modtager derfor 100");
                money += 100;
            } else if (sumOfDice == 5) {
                System.out.println(player1.getNavn() + "du er landet på Cold Desert og mister derfor 20");
                money -= 20;
            } else if (sumOfDice == 6) {
                System.out.println(player1.getNavn() + "du er landet på Walled city og modtager derfor 180");
                money += 180;
            } else if (sumOfDice == 7) {
                System.out.println(player1.getNavn() + "du er landet på Monastery og modtager derfor ingenting");
                money += 0;
            } else if (sumOfDice == 8) {
                System.out.println(player1.getNavn() + "du er landet på Black cave og mister derfor 70");
                money -= 70;
            } else if (sumOfDice == 9) {
                System.out.println(player1.getNavn() + "du er landet på Huts in the mountain og modtager derfor 60");
                money += 60;
            } else if (sumOfDice == 10) {
                System.out.println(player1.getNavn() + "du er landet på The Werewall og mister derfor 80");
                money -= 80;
            } else if (sumOfDice == 11) {
                System.out.println(player1.getNavn() + "du er landet på The pit og mister derfor 50");
                money -= 50;
            } else if (sumOfDice == 12) {
                System.out.println(player1.getNavn() + "du er landet på Goldmine og modtager derfor 650");
                money += 650;
            }


            player1.addMoney(money);
            System.out.println(money);
            System.out.println(player1.getNavn() + " din score er nu " + player1.getMoney());

            if (player1.getMoney() >= 3000) {
                System.out.println(player1.getNavn() + " du har vundet");
                break;

            }

            System.out.println(player2.getNavn() + " kast terningerne");
            sc.nextLine();
            die1.rollDie();
            die2.rollDie();
            sumOfDice = die1.getFaceValue() + die2.getFaceValue();

            if (sumOfDice == 2) {
                System.out.println(player2.getNavn() + "du er landet på Tower og modtager derfor 250");
                money += 250;
            } else if (sumOfDice == 3) {
                System.out.println(player2.getNavn() + "du er landet på Crater og mister derfor 100");
                money -= 100;
            } else if (sumOfDice == 4) {
                System.out.println(player2.getNavn() + "du er landet på Palace gates og modtager derfor 100");
                money += 100;
            } else if (sumOfDice == 5) {
                System.out.println(player2.getNavn() + "du er landet på Cold Desert og mister derfor 20");
                money -= 20;
            } else if (sumOfDice == 6) {
                System.out.println(player2.getNavn() + "du er landet på Walled city og modtager derfor 180");
                money += 180;
            } else if (sumOfDice == 7) {
                System.out.println(player2.getNavn() + "du er landet på Monastery og modtager derfor ingenting");
                money += 0;
            } else if (sumOfDice == 8) {
                System.out.println(player2.getNavn() + "du er landet på Black cave og mister derfor 70");
                money -= 70;
            } else if (sumOfDice == 9) {
                System.out.println(player2.getNavn() + "du er landet på Huts in the mountain og modtager derfor 60");
                money += 60;
            } else if (sumOfDice == 10) {
                System.out.println(player2.getNavn() + "du er landet på The Werewall og mister derfor 80");
                money -= 80;
            } else if (sumOfDice == 11) {
                System.out.println(player2.getNavn() + "du er landet på The pit og mister derfor 50");
                money -= 50;
            } else if (sumOfDice == 12) {
                System.out.println(player2.getNavn() + "du er landet på Goldmine og modtager derfor 650");
                money += 650;
            }

            player2.addMoney(money);
            System.out.println(player2.getNavn() + " din score er nu " + player2.getMoney());

            if (player1.getMoney() >= 3000) {
                System.out.println(player1.getNavn() + " du har vundet");
            } else if (player2.getMoney() >= 3000) {
                System.out.println(player2.getNavn() + " du har vundet");

                break;
            }
        }




    return startNytSpil();}


    public static void main (String[]args){
        startNytSpil();



    }
}
