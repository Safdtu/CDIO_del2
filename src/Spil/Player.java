package Spil;

public class Player {

    private String navn;

    private int money;

    public Player (String navn, int money){
        this.navn=navn;
        this.money=money;
    }

    public void addScore(int dice1, int dice2){
        int sum = dice1 + dice2;
        money = sum + money;
    }

    public void setNavn(String newNavn) { navn = newNavn;}

    public String getNavn() {return navn;}

    public int getMoney(){return money;}


}
