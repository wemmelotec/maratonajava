package br.com.abc.javacore.streams.exemplodestreamelambda;

public class Pet {
    private PetType type;
    private String name;
    private int age;

    public Pet(PetType type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public PetType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
