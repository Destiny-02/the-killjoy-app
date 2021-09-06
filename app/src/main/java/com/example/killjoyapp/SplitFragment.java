package com.example.killjoyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SplitFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_split, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Split");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Lobby to Default");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.split_lobby_to_default);
        m.setUrl("b75oWotAycs");
        models.add(m);

        m = new Model();
        m.setTitle("Heaven to Default");
        m.setDescription("B attack or defense lineup. ");
        m.setImg(R.drawable.split_heaven_default);
        m.setUrl("pLMxA8dhr6Y");
        models.add(m);

        m = new Model();
        m.setTitle("CT to Default");
        m.setDescription("B attack or defense lineup. ");
        m.setImg(R.drawable.split_ct_to_default);
        m.setUrl("3N3Nas0qwWo");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Left Corner");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.split_lobby_to_left_corner);
        m.setUrl("bSmAGaReDfQ");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Middle");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.split_lobby_to_middle);
        m.setUrl("IE1BIrspXcI");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}