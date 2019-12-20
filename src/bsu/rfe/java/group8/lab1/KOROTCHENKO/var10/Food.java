package bsu.rfe.java.group8.lab1.KOROTCHENKO.var10;

public abstract class Food implements Consumable, Nutritious{
    protected String name = null;

    public Food(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food)arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }
    public boolean equals_type(Object arg0){
        if (!(arg0 instanceof Food)) {
            return false;}
        if (name == null || ((Food)arg0).name == null) {
            return false;
        }
        if (name.equals(((Food)arg0).name)){
            return true;
        }
        return false;
    }
}