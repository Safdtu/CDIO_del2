package Spil;
import java.lang.Math;
import java.util.Scanner;

public class Dicegame {
    static void startNytSpil(){

        Die die1 = new Die();
        Die die2 = new Die();

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv navnet på første spiller");
        Player player1 = new Player(sc.nextLine(),0);

        System.out.println("Skriv navnet på anden spiller");
        Player player2 = new Player(sc.nextLine(),0);
        while (true) {

            System.out.println(player1.getNavn() + " kast terningerne");
            sc.nextLine();
            int sumOfDice = die1.getFaceValue()+ die2.getFaceValue();


            player1.addScore(die1.getFaceValue(), die2.getFaceValue() );
            System.out.println(player1.getNavn() + " din score er nu " + player1.getMoney());

            if (player1.getMoney() >= 3000) {
                System.out.println(player1.getNavn() + " du har vundet");
                break;

            }

            System.out.println(player2.getNavn() + " kast terningerne");
            sc.nextLine();
            die1.rollDie();
            die2.rollDie();
            sumOfDice = die1.getFaceValue()+ die2.getFaceValue();
            System.out.println(die1.getFaceValue());
            System.out.println(die2.getFaceValue());



            player2.addScore(die1.getFaceValue(), die2.getFaceValue());
            System.out.println(player2.getNavn() + " din score er nu " + player2.getMoney());

            if (player1.getMoney() >= 3000) {
                System.out.println(player1.getNavn() + " du har vundet");
            } else if (player2.getMoney() >= 3000) {
                System.out.println(player2.getNavn() + " du har vundet");

                break;
            }
        }
    }

    public static void main (String[]args){
        startNytSpil();



    }
}
