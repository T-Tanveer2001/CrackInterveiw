package com.example.mclab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    Button bt1;
    int marks;
    String[] quiz_ans;
    RadioButton rd1, rd2, rd3, rd4, rd5, rd6, rd7, rd8, rd9, rd10, rd11, rd12, rd13, rd14, rd15, rd16, rd17, rd18, rd19, rd20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bt1 = findViewById(R.id.button8);


        tv5 = findViewById(R.id.textView22);
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
        quiz_ans = (getResources().getStringArray(R.array.quiz));

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv5.setText(" Obtained Marks --> " + marks);
            }
        });
    }

    public void onRadioClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton1:
                if (rd1.isChecked()) {


                        marks++;

                }
                break;

            case R.id.radioButton2:
                if (rd2.isChecked()) {
                    if (rd2.getText() == quiz_ans[0]) {

                    }
                }
                break;

            case R.id.radioButton3:
                if (rd3.isChecked()) {
                    if (rd3.getText() == quiz_ans[0]) {

                    }
                }
                break;

            case R.id.radioButton4:
                if (rd4.isChecked()) {
                    if (rd4.getText() == quiz_ans[0]) {

                    }
                }
                break;
        }
        switch (view.getId()) {
            case R.id.radioButton5:
                if (checked) {

                        marks++;

                }
                break;


            case R.id.radioButton6:
                if (checked) {
                    if (rd6.getText() == quiz_ans[1]) {
                    }
                }
                break;

            case R.id.radioButton7:
                if (checked) {
                    if (rd7.getText() == quiz_ans[1]) {
                    }
                }
                break;

            case R.id.radioButton8:
                if (checked) {
                    if (rd8.getText() == quiz_ans[1]) {
                    }
                }
                break;
        }

        switch (view.getId()) {
            case R.id.radioButton9:
                if (checked) {
                    if (rd9.getText() == quiz_ans[2]) {
                    }
                }
                break;

            case R.id.radioButton10:
                if (checked) {

                        marks++;


                }
                break;

            case R.id.radioButton11:
                if (checked) {
                    if (rd11.getText() == quiz_ans[2]) {
                    }
                }

                break;

            case R.id.radioButton12:
                if (checked) {
                    if (rd12.getText() == quiz_ans[2]) {
                    }
                }

                break;
        }

        switch (view.getId()) {
            case R.id.radioButton13:
                if (checked) {

                        marks++;

                    }
                    break;

                    case R.id.radioButton14:
                        if (checked) {
                            if (rd14.getText() == quiz_ans[3]) {
                            }
                        }

                        break;

                    case R.id.radioButton15:
                        if (checked) {
                            if (rd15.getText() == quiz_ans[3]) {
                            }
                        }
                            break;

                    case R.id.radioButton16:
                        if (checked) {
                            if (rd16.getText() == quiz_ans[3]) {
                            }
                        }
                            break;
                }

        switch (view.getId())
        {
            case R.id.radioButton17:
            if(checked) {

                    marks++;
            }


            case R.id.radioButton18:
                if (checked) {
                    if (rd18.getText() == quiz_ans[4])
                    {}
                }
                    break;

            case R.id.radioButton19:
                if (checked) {
                    if (rd19.getText() == quiz_ans[4]) {
                    }
                }
                    break;

            case R.id.radioButton20:
                if(checked) {
                    if (rd20.getText() == quiz_ans[4])
                    {}
                        break;
                }
        }

    }


}