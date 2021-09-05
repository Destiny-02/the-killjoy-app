package com.example.killjoyapp;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class OtherNotesFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_other_notes, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Other Notes");

        TextView description4 = (TextView) v.findViewById(R.id.description4);
        description4.setText(R.string.sources_text);
        description4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView description2 = (TextView) v.findViewById(R.id.description2);
        description2.setText(R.string.about_author_text);
        description2.setMovementMethod(LinkMovementMethod.getInstance());

        // Inflate the layout for this fragment
        return v;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}