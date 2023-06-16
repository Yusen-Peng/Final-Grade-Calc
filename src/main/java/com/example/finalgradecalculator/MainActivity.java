package com.example.finalgradecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.finalgradecalculator.databinding.ActivityMainBinding;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private double currentGrade;
    private int worth;
    private int goal;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getCurrentGrade(View v){
        TextView tv = findViewById(R.id.currentGrade);
        this.currentGrade = Integer.parseInt(tv.getText().toString());
    }

    public void getWorth(View v){
        TextView tv = findViewById(R.id.worth);
        this.worth= Integer.parseInt(tv.getText().toString());
    }

    public void getGoal(View v) {
        TextView tv = findViewById(R.id.goal);
        this.goal = Integer.parseInt(tv.getText().toString());
    }

    public void actualCalculate(View v){
        TextView tv = findViewById(R.id.result);
        this.result = (this.goal - this.currentGrade*(100-this.worth)/100)/(worth/100.0);
    }

    public String judge(double score) {
        String res = "";
        if (score > 100) {
            res = "Rest in Peace. Yusen can't help :(";
        } else if (score > 90) {
            res = "Time to hit the books! You can do it! Yusen Believes in you ^_^";
        } else if (score > 80) {
            res = "Not too bad, but do not procrastinate the final review :)";
        } else {
            res = "Chill out and have fun with your final ;)";
        }
        return res;
    }

    public void Execute(View v) {
        TextView res = findViewById(R.id.result);
        getCurrentGrade(v);
        getWorth(v);
        getGoal(v);
        actualCalculate(v);
        res.setText("You need to get " + (int)this.result + " % in the final.\n" + judge(this.result));
    }
}
