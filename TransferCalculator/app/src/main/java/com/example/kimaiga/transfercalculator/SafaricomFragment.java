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
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by kimaiga on 11/9/15.
 */
public class SafaricomFragment extends Fragment {
    public int amount;
    TextView txt;
    TextView txt2;
    TextView txt3;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Lib", Context.MODE_PRIVATE);
        amount = (sharedPreferences.getInt("amount",0));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.safaricom_layout, container, false);
        txt = (TextView)view.findViewById(R.id.transfer_cost);
        txt2 = (TextView)view.findViewById(R.id.withdraw_cost);
        txt3 = (TextView)view.findViewById(R.id.amount);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Lib", Context.MODE_PRIVATE);
        amount = (sharedPreferences.getInt("amount",0));
        txt3.setText(Integer.toString(amount));
        txt.setText(Integer.toString(transferCalculateCosts(amount)));
        txt2.setText(Integer.toString(withdawCalculateCosts(amount)));
        return view;
    }
    private static int transferCalculateCosts(int transAmount){

        int maxAmount = 70000;
        int minAmount = 10;
        int totalCost = 0;

        if(transAmount < minAmount || transAmount > maxAmount)
            totalCost = 0;
        else if(transAmount >= 10 && transAmount <= 49)
            totalCost = 1;
        else if(transAmount >= 50 && transAmount <= 100)
            totalCost = 9;
        else if(transAmount >= 101 && transAmount <= 500)
            totalCost = 25;
        else if(transAmount >= 501 && transAmount <= 1000)
            totalCost = 26;
        else if(transAmount >= 1001 && transAmount <= 1500)
            totalCost = 45;
        else if(transAmount >= 1501 && transAmount <= 2500)
            totalCost = 75;
        else if(transAmount >= 2501 && transAmount <= 3500)
            totalCost = 145;
        else if(transAmount >= 3501 && transAmount <= 5000)
            totalCost = 175;
        else if(transAmount >= 5001 && transAmount <= 7500)
            totalCost =  270;
        else if(transAmount >= 7501 && transAmount <= 10000)
            totalCost = 330;
        else if(transAmount >= 10001 && transAmount <= 15000)
            totalCost = 330;
        else if(transAmount >= 15001 && transAmount <= 20000)
            totalCost = 330;
        else if(transAmount >= 20000 && transAmount <= 70000)
            totalCost = 330;
        return totalCost;
    }

    private static int withdawCalculateCosts(int transAmount){

        int maxAmount = 70000;
        int minAmount = 10;
        int totalCost = 0;

        if(transAmount < minAmount || transAmount > maxAmount)
            totalCost = 0;
        else if(transAmount >= 10 && transAmount <= 49)
            totalCost = 0;
        else if(transAmount >= 50 && transAmount <= 100)
            totalCost = 10;
        else if(transAmount >= 101 && transAmount <= 2500)
            totalCost = 27;
        else if(transAmount >= 2501 && transAmount <= 3500)
            totalCost = 49;
        else if(transAmount >= 3501 && transAmount <= 5000)
            totalCost = 66;
        else if(transAmount >= 5001 && transAmount <= 7500)
            totalCost = 82;
        else if(transAmount >= 7501 && transAmount <= 10000)
            totalCost = 110;
        else if(transAmount >= 10001 && transAmount <= 15000)
            totalCost = 159;
        else if(transAmount >= 15001 && transAmount <= 20000)
            totalCost =  176;
        else if(transAmount >= 20001 && transAmount <= 35000)
            totalCost = 187;
        else if(transAmount >= 35001 && transAmount <= 50000)
            totalCost = 275;
        else if(transAmount >= 50001 && transAmount <= 70000)
            totalCost = 330;
        return totalCost;
    }


}