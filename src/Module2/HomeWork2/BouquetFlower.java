package Module2.HomeWork2;

public class BouquetFlower {
    public static void main(String[] args) {
        Flower peon = new Peon("pink",70);
        Flower chamomile = new Chamomile("white",25);
        Flower rose = new Rose("red",50);
        Flower tulip = new Tulip("yellow",40);

        System.out.println("Bouquet Assembled");

        int price = peon.getPrice() + chamomile.getPrice() + rose.getPrice() + tulip.getPrice();
        System.out.println("Price bouquet : " + price);
    }
}
