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

public class HavenFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_haven, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Haven");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Long to Default A");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.haven_long_to_default_a);
        m.setUrl("E7EMOEYJLmw");
        models.add(m);

        m = new Model();
        m.setTitle("Short to Heaven A");
        m.setDescription("For clearing right side of heaven on A attack. ");
        m.setImg(R.drawable.haven_short_to_heaven);
        m.setUrl("PU_8SoCyUik");
        models.add(m);

        m = new Model();
        m.setTitle("Spawn to B Front");
        m.setDescription("B attack post plant lineup. Jump throw. Can go to B window after throwing grenades. Spike can be planted in the middle, left or right. ");
        m.setImg(R.drawable.haven_spawn_to_b);
        m.setUrl("mBKbfNBTRCs");
        models.add(m);

        m = new Model();
        m.setTitle("Long to Boxes on C");
        m.setDescription("C attack post plant lineups. First lineup is for default, second is for when spike is planted for long. ");
        m.setImg(R.drawable.haven_long_to_default_c);
        m.setUrl("rTqV4_Ha_l4");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}