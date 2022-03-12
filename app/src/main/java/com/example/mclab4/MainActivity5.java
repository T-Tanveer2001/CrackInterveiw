package com.example.mclab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11,tv14;
    String[] true_false;
    Button bt1;
    int marks;
    RadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7, rd8, rd9, rd10, rd11, rd12, rd13, rd14, rd15, rd16, rd17, rd18, rd19, rd20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        rd1 = findViewById(R.id.radioButton1);
        rd2 = findViewById(R.id.radioButton2);
        rd3 = findViewById(R.id.radioButton3);
        rd4 = findViewById(R.id.radioButton4);
        rd5 = findViewById(R.id.radioButton5);
        rd6 = findViewById(R.id.radioButton6);
        rd7 = findViewById(R.id.radioButton7);
        rd8 = findViewById(R.id.radioButton8);
        rd9 = findViewById(R.id.radioButton9);
        rd10 = findViewById(R.id.radioButton10);
        rd11 = findViewById(R.id.radioButton11);
        rd12 = findViewById(R.id.radioButton12);
        rd13 = findViewById(R.id.radioButton13);
        rd14 = findViewById(R.id.radioButton14);
        rd15 = findViewById(R.id.radioButton15);
        rd16 = findViewById(R.id.radioButton16);
        rd17 = findViewById(R.id.radioButton17);
        rd18 = findViewById(R.id.radioButton18);
        rd19 = findViewById(R.id.radioButton19);
        rd20 = findViewById(R.id.radioButton20);
        bt1 = findViewById(R.id.button23);
        tv14=findViewById(R.id.textView14);
        true_false = (getResources().getStringArray(R.array.true_false));




    }

    public void onRadioclick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton1:
                if (rd1.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton2:
                if (rd2.isChecked()) {
                    if (rd2.getText() == true_false[0]) {

                    }
                }
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton3:
                if (rd3.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton4:
                if (rd4.isChecked()) {
                    if (rd4.getText() == true_false[1]) {

                    }
                }
                break;
        }


        switch (view.getId()) {
            case R.id.radioButton5:
                if (rd5.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton6:
                if (rd6.isChecked()) {
                    if (rd6.getText() == true_false[2]) {

                    }
                }
                break;
        }


        switch (view.getId()) {
            case R.id.radioButton7:
                if (rd7.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton8:
                if (rd8.isChecked()) {
                    if (rd8.getText() == true_false[3]) {

                    }
                }
                break;
        }


        switch (view.getId()) {
            case R.id.radioButton9:
                if (rd9.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton10:
                if (rd10.isChecked()) {
                    if (rd10.getText() == true_false[4]) {

                    }
                }
                break;

        }

        switch (view.getId()) {
            case R.id.radioButton11:
                if (rd11.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton12:
                if (rd12.isChecked()) {
                    if (rd12.getText() == true_false[5]) {

                    }
                }
                break;

        }

        switch (view.getId()) {
            case R.id.radioButton13:
                if (rd13.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton14:
                if (rd14.isChecked()) {
                    if (rd14.getText() == true_false[6]) {

                    }
                }
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton15:
                if (rd15.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton16:
                if (rd16.isChecked()) {
                    if (rd16.getText() == true_false[7]) {

                    }
                }
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton17:
                if (rd17.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton18:
                if (rd18.isChecked()) {
                    if (rd18.getText() == true_false[8]) {

                    }
                }
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton19:
                if (rd19.isChecked()) {


                    marks++;

                }
                break;

            case R.id.radioButton20:
                if (rd20.isChecked()) {
                    if (rd20.getText() == true_false[9]) {

                    }
                }
                break;
        }
    }


    public void click(View view) {
        tv14.setText(" Obtained Marks --> " + marks);
    }
}