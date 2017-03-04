package com.googry.googrydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.googry.googrydatabinding.databinding.LayoutExam3Binding;

/**
 * Created by Googry on 2017-03-04.
 */

public class Exam3DataBindingActivity extends AppCompatActivity{
    private LayoutExam3Binding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.layout_exam3);
        binding.setActivity(this);
        binding.setFoodlist(new FoodList());
    }

    public void onClickSample(View v){
        Toast.makeText(getApplicationContext(),
                "Exam3DataBindingActivity",
                Toast.LENGTH_LONG).show();
    }
}
