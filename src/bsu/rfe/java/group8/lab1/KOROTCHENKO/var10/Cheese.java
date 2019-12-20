package bsu.rfe.java.group8.lab1.KOROTCHENKO.var10;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " has eaten");
    }

    public int calculateCalories(){
        return 80;
    }

}
