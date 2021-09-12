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

public class IceboxFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_icebox, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Icebox");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Spawn to Default A");
        m.setDescription("A attack post plant lineup. Good if you are watching flank with turret, but will need to get the timing right (lineup is thrown a long way away from plant). ");
        m.setImg(R.drawable.icebox_spawn_to_default_a);
        m.setUrl("pr7z6J4yAHA");
        models.add(m);

        m = new Model();
        m.setTitle("Ropes to Default A");
        m.setDescription("A attack post plant lineup. Align yourself with the right edge of the wall.");
        m.setImg(R.drawable.icebox_ropes_to_default_b);
        m.setUrl("3mvNI7aUviI");
        models.add(m);

        m = new Model();
        m.setTitle("Cubby to Default B");
        m.setDescription("B attack post plant lineup. ");
        m.setImg(R.drawable.icebox_cubby_to_default_b);
        m.setUrl("SLnq6OtPTeI");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}