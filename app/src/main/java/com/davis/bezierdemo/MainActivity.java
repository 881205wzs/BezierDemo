package com.davis.bezierdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btn = (Button)findViewById(R.id.btn_bezier_two);
        btn.setOnClickListener(this);

        btn = (Button)findViewById(R.id.btn_bezier_three);
        btn.setOnClickListener(this);

        btn = (Button)findViewById(R.id.btn_bezier_xin);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btn_bezier_two:
                intent = new Intent(MainActivity.this, BezierTwoActivity.class);
                break;
            case R.id.btn_bezier_three:
                intent = new Intent(MainActivity.this, BezierThreeActivity.class);
                break;
            case R.id.btn_bezier_xin:
                intent = new Intent(MainActivity.this, BezierXinActivity.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
