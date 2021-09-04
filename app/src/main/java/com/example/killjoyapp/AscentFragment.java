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

        m.setTitle("Wines to Green Boxes");
        m.setDescription("A attack post plant lineup. Crouch when following the video and perform a jump throw. ");
        m.setImg(R.drawable.wines_to_green_boxes);
        m.setVideoUrl("https://www.youtube.com/watch?v=Q0y3EIc-IlE");
        models.add(m);

        m = new Model();
        m.setTitle("Wines to Generator (Front) ");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.wines_to_front_of_generator);
        m.setVideoUrl("https://www.youtube.com/watch?v=wHFnrb8Mb_o");
        models.add(m);

        m = new Model();
        m.setTitle("Tree to Wines");
        m.setDescription("A defense lineup. Can be used with ultimate at tree/glass. ");
        m.setImg(R.drawable.tree_to_wines);
        m.setVideoUrl("https://www.youtube.com/watch?v=1kqj4mbGOro");
        models.add(m);

        m = new Model();
        m.setTitle("Tree to Generator (Front)");
        m.setDescription("A defense lineup. Can be used delay a plant. ");
        m.setImg(R.drawable.tree_to_front_of_generator);
        m.setVideoUrl("https://www.youtube.com/watch?v=jTSQdptzmnI");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Heaven (Right-side)");
        m.setDescription("A attack lineup. ");
        m.setImg(R.drawable.lobby_to_right_side_of_heaven);
        m.setVideoUrl("https://www.youtube.com/watch?v=pMlv4T1r9gA");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Green Boxes (Front) ");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.lobby_to_front_of_green_boxes);
        m.setVideoUrl("https://www.youtube.com/watch?v=-WluqbphzKk");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Generator (Front) ");
        m.setDescription("A attack post plant lineup. ");
        m.setImg(R.drawable.lobby_to_front_of_generator);
        m.setVideoUrl("https://www.youtube.com/watch?v=mkj7dnvgEto");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Green Boxes (Back) ");
        m.setDescription("A attack lineup. Can be used clear the area or for post plant. ");
        m.setImg(R.drawable.lobby_to_back_of_green_boxes);
        m.setVideoUrl("https://www.youtube.com/watch?v=33dpk1-Z5Qk");
        models.add(m);

        m = new Model();
        m.setTitle("Lobby to Generator (Back) ");
        m.setDescription("A attack lineup. Can be used clear the area or for post plant. ");
        m.setImg(R.drawable.lobby_to_back_of_generator);
        m.setVideoUrl("https://www.youtube.com/watch?v=ExQSqFWfbZE");
        models.add(m);

        m = new Model();
        m.setTitle("Hidden Grenades Around Generator");
        m.setDescription("A attack. Can be used with alarm bot. ");
        m.setImg(R.drawable.hidden_grenades_generator);
        m.setVideoUrl("https://www.youtube.com/watch?v=LQGw91XzCeY");
        models.add(m);

        m = new Model();
        m.setTitle("Grenade for Heaven");
        m.setDescription("Can be used with alarm bot or turret to delay a retake. ");
        m.setImg(R.drawable.hell_to_heaven);
        m.setVideoUrl("https://www.youtube.com/watch?v=QsLqTfFikWQ");
        models.add(m);

        m = new Model();
        m.setTitle("Heaven to Generator (Front) #1");
        m.setDescription("A defense lineup. Can be used delay a plant.");
        m.setImg(R.drawable.heaven_to_front_of_generator_01);
        m.setVideoUrl("https://www.youtube.com/watch?v=LRnYff-VINQ");
        models.add(m);

        m = new Model();
        m.setTitle("Heaven to Generator (Front) #2");
        m.setDescription("A attack. Can be used with alarm bot. ");
        m.setImg(R.drawable.heaven_to_front_of_generator_02);
        m.setVideoUrl("https://www.youtube.com/watch?v=ZrvsbaxTpns");
        models.add(m);

        return models;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}