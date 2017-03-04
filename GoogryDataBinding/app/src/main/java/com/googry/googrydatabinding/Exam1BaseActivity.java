package com.googry.googrydatabinding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Googry on 2017-03-04.
 */

public class Exam1BaseActivity extends AppCompatActivity {
    private TextView tvText1;
    private TextView tvText2;
    private TextView tvText3;
    private TextView tvText4;
    private TextView tvText5;
    private Button btnSample;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_exam1);

        tvText1 = (TextView) findViewById(R.id.tvText1);
        tvText2 = (TextView) findViewById(R.id.tvText2);
        tvText3 = (TextView) findViewById(R.id.tvText3);
        tvText4 = (TextView) findViewById(R.id.tvText4);
        tvText5 = (TextView) findViewById(R.id.tvText5);
        btnSample = (Button) findViewById(R.id.btnSample);

        FoodList foodList = new FoodList();
        tvText1.setText(foodList.getFood1());
        tvText2.setText(foodList.getFood2());
        tvText3.setText(foodList.getFood3());
        tvText4.setText(foodList.getFood4());
        tvText5.setText(foodList.getFood5());

        btnSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Exam1BaseActivity",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
