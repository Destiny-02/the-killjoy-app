package com.example.killjoyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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

        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();

        m.setTitle("News Feed");
        m.setDescription("This is newsfeed description .... ");
        m.setImg(R.drawable.grenade_icon);
        models.add(m);

        m = new Model();
        m.setTitle("Stuff");
        m.setDescription("aefawefawef");
        m.setImg(R.drawable.ascent_map);
        models.add(m);

        m = new Model();
        m.setTitle("I am a title");
        m.setDescription("eeeeeeeeeeee");
        m.setImg(R.drawable.map_image_test);
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}