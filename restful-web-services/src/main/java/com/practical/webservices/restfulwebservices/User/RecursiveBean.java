package com.practical.webservices.restfulwebservices.User;


import org.springframework.stereotype.Component;

@Component
public class RecursiveBean {

    private int sequence;

    public  RecursiveBean () {
    }

    public RecursiveBean(Integer sequence) {
        this.sequence = sequence;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
