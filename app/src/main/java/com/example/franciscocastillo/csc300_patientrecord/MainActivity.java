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
        //initializes the array of Strings so there are place holder strings in there
        for(int i = 0; i < Core.thePatients.length; i++)
        {
            Core.thePatients[i] = new PatientRecord();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.aa = new PatientRecordArrayAdapter(this, R.layout.list_view_row_advanced, Core.thePatients);
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(Core.aa);

        //Start Listening for changes to the database
        Core.listenForDatabaseChanges(); //non-blocking!!!!

    }
    public void APRbuttonPressed(View v){
        Intent i = new Intent(this, patient_record_add_new.class);
        this.startActivity(i);

    }
}
