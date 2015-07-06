package com.marvelvance.safaricom.Mpesa;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marvelvance.safaricom.MainActivity;
import com.marvelvance.safaricom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WithdrawCashFragment extends Fragment {


    public WithdrawCashFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getResources().getString(R.string.fragment_withdraw_cash);
                ((MainActivity) getActivity()).setAcionBarTitle(String.valueOf(title));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_withdraw_cash, container, false);
    }


}
