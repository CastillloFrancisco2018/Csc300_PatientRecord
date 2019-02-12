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
        EditText firstnameET = (EditText)this.findViewById(R.id.firstnameET);
        EditText lastnameET = (EditText)this.findViewById(R.id.lastnameET);
        EditText middleinitialET = (EditText)this.findViewById(R.id.middleinitialET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);

        PatientRecord pr1 = new PatientRecord(firstnameET.getText().toString(), lastnameET.getText().toString(), middleinitialET.getText().toString().charAt(0), Integer.parseInt(ageET.getText().toString()));

        TextView pr1ET = this.findViewById(R.id.pr1ET);
        pr1ET.setText(pr1.display());
        Core.thePatient[Core.numberOfPatients] = pr1;
        String fname = firstnameET.getText().toString();
        String lname = lastnameET.getText().toString();
        char middleInitial = middleinitialET.getText().toString().charAt(0);
        int age = Integer.parseInt(ageET.getText().toString());
        PatientRecord pr = new PatientRecord(fname, lname, middleInitial, age);
        Core.addPatientRecord(pr1);


    }

}
