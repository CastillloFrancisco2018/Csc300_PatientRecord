package com.example.franciscocastillo.csc300_patientrecord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        for (int i = 0; i<Core.thePatientStrings.length; i++)
        {
            Core.thePatientStrings[i] = "N/A";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PatientRecord pr1 = new PatientRecord("Francisco","Castillo",'C',20);
        System.out.print(pr1.getAge());

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row, Core.thePatientStrings);
        ListView lv = (ListView)this.findViewById(R.id.listView);
        lv.setAdapter(aa);
        lv.invalidateViews();
    }
    public void APRbuttonPressed(View v){
        Intent i = new Intent(this, patient_record_add_new.class);
        this.startActivity(i);

    }
}
