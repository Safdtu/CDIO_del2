package Spil;

public class Die {

    public int faceValue;

    public Die(){
        this.faceValue=1;
    }
    public void rollDie(){
        faceValue = (int) (Math.random() * 6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
