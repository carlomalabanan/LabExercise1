package com.example.mraec.labexer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView evenText, higherText;
    EditText firstNum, secondNum;
    Button GO, compare;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        evenText = (TextView)findViewById(R.id.evenText);
        higherText = (TextView)findViewById(R.id.higherText);
        firstNum = (EditText)findViewById(R.id.firstNum);
        secondNum = (EditText)findViewById(R.id.secondNum);
        GO = (Button)findViewById(R.id.GO);
        compare = (Button)findViewById(R.id.compare);

        GO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int y =0;
                int x =0;
                do{
                    evenText.setText("= ");
                    for (x = 1; x<y; x++) {
                        if (x % 2 == 0) {
                            evenText.append(x + " ");
                        }
                    }
                    y++;
                }while(y<22);
            }
        });

        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(firstNum.getText().toString());
                num2 = Integer.parseInt(secondNum.getText().toString());

                if(num1 > num2){
                    higherText.setText( "First number is higher than the second number");
                }else if (num2 > num1){
                    higherText.setText("Second number is higher than the first number");
                }else if(num1 == num2){
                    higherText.setText("The numbers are equal");
                }else {
                    higherText.setText("Invalid input");
                }
            }
        });
    }
}
