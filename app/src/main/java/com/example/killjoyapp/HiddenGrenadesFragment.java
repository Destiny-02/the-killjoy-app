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

public class HiddenGrenadesFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_hidden_grenades, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Hidden Grenades");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();

        m = new Model();
        m.setTitle("Grenades Under Generator Belt");
        m.setDescription("For A defense setups or A attack post plants on Ascent.");
        m.setImg(R.drawable.hidden_grenades_generator);
        m.setUrl("dYfNNRHfGFI");
        models.add(m);

        m = new Model();
        m.setTitle("Grenades Insider Rubbish Bags");
        m.setDescription("For A attack post plants on Ascent.");
        m.setImg(R.drawable.hidden_grenade_rubbish_bags);
        m.setUrl("uye7Nk96IfU");
        models.add(m);

        m = new Model();
        m.setTitle("Grenades inside Green Boxes");
        m.setDescription("For A defense setups or A attack post plants on Ascent. ");
        m.setImg(R.drawable.hidden_grenade_in_green_boxes);
        m.setUrl("C5ZlUSlOBVI");
        models.add(m);

        m = new Model();
        m.setTitle("Grenades for Heaven from Hell");
        m.setDescription("For A attack post plants on Ascent. Can be paired with alarm bot on heaven or turret on generator. ");
        m.setImg(R.drawable.hell_to_heaven);
        m.setUrl("DYX_Oilli6c");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}