package com.example.franciscocastillo.csc300_patientrecord;

public class PatientRecord {
    //fields
    private String first_name;
    private String last_name;
    private char middle_initial;
    private int age;

    public PatientRecord(String first_name,String last_name,char middle_initial,int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_initial = middle_initial;
        this.age = age;

    }
    //getter and setter methods
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMiddle_initial(char middle_initial) {
        this.middle_initial = middle_initial;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public char getMiddle_initial() {
        return middle_initial;
    }

    public int getAge() {
        return age;
    }
    public String display(){
        String tempStr = (this.first_name + " " + this.last_name + " " + this.middle_initial + this.age);
        return(tempStr);
    }
}

