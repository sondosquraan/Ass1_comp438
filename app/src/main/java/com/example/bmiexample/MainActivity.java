package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.bmiexample.model.Sport;
import com.example.bmiexample.model.SportsGames;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText wight;
    private EditText hieght;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wight= findViewById(R.id.edtwight);
        hieght=findViewById(R.id.edthight);
        spinner=findViewById(R.id.spinner);
    }

    public void btnShow_Click(View view) {
      String type= spinner.getSelectedItem().toString();
        SportsGames model =new SportsGames();
        ArrayList<Sport> result = model.getSportsByType(type);
        String msg="";
        if(!result.isEmpty()){
            for(Sport s : result){
                msg+= "Model= "+s.getModel() +"type= "+s.getType()+"year= "+s.getYear()+"\n";
            }
        }else{
            msg="no Sports found";
        }
        wight.setText(msg);
    }
}