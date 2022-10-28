package Spil;

public class Player {

    private String navn;

    public int money;

    public void addMoney(int addMoney){
        money += addMoney;
    }


    public Player (String navn, int addMoney){
        this.navn=navn;
        this.money=addMoney;
    }

    public void setNavn(String newNavn) { navn = newNavn;}

    public String getNavn() {return navn;}

    public int getMoney(){return money;}
}
