package org.example.day6.part2;

class CruiseLiner extends Ship {
    private double champagneLiters;

    public CruiseLiner(String name, double speed, double champagneLiters) {
        super(name, speed);
        this.champagneLiters = champagneLiters;
    }

    public double getChampagneLiters() {
        return champagneLiters;
    }

    public void setChampagneLiters(double champagneLiters) {
        this.champagneLiters = champagneLiters;
    }

    public void throwParty(int guests) {
        double consumed = guests * 0.2;
        System.out.println("Устроена вечеринка, гости выдули " + consumed + " литров шампанского");
    }

    @Override
    public String toString() {
        return String.format("Круизный лайнер '%s', скорость: %.1f узлов", getName(), getSpeed());
    }
}
