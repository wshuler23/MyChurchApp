package edu.desu.dsuappacademy.mychurchapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeFragment extends Fragment {
    View myView;
    VideoView videov;
    ImageButton playBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.first_layout, container, false);

        return myView;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
       videov = (VideoView) view.findViewById(R.id.videoView);
        playBtn = (ImageButton) view.findViewById(R.id.buttonXYZ);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoplay(view);
            }
        });
        Log.v("HomeFragment", "on view created");
    }

    public void videoplay(View view){
        Log.v("HomeFragment", "In Video Play");
        String videopath = "android.resource://edu.desu.dsuappacademy.mychurchapp/"
                + R.raw.pastor;
        Uri uri = Uri.parse(videopath);
        playBtn.setVisibility(View.GONE);
        videov.setVideoURI(uri);
        MediaController mediaC = new MediaController(getContext());
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }

}

