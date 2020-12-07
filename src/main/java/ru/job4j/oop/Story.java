package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Here zayac = new Here();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        kolobok.ranAwayFrom(zayac);
        zayac.lost(kolobok);
        kolobok.ranAwayFrom(volk);
        volk.lost(kolobok);
        lisa.eat(kolobok);
    }
}

