package com.example.kimaiga.transfercalculator;

//import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by kimaiga on 11/9/15.
 */
public class AirtelFragment extends Fragment {
    public int transferAmount = 0;
    public int withdrawAmount = 0;
    public int amount = 0;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view =  inflater.inflate(R.layout.airtel_layout, container, false);
        txt = (TextView)view.findViewById(R.id.textView6);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Lib", Context.MODE_PRIVATE);
        amount = (sharedPreferences.getInt("amount",0));
        txt.setText(Integer.toString(withdrawCalculateCosts(amount)));
        return view;
    }
    private static int withdrawCalculateCosts(int transAmount){

        int maxAmount = 70000;
        int minAmount = 10;
        int totalCost = 0;


        if(transAmount < minAmount || transAmount > maxAmount)
            totalCost = 0;
        else if(transAmount >= 50 && transAmount <= 100)
            totalCost = 9;
        else if(transAmount >= 101 && transAmount <= 1000)
            totalCost = 25;
        else if(transAmount >= 1001 && transAmount <= 2500)
            totalCost = 26;
        else if(transAmount >= 2501 && transAmount <= 5000)
            totalCost = 45;
        else if(transAmount >= 5001 && transAmount <= 10000)
            totalCost = 75;
        else if(transAmount >= 10001 && transAmount <= 20000)
            totalCost = 145;
        else if(transAmount >= 20001 && transAmount <= 35000)
            totalCost = 175;
        else if(transAmount >= 35001 && transAmount <= 50000)
            totalCost =  270;
        else if(transAmount >= 50001 && transAmount <= 70000)
            totalCost = 330;
        return totalCost;
    }


}
