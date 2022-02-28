package com.example.electriccounting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtCusName, txtOldNum, txtNewNum;
    TextView txtUsedNum, txtTotal;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int kwUsed = Integer.parseInt(String.valueOf(txtNewNum.getText().toString())) - Integer.parseInt(String.valueOf(txtOldNum.getText().toString()));
                txtUsedNum.setText(String.valueOf(kwUsed));
                float totalPay = 0;
                if(kwUsed <= 100) {
                    totalPay = kwUsed *1500;
                }else if(kwUsed > 100 && kwUsed <= 200){
                    totalPay = (kwUsed - 100) * 2000 + (100 * 1500);
                }else {
                    totalPay = (kwUsed - 200) * 3000 + (100 * 2000) + (100 * 1500);
                }

                txtTotal.setText(String.valueOf(totalPay));
            }
        });

    }

    public void init(){
        txtCusName = findViewById(R.id.txtCusName);
        txtOldNum = findViewById(R.id.txtOldNum);
        txtNewNum = findViewById(R.id.txtNewNum);
        txtUsedNum = findViewById(R.id.txtUsedNum);
        txtTotal = findViewById(R.id.txtTotal);
        btnFinish = findViewById(R.id.btnFinish);


    }

}