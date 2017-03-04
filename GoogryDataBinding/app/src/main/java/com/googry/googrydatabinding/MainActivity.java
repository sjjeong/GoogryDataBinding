package com.googry.googrydatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @OnClick(R.id.btnExam1)
    void onClickExam1() {
        startActivity(new Intent(getApplicationContext(), Exam1BaseActivity.class));
    }

    @OnClick(R.id.btnExam2)
    void onClickExam2() {
        startActivity(new Intent(getApplicationContext(), Exam2ButterKnifeActivity.class));
    }

    @OnClick(R.id.btnExam3)
    void onClickExam3() {
        startActivity(new Intent(getApplicationContext(), Exam3DataBindingActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
