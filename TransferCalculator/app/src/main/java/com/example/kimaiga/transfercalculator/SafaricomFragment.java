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
        View view = inflater.inflate(R.layout.safaricom_layout, container, false);
        Bundle bundle = getArguments();
        if(bundle != null)
            Log.d("Amounts:: " + bundle.getInt("amnt"), "KSH");
        return view;
//        Bundle bundle = getIntent().getExtras();
//        if(bundle != null)
//            Log.d("Amount:: " + bundle.getInt("amnt"), "KSH");
    }
}