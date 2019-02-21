package com.example.franciscocastillo.csc300_patientrecord;

public class PatientRecord
{
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
    public PatientRecord(){
        this.first_name = "FNAME";
        this.last_name ="LNAME";
        this.middle_initial = 'I';
        this.age = 0;
    }

    public String getNameString()
    {
        return this.first_name+" "+this.middle_initial+" "+this.last_name;
    }

    public String getAgeString()
    {
        return "Age: ("+ this.age+") ";
    }

    public String toString()
    {
        return this.first_name+" "+this.middle_initial+" "+this.last_name+" ("+this.age+") ";
    }

    public String display()
    {
        return this.first_name+" "+this.middle_initial+" "+this.last_name+" ("+this.age+") ";

    }
}


