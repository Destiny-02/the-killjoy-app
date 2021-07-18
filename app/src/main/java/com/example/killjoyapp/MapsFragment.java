package com.example.killjoyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MapsFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Setups");
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.maps_button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_AscentFragment);
            }
        });

        view.findViewById(R.id.maps_button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_SplitFragment);
            }
        });

        view.findViewById(R.id.maps_button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_HavenFragment);
            }
        });

        view.findViewById(R.id.maps_button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_BindFragment);
            }
        });

        view.findViewById(R.id.maps_button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_IceboxFragment);
            }
        });

        view.findViewById(R.id.maps_button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MapsFragment.this)
                        .navigate(R.id.action_MapsFragment_to_BreezeFragment);
            }
        });


    }
}