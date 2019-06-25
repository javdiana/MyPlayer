package com.di.jav.myplayer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongListFragment extends Fragment {

    private RecyclerView mSongsRecyclerView;

    public static SongListFragment newInstance() {
        return new SongListFragment();
    }// TODO: 6/25/2019  

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_song_list, container, false);
        mSongsRecyclerView = view.findViewById(R.id.recyclerview_songs);
        mSongsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mSongsRecyclerView.setAdapter(new SongAdapter(new ArrayList<Song>()));
        return view;
    }


    private class SongHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mSongTextView;
        private ImageView mPlayImageView;

        private Song mSong;

        public SongHolder(@NonNull View itemView) {
            super(itemView);
            mSongTextView = itemView.findViewById(R.id.textView_song);
            mSongTextView.setOnClickListener(this);

            mPlayImageView = itemView.findViewById(R.id.imageView_play);
            mPlayImageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.textView_song:
                    showSong();
                    break;
                case R.id.imageView_play:
                    playSong();
                    break;
            }
        }

        public void bind(Song song){
            mSong = song;

            mSongTextView.setText(String.format("%s%s%s", mSong.getNameOfSong(), " ", mSong.getPerformer()));
        }

        private void showSong(){
            // TODO: 6/25/2019
        }

        private void playSong(){
            // TODO: 6/25/2019
        }
    }

    private class SongAdapter extends RecyclerView.Adapter<SongHolder> {
        private List<Song> mSongs;

        public SongAdapter(List<Song> songs) {
            mSongs = songs;
        }

        @NonNull
        @Override
        public SongHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            View view = inflater.inflate(R.layout.item_song, viewGroup, false);
            return new SongHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull SongHolder songHolder, int i) {
            Song song = new Song();//mSongs.get(i);
            song.setNameOfSong("Amy");
            song.setPerformer("Britney");
            songHolder.bind(song);

        }

        @Override
        public int getItemCount() {
            //return mSongs.size();
            return 1;
        }
    }
}
