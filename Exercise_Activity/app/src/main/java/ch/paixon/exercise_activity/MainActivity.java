package ch.paixon.exercise_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonShowText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.buttonShowText, Toast.LENGTH_LONG);
            }
        });

        // TODO: Find the button which is defined in the XML with the Id buttonShowText (Hint: findViewById(...))
        // TODO: Add an OnClickListener to react on the user Click
        // TODO: Use Toast.makeText(...).show() to show a Toast
    }
}
