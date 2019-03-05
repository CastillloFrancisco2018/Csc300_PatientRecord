package com.example.franciscocastillo.csc300_patientrecord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class patient_record_add_new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_record_add_new);
    }
    public void addNewButtonPressed(View v){
        EditText firstNameET = (EditText)this.findViewById(R.id.firstnameET);
        EditText lastNameET = (EditText)this.findViewById(R.id.lastnameET);
        EditText middleInitialET = (EditText)this.findViewById(R.id.middleinitialET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);

        String fname = firstNameET.getText().toString();
        String lname = lastNameET.getText().toString();
        char middleInitial = middleInitialET.getText().toString().charAt(0);
        int age = Integer.parseInt(ageET.getText().toString());
        PatientRecord pr = new PatientRecord(fname, lname, middleInitial, age);
        Core.addPatientRecordDB(pr);
        this.finish();


    }

}
