package com.practical.webservices.restfulwebservices.User;


import java.util.Comparator;

public class CustomCompareByComparator implements Comparator<CustomCompareByComparator> {

    private String name;

    private int number;

    public CustomCompareByComparator() {
    }

    public CustomCompareByComparator(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compare(CustomCompareByComparator cus1, CustomCompareByComparator cus2) {
        return cus2.name.compareTo(cus1.name);
    }
}
