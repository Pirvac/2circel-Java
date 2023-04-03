public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("red");

        Circle c2 = new Circle();
        c2.setRadius(2.0);
        c2.setColor("blue");


        for (int i=1;i<2;++i){
        System.out.println("Circel 1 details :"+c1.toString());
        System.out.println("Circel 2 details :"+c2.toString());
    }}
}