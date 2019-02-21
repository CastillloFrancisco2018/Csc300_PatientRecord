package com.example.franciscocastillo.csc300_patientrecord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private PatientRecordArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for (int i = 0; i<Core.thePatient.length; i++)
        {
            Core.thePatient[i] = new PatientRecord();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter aa2 = new ArrayAdapter(this, R.layout.list_view_row, Core.thePatientStrings);
        this.aa = new PatientRecordArrayAdapter(this,R.layout.list_view_row_advanced,Core.thePatient);
        this.lv = this.findViewById(R.id.listView);
        this.lv.setAdapter(aa);

    }
    public void APRbuttonPressed(View v){
        Intent i = new Intent(this, patient_record_add_new.class);
        this.startActivity(i);

    }
}
