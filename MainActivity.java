package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cal= (Button) findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView num1=(TextView) findViewById(R.id.num1);
                TextView num2=(TextView) findViewById(R.id.num2);
                TextView res=(TextView) findViewById(R.id.res);
                int n1=Integer.parseInt(num1.toString());
                int n2=Integer.parseInt(num2.toString());
                int result=n1+n2;
                res.setText(result+"");


            }
        });
    }
}
