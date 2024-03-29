package br.com.abc.javacore.crud.classes;

import java.util.Objects;

public class Estado implements Comparable<Estado>{

    private String name;

    public Estado(String name) {
        this.name = name;
    }

    //Annotation that indicates that i am overriding the superclass method
    @Override
    public String toString() {
        return "Estado{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return name.equals(estado.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Estado outroEstado) {
        return this.name.compareTo(outroEstado.getName());
    }
}
