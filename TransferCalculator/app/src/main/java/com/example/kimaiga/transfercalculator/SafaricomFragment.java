package com.example.kimaiga.transfercalculator;

//import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;



/**
 * Created by kimaiga on 11/9/15.
 */
public class SafaricomFragment extends Fragment {
    public int amount;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Lib", Context.MODE_PRIVATE);
        amount = (sharedPreferences.getInt("amount",0));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.safaricom_layout, container, false);
        Log.d("Money::","KSH: "+amount);
        return view;
    }

}