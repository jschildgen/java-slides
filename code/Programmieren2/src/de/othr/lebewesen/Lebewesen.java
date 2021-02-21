package de.othr.lebewesen;

public abstract class Lebewesen {
    protected int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void erhoeheAlter() {
        this.alter++;
    }

    public abstract String getDetails();
}
