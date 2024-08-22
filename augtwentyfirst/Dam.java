package com.xworkz.augtwentyfirst;

public class Dam {
    private String[] names = new String[7];
    private int index = 0;

    public void save(String name) {
        this.names[this.index] = name;
        this.index++;
    }

    public void ShowNames() {
        System.out.println("running ShowNames");
        for (String name : this.names) {
            System.out.println("Name:" + name);
        }
    }
}
