package com.example.myfirstapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.findRestaurantsbutton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindRestaurantsButton.setOnClickListener(this);}

            @Override
            public void onClick(View v) {
                if(v == mFindRestaurantsButton){
                    String location= mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
        //                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
                    intent.putExtra("location", location);
                    startActivity(intent);

                }

            }

    }
    
