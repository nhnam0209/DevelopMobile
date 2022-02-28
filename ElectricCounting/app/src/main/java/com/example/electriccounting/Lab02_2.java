package com.example.electriccounting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lab02_2 extends AppCompatActivity {
    EditText txtName, txtId, txtMoreInfo;
    CheckBox cbSoccer, cbTravel, cbPhoto;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                doShowInformation();
            }
        });
    }

    public void doShowInformation()
    {
        String Name=txtName.getText().toString();
        if(Name.length()<3)
        {
            txtName.requestFocus();
            txtName.selectAll();
            Toast.makeText(this, "Tên phải >= 3 ký tự", Toast.LENGTH_LONG).show();
            return;
        }

        String ID=txtId.getText()+"";
        ID = ID.trim();
        if(ID.length()!=9)
        {
            txtId.requestFocus();
            txtId.selectAll();
            Toast.makeText(this,"CMND phải đúng 9 ký tự",Toast.LENGTH_LONG).show();
            return;
        }

        String Degree = "";
        RadioGroup group = (RadioGroup) findViewById(R.id.rgDegree);
        int id = group.getCheckedRadioButtonId();
        if(id == -1){
            Toast.makeText(this, "Phải chọn bằng cấp",Toast.LENGTH_LONG).show();
            return;
        }
        RadioButton rad = (RadioButton) findViewById(id);
        Degree = rad.getText() + "";

        String Hobby = "";
        if(cbSoccer.isChecked())
            Hobby+=cbSoccer.getText()+"\n";
        if(cbTravel.isChecked())
            Hobby+=cbTravel.getText()+"\n";
        if(cbPhoto.isChecked())
            Hobby+=cbPhoto.getText()+"\n";
        String MoreDetail=txtMoreInfo.getText()+"";

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        String msg = Name + "\n";
        msg += ID + "\n";
        msg += Degree + "\n";
        msg += Hobby + "\n";
        msg+="—————————–\n";
        msg += "Thông tin bổ sung\n";
        msg += MoreDetail + "\n";
        msg+="—————————–\n";
        builder.setMessage(msg);
        builder.create().show();
    }


}
