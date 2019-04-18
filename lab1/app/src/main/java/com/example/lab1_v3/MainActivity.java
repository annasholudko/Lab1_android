package com.example.lab1_v3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view)
    {
        CheckBox ch1 = (CheckBox) findViewById(R.id.checkBox10);
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkBox11);
        CheckBox ch3 = (CheckBox) findViewById(R.id.checkBox12);
        CheckBox ch4 = (CheckBox) findViewById(R.id.checkBox13);
        String selectedItems = "";
        if(ch1.isChecked())
            selectedItems +=ch1.getText() + "\n";
        if(ch2.isChecked())
            selectedItems +=ch2.getText()+"\n";
        if(ch3.isChecked())
            selectedItems +=ch3.getText()+"\n";
        if(ch4.isChecked())
            selectedItems +=ch4.getText();
        Toast.makeText(this, selectedItems, Toast.LENGTH_SHORT).show();
        if(!ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() && !ch4.isChecked())
        {
            Toast.makeText(this, "Дайтe відповідь на питання", Toast.LENGTH_SHORT).show();
        }
    }

}
