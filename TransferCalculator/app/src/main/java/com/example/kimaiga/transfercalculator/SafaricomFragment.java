package com.example.kimaiga.transfercalculator;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kimaiga on 11/9/15.
 */
public class SafaricomFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.safaricom_layout, container, false);
//        Bundle bundle = getIntent().getExtras();
//        int amount = bundle.getInt("amount");
//        Log.d("Amount:: " + amount, "KSH");
    }
}