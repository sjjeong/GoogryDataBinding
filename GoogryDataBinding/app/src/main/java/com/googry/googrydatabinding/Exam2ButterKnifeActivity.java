package com.googry.googrydatabinding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Googry on 2017-03-04.
 */

public class Exam2ButterKnifeActivity extends AppCompatActivity {
    @BindView(R.id.tvText1)
    TextView tvText1;
    @BindView(R.id.tvText2)
    TextView tvText2;
    @BindView(R.id.tvText3)
    TextView tvText3;
    @BindView(R.id.tvText4)
    TextView tvText4;
    @BindView(R.id.tvText5)
    TextView tvText5;
    @BindView(R.id.btnSample)
    Button btnSample;

    @OnClick(R.id.btnSample)
    void onClickSample(){
        Toast.makeText(getApplicationContext(),
                "Exam2ButterKnifeActivity",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_exam2);
        ButterKnife.bind(this);

        FoodList foodList = new FoodList();
        tvText1.setText(foodList.getFood1());
        tvText2.setText(foodList.getFood2());
        tvText3.setText(foodList.getFood3());
        tvText4.setText(foodList.getFood4());
        tvText5.setText(foodList.getFood5());
    }
}
