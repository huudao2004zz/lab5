class car {
    public String color;
    public car(){
        System.out.println("car is buiding");
    }
}
public class sportcar extends car {
    public sportcar(){
        super();
        System.out.println("sportcar is building");
    }
    public static void main(String[] args) {
        new sportcar();
    }
}
