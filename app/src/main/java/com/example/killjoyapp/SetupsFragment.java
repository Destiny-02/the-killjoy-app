package com.example.killjoyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SetupsFragment extends Fragment {

    private TextView mTextView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setups, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SetupsFragment.this)
                        .navigate(R.id.action_SetupsFragment_to_MenuFragment);
            }
        });

        // Modal Bottom Sheet
        Button buttonOpenBottomSheet = view.findViewById(R.id.button_open_bottom_sheet);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.killjoyapp.ExampleBottomSheetDialog bottomSheet = new com.example.killjoyapp.ExampleBottomSheetDialog();
                bottomSheet.show(getActivity().getSupportFragmentManager(), "exampleBottomSheet");
            }
        });
    }

}