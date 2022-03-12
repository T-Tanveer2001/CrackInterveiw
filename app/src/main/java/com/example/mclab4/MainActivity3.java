package com.example.mclab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t1xx,t2yy,t3ques,t4ans;
    Button b1pre,b2A,b3N;
    String[] simple_questions,simple_answers;
    int index =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1xx=(TextView)findViewById(R.id.textView11);
        t2yy=(TextView)findViewById(R.id.textView4);
        t3ques=(TextView)findViewById(R.id.textView10);
        t4ans=(TextView)findViewById(R.id.textView12);
        b1pre=(Button) findViewById(R.id.button2);
        b2A=(Button) findViewById(R.id.button12);
        b3N=(Button) findViewById(R.id.button13);
        simple_questions=(getResources().getStringArray(R.array.Simple_questions));
        simple_answers=(getResources().getStringArray(R.array.simple_answers));
int index;
index =0;
t3ques.setText(simple_questions[index]);
t4ans.setText("Press \"Answer\" button for Answer");
t1xx.setText(String.valueOf(index+1));
t2yy.setText("/"+String.valueOf(simple_questions.length));

    }


    public void previous(View view) {

        switch (view.getId())
        {
            case R.id.button2:
                t4ans.setText("Press \"Answer\" button for Answer");
                index--;
                t3ques.setText(simple_questions[index]);
                t1xx.setText(String.valueOf(index +1));
                break;

            case R.id.button12:
                t4ans.setText(simple_answers[index]);
                break;

            case R.id.button13:
                t4ans.setText("Press \"Answer\" button for Answer");
                index++;
                t3ques.setText(simple_questions[index]);
                t1xx.setText(String.valueOf(index +1));
                break;



        }
    }
    public void answer(View view) {

        switch (view.getId())
        {
            case R.id.button2:
                t4ans.setText("Press \"Answer\" button for Answer");
                index--;
                t3ques.setText(simple_questions[index]);
                t1xx.setText(String.valueOf(index +1));
                break;

            case R.id.button12:
                t4ans.setText(simple_answers[index]);
                break;

            case R.id.button13:
                t4ans.setText("Press \"Answer\" button for Answer");
                index++;
                t3ques.setText(simple_questions[index]);
                t1xx.setText(String.valueOf(index +1));
                break;



        }

}

    public void Next(View view) {

            switch (view.getId())
            {
                case R.id.button2:
                    t4ans.setText("Press \"Answer\" button for Answer");
                    index--;
                    t3ques.setText(simple_questions[index]);
                    t1xx.setText(String.valueOf(index +1));
                    break;

                case R.id.button12:
                    t3ques.setText(simple_questions[index]);
                    index++;
                    break;

                case R.id.button13:
                    t4ans.setText("Press \"Answer\" button for Answer");
                    index++;
                    t3ques.setText(simple_questions[index]);
                    t1xx.setText(String.valueOf(index +1));
                    break;



            }
    }


}