package com.neo.model;

public class Laogong {
    private String name;
    private String typo;

    public Laogong(String name, String typo) {
        this.name = name;
        this.typo = typo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypo() {
        return typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }
}
