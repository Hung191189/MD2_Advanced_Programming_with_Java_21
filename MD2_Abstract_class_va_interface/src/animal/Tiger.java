package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger: eo eo eo";
    }

    @Override
    public String howToEat() {
        return "Kill";
    }
}
