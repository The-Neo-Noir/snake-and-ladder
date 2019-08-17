package com.bullraider.oop;

public class Die {

    private int number;


    public Die(int number) {
        if(number<1 || number>6){
            throw new UnsupportedOperationException("Dice can only be 1 or 6");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int addDice(Die die) {
        return die.number+this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Die)) return false;

        Die die = (Die) o;

        return getNumber() == die.getNumber();
    }

    @Override
    public String toString() {
        return "Die{" +
                "number=" + number +
                '}';
    }

    @Override
    public int hashCode() {
        return getNumber();
    }
}
