package com.example.killjoyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AscentFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_ascent, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Ascent");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();

        m.setTitle("A Site Attacker");
        m.setDescription("Lands in front of the generator. Grenade thrown from wines.");
        m.setImg(R.mipmap.ic_launcher);
        models.add(m);

        m = new Model();
        m.setTitle("A Site Attacker");
        m.setDescription("Lands in front of the generator. Grenade thrown from A lobby. ");
        m.setImg(R.mipmap.ic_launcher);
        models.add(m);

        m = new Model();
        m.setTitle("A Site Attacker");
        m.setDescription("Lands on the left side of generator. Gernade thrown from wines");
        m.setImg(R.mipmap.ic_launcher);
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}