package com.example.labr4;

public class ResidentialRoom extends Room {
    private final int numberOfBathrooms;
    private final boolean balcony;
    private final String heating;

    public ResidentialRoom(String name, double area, int numberOfBathrooms, boolean balcony, String heating) {
        super(name, area);
        this.numberOfBathrooms = numberOfBathrooms;
        this.balcony = balcony;
        this.heating = heating;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public boolean hasBalcony() {
        return balcony;
    }

    public String getHeatingType() {
        return heating;
    }

    @Override
    public String toString() {
        String balconyInfo = balcony ? "Есть балкон" : "Без балкона";
        return super.toString() + ", количество ванных комнат: " + numberOfBathrooms + ", " + balconyInfo + ", тип отопления: " + heating;
    }
}
