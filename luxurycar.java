package fptAptech;

class car{
    public void accelerate(){
        System.out.println(" car is accelerate");
    }
}
public class luxurycar {
    public void service(){
        System.out.println("luxurycar is in the service!");
    }
    public static void main(String[] args) {
        luxurycar c = new luxurycar();
        ((luxurycar) c).service();
    }
}
