package it.denv.timepickertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        Button set1 = (Button) findViewById(R.id.button);
        Button set2 = (Button) findViewById(R.id.button2);

        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setHour(12);
                timePicker.setMinute(56);
            }
        });

        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timePicker.setHour(3);
                timePicker.setMinute(27);
            }
        });

    }
}
