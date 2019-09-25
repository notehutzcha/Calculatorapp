package sdu.cs.teerapat.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร
        final EditText numberEditText1 = findViewById(R.id.edt_1);
        final EditText numeberEditText2 = findViewById(R.id.edt_2);

        Button button1 = findViewById(R.id.btn_1);
        final TextView textView1 = findViewById(R.id.tv_result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numeberEditText2.getText().toString());

                int result = num1 + num2 ;
                textView1.setText(result+"");

            }
        });

    } // end onCreate()
} //end class
