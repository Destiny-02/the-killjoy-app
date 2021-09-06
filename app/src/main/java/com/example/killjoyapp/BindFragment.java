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

public class BindFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_bind, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Bind");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Baths to Boxes");
        m.setDescription("A site attack post plant lineup. ");
        m.setImg(R.drawable.bind_baths_to_boxes);
        m.setUrl("p26-qQSey4E");
        models.add(m);

        m = new Model();
        m.setTitle("Short to Truck");
        m.setDescription("A site attack post plant lineup. ");
        m.setImg(R.drawable.bind_short_to_truck);
        m.setUrl("cTAGIe8T7XA");
        models.add(m);

        m = new Model();
        m.setTitle("Long to Default");
        m.setDescription("B site attack post plant lineup. ");
        m.setImg(R.drawable.bind_long_to_default);
        m.setUrl("7isqYQCykC4");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}