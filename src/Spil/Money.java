package Spil;

public class Money {

    public int money=1000;


    private Die die1;
    private Die die2;
    public int sumOfDice = die1.getFaceValue() + die2.getFaceValue();

    public int getMoney() {
        return money;
    }

    if(sumOfDice == 2){
        System.out.println("Du er landet på Tower og modtager derfor 250" +(money + 250));
    }
    else if (sumOfDice == 3){
        System.out.println("Du er landet på Crater og mister derfor 100" +(money - 100 ));
    }
    else if(sumOfDice == 4){
        System.out.println("Du er landet på Palace gates og modtager derfor 100" +(money + 100));
    }
   if(sumOfDice == 5){
        System.out.println("Du er landet på Cold desert og mister derfor 20" +(money -20 ));
    }
    if(sumOfDice == 6){
        System.out.println("Du er landet på Walled city og modtager derfor 180" +(money + 180 ));
    }
     if(sumOfDice == 7){
        System.out.println("Du er landet på Monastery og modtager derfor intet" +(money +0));
    }
      if(sumOfDice == 8){
        System.out.println("Du er landet på Black cave og mister derfor 70" +(money -70));
    }
       if(sumOfDice == 9){
        System.out.println("Du er landet på Huts in the mountain og modtager derfor 60" +(money + 250 );
    }
        if(sumOfDice == 10){
        System.out.println("Du er landet på The Werewall (werewolf-wall) og mister derfor 80 " +(money -80 );
    }
        if(sumOfDice == 11){
        System.out.println("Du er landet på The pit og mister derfor 50 " +(money -50 );
    }
        if(sumOfDice == 12){
        System.out.println("Du er landet på Goldmine og modtager derfor 650 " +(money +650);
    }
     else{
         break;
    }


}
