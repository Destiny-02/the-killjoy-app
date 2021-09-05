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

public class AbilitiesFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_abilities, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Abilities");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();

        m.setTitle("Nanoswarm (C)");
        m.setDescription("EQUIP a Nanoswarm grenade. FIRE to throw the grenade. Upon landing, the Nanoswarm goes covert. ACTIVATE the Nanoswarm to deploy a damaging swarm of nanobots. Does 45 damage per second over 4 seconds. ");
        m.setImg(R.drawable.nanoswarm_icon);
        models.add(m);

        m = new Model();
        m.setTitle("Alarmbot (Q)");
        m.setDescription("EQUIP a covert Alarmbot. FIRE to deploy a bot that hunts down enemies that get in range. After reaching its target, the bot explodes and applies Vulnerable to enemies in the area. HOLD EQUIP to recall a deployed bot.");
        m.setImg(R.drawable.alarmbot_icon);
        models.add(m);

        m = new Model();
        m.setTitle("Turret (E)");
        m.setDescription("EQUIP a Turret. FIRE to deploy a turret that automatically fires at enemies in a 180 degree cone. HOLD EQUIP to recall the deployed turret.");
        m.setImg(R.drawable.turret_icon);
        models.add(m);

        m = new Model();
        m.setTitle("Lockdown (X)");
        m.setDescription("EQUIP the Lockdown device. FIRE to deploy the device. After a long windup (13s), the device Detains all enemies caught in the radius. The device can be destroyed by enemies.");
        m.setImg(R.drawable.lockdown_icon);
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}