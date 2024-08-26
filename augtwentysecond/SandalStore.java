package com.xworkz.augtwentysecond;

public class SandalStore {
    private SandalData[] datas = new SandalData[5];
    private int index = 0;

    public void save(SandalData data) {
        System.out.println("save SandalData");
        this.datas[this.index] = data;
        this.index++;
    }

    public void display() {
        System.out.println("display SandalData");
        for (SandalData data : this.datas) {
            if (data != null) {
                data.show();
            } else {
                System.out.println("data is null");
            }
        }
    }
}

