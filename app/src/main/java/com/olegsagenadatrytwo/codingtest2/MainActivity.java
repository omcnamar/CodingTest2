package com.olegsagenadatrytwo.codingtest2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AddCarFragment.OnFragmentInteractionListener,
                                                                ListOfCarsFragment.OnFragmentInteractionListener{

    private static final String TAG = "MainActivity";
    ArrayList<Car> cars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cars = new ArrayList<>();
    }

    @Override
    public void onFragmentInteraction(Car car) {
        cars.add(car);
        Toast.makeText(this, "Saved Car", Toast.LENGTH_SHORT).show();
        ListOfCarsFragment fragment = (ListOfCarsFragment) getSupportFragmentManager().findFragmentById(R.id.rvFragment);
        fragment.setCars(cars);
        fragment.adapter.notifyDataSetChanged();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
