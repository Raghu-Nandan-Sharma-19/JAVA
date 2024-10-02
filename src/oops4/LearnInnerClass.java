package oops4;

public class LearnInnerClass {
    static class Toy {
        private int price;

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    static class Playstation {
        private int price;

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Toy toy = new Toy();
        int priceOfToy = 45;
        toy.setPrice(priceOfToy);
        System.out.println("Price of toy is : " + toy.getPrice());

        Playstation playstation = new Playstation();
        int priceOfPlaystation = 35000;
        playstation.setPrice(priceOfPlaystation);
        System.out.println("Price of playstation is : " + playstation.getPrice());
    }
}
