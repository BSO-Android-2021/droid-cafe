package com.bsoandroid.droidcafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bsoandroid.droidcafe.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Listener disimpan disini
        view.findViewById(R.id.donut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.donut_order_message));
            }
        });

        view.findViewById(R.id.ice_cream).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.ice_cream_order_message));
            }
        });

        view.findViewById(R.id.froyo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.froyo_order_message));
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void displayToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}