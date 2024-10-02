package oops4;

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
    }
}

interface Pet {
    void sings();
    void drinks();
}

interface Animal {
    void eats();
    void drinks();
}

class Monkey implements Animal, Pet {
    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }
}
