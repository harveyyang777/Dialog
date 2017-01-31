package com.example.harvey.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    AlertDialog.Builder bdr;
    Toast tos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdr=new AlertDialog.Builder(this);
        bdr.setIcon(android.R.drawable.alert_light_frame);
       // bdr.setCancelable(false);
        bdr.setMessage("message");
        bdr.setTitle("title");
        bdr.setPositiveButton("喜欢",this);
        bdr.setNegativeButton("不喜欢",this);
        bdr.setNeutralButton("没意见",this);
        tos=Toast.makeText(this,"",Toast.LENGTH_LONG);

    }

    public void show(View v){

        bdr.show();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        String msg;
        if (which==DialogInterface.BUTTON_POSITIVE){
            msg="喜欢";

        }else if(which==DialogInterface.BUTTON_NEGATIVE){

            msg="不喜欢";
        }else{

            msg="没意见";
        }
        tos.setText(msg);
        tos.show();

    }
}
