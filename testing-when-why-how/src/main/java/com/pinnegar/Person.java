package com.pinnegar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    public LIVING_STATUS getLivingStatus() {
        return livingStatus;
    }

    public enum LIVING_STATUS {
        ALIVE, DEAD
    }
    private LIVING_STATUS livingStatus = LIVING_STATUS.ALIVE;
    private String name;
    private List<Person> children = new ArrayList<>();
    private Person parent;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person addChildren(Person... children) {
        for (Person child : children) {
            this.children.add(child);
            child.parent = this;
        }
        return this;
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person die() {
        livingStatus = LIVING_STATUS.DEAD;
        parent.children.remove(this);
        return this;
    }
}
