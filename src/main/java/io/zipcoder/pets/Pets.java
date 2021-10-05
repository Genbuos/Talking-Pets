package io.zipcoder.pets;

public abstract class Pets {
    private String name;
    public String typePet;

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", typePet='" + typePet + '\'' +
                '}';
    }

    public Pets(String name, String typePet) {
        this.name = name;
        this.typePet = typePet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void Speak();


}
