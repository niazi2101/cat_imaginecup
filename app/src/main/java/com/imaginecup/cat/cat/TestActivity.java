package com.imaginecup.cat.cat;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    Button btnNextQues;
    TextView question,questionNum;
    RadioButton radio1,radio2,radio3,radio4;
    RadioGroup radioGroup;
    Chronometer chronometer;

    String one = "HTML stands for?";
    String oneA = "Hyperlinks and Text Markup Language";
    String oneB = "Hyper Text Markup Language";
    String oneC = "Hyp";
    String oneD = "Hyperlinks";
    String oneCorrect = "Hyper Text Markup Language";

    String two = "table tag is used for?";
    String twoA = "create lines";
    String twoB = "create blocks";
    String twoC = "create circles";
    String twoD = "create tables";
    String twoCorrect = "create tables";

    String three = "Who is the main content creator in Web 3.0?\n";
    String threeA = "A team of developers";
    String threeB = "Computers";
    String threeC = "Users";
    String threeD = "Authors";
    String threeCorrect = "Computers";

    String four = "This is the Fourth Question";
    String fourA = "Answer One";
    String fourB = "Answer Two";
    String fourC = "Answer Three";
    String fourD = "Answer Four";
    String fourCorrect = "Answer One";

    String five = "Which of the following tags is used for paragraphs in HTML";
    String fiveA = "p";
    String fiveB = "paragraph";
    String fiveC = "pp";
    String fiveD = "para";
    String fiveCorrect = "p";

    int number = 0;
    int SELECTED = 0;


    String selectedRadio;
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        int selectedNum = 0;
        String checkedRadio;
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                {
                    //checkedRadio = radio1.getText().toString();
                    selectedNum = 1;
                }
                break;
            case R.id.radioButton2:
                if (checked)
                {
                    //checkedRadio = radio2.getText().toString();
                    selectedNum = 2;
                }
                break;
            case R.id.radioButton3:
                if (checked)
                {
                    //checkedRadio = radio3.getText().toString();
                    selectedNum = 3;
                }
                break;

            case R.id.radioButton4:
                if (checked)
                {
                    //checkedRadio = radio4.getText().toString();
                    selectedNum = 4;

                }
                break;

        }
        SELECTED = selectedNum;
        Toast.makeText(getApplicationContext(), "selected = " + selectedNum, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btnNextQues = (Button) findViewById(R.id.buttonNextQues);
        question = (TextView) findViewById(R.id.textViewQuestion);
        questionNum = (TextView) findViewById(R.id.textViewQnum);

        radioGroup=(RadioGroup)findViewById(R.id.Rgroup);

        radio1 = (RadioButton) findViewById(R.id.radioButton1);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);

        chronometer = (Chronometer) findViewById(R.id.chronometer);

        final String checkedRadio = null ;
        btnNextQues.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(getApplicationContext(), "selected = "+SELECTED, Toast.LENGTH_SHORT).show();
                        /*
                        if (number != 0) {
                            switch (number) {
                                case 1:
                                    switch (SELECTED) {
                                        case 1:
                                            if (radio1.getText().toString().equals(oneCorrect)) {
                                                Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();

                                            }
                                            break;

                                        case 2:
                                            if (radio2.getText().toString().equals(oneCorrect)) {
                                                Toast.makeText(getApplicationContext(), "two", Toast.LENGTH_SHORT).show();

                                            }

                                            break;

                                        case 3:
                                            if (radio3.getText().toString().equals(oneCorrect)) {
                                                Toast.makeText(getApplicationContext(), "three", Toast.LENGTH_SHORT).show();

                                            }
                                            break;

                                        case 4:
                                            if (radio4.getText().toString().equals(oneCorrect)) {
                                                Toast.makeText(getApplicationContext(), "four", Toast.LENGTH_SHORT).show();

                                            }
                                            break;
                                    }
                                case 2:

                                    break;

                                case 3:
                                    break;

                                case 4:
                                    break;

                                case 5:
                                    break;


                            }
                        }
                        */

                        radioGroup.clearCheck();
                        number++;

                        String Qnum = "Question # " + number + " ";

                        try {
                            if (number != 0) {
                                questionNum.setText(Qnum);
                                switch (number) {
                                    case 1:
                                        btnNextQues.setText("Next Question");
                                        chronometer.setBase(SystemClock.elapsedRealtime());
                                        chronometer.start();
                                        question.setText(one);
                                        radio1.setText(oneA);
                                        radio2.setText(oneB);
                                        radio3.setText(oneC);
                                        radio4.setText(oneD);
                                        break;

                                    case 2:
                                        question.setText(two);
                                        radio1.setText(twoA);
                                        radio2.setText(twoB);
                                        radio3.setText(twoC);
                                        radio4.setText(twoD);

                                        break;

                                    case 3:
                                        question.setText(three);
                                        radio1.setText(threeA);
                                        radio2.setText(threeB);
                                        radio3.setText(threeC);
                                        radio4.setText(threeD);
                                        break;

                                    case 4:
                                        question.setText(four);
                                        radio1.setText(fourA);
                                        radio2.setText(fourB);
                                        radio3.setText(fourC);
                                        radio4.setText(fourD);
                                        break;

                                    case 5:
                                        question.setText(five);
                                        radio1.setText(fiveA);
                                        radio2.setText(fiveB);
                                        radio3.setText(fiveC);
                                        radio4.setText(fiveD);
                                        chronometer.stop();

                                        break;

                                    case 6:
                                        Intent i = new Intent(getApplicationContext(), ResultActivity.class);
                                        startActivity(i);
                                        break;
                                }

                            }
                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "Unexpected Error", Toast.LENGTH_SHORT).show();

                        }
                    }
                });


    }

    @Override
    public void onBackPressed() {
       return;
    }
}
