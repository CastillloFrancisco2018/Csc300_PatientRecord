package com.example.franciscocastillo.csc300_patientrecord;

public class Core
{
    public static PatientRecord[] thePatient = new PatientRecord[1000];
    public static String[] thePatientStrings = new String[1000];
    public static int numberOfPatients = 0;



    public static void addPatientRecord(PatientRecord pr)
    {
        Core.thePatient[Core.numberOfPatients]= pr;
        Core.numberOfPatients++;
    }

}
