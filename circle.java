class circle {
    double radius ;
    String color;
    public  circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
class Cylinder extends circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getheight() {
        return height;
    }

    public double getvolume() {
        return getArea() * height;
    }

}
    class test{
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder(2.0,"red",3.0);
            System.out.println("radius is : " + cylinder.getRadius());
            System.out.println("color is : " + cylinder.getColor());
            System.out.println("height is : " + cylinder.getheight());
            System.out.println("volume is : " + cylinder.getvolume());

        }
}


