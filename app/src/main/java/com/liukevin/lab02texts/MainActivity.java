package com.liukevin.lab02texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button nameButton;
    Button arrayButton;
    EditText textBox;
    TextView text;
    String[] array;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        nameButton = findViewById(R.id.namebutton);
        arrayButton = findViewById(R.id.arraybutton);
        textBox = findViewById(R.id.textbox);
        text = findViewById(R.id.text);
        Resources res = getResources();
        array = res.getStringArray(R.array.array);
        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(textBox.getText().toString() + " is " + array[count]);
                Log.i("name", textBox.getText().toString());
            }
        });
        arrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count + 1 < array.length) {
                    count += 1;
                }
                else {
                    count = 0;
                }
                text.setText(textBox.getText().toString() + " is " + array[count]);
            }
        });
    }
}
