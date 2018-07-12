package com.company;

import java.util.Comparator;

public class Bank {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public Bank(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public int isCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static Comparator<Bank> IIIOPA = new Comparator<Bank>() {
        @Override
        public int compare(Bank bank1, Bank bank2) {
            return (int) (bank1.getCourse() - bank2.getCourse());
        }
    };
}

