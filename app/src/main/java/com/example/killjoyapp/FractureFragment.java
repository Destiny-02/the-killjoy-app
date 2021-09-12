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

public class FractureFragment extends Fragment {

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_fracture, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        myAdapter = new MyAdapter(getContext(), getMyList());
        recyclerView.setAdapter(myAdapter);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Fracture");
        // Inflate the layout for this fragment
        return v;
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Spawn to Default B");
        m.setDescription("B site attack post plant lineup. Align yourself with the line behind the tall box. Crosshair on the gap in the ferns. Perform a jump throw. ");
        m.setImg(R.drawable.fracture_spawn_to_default_b);
        m.setUrl("1YMu8G_z74E");
        models.add(m);

        m = new Model();
        m.setTitle("Vines to B Green Boxes");
        m.setDescription("B Site attack post plant lineup. Align crosshair with tip of leaves. Close leaves = far lineup. ");
        m.setImg(R.drawable.fracture_vines_to_b_green_boxes_near_and_far);
        m.setUrl("fjqshXRgWRY");
        models.add(m);

        m = new Model();
        m.setTitle("Satellite to A Plants");
        m.setDescription("A site attack post plant lineup. For the upper floor lineup, align turret diamond with left corner. ");
        m.setImg(R.drawable.fracture_satellite_to_a_lower_and_upper);
        m.setUrl("73hweAsE9ns");
        models.add(m);

        m = new Model();
        m.setTitle("Ropes to Top of Green Boxes B");
        m.setDescription("B site attack post plant lineup. Tuck left and bottom corners of grenade icon in rectangles. Thrown from middle of two boxes. ");
        m.setImg(R.drawable.fracture_ropes_to_top_of_green_boxes_b);
        m.setUrl("qVzonazgSAE");
        models.add(m);

        m = new Model();
        m.setTitle("Ropes to Backsite B");
        m.setDescription("B site attack post plant lineup. Align right of HUD with corner. Thrown from middle of two boxes. ");
        m.setImg(R.drawable.fracture_ropes_to_backsite_b);
        m.setUrl("imk17Zx2OGA");
        models.add(m);

        m = new Model();
        m.setTitle("Ropes/Doors to A Lower");
        m.setDescription("A site attack post plant lineup. Align cross hair to top middle of right side of building. Thrown from right corner of dark grey rectangle. ");
        m.setImg(R.drawable.fracture_ropes_and_doors_to_a_lower);
        m.setUrl("fKF8viJGf7w");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}