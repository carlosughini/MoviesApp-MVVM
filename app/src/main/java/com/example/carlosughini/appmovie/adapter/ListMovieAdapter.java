package com.example.carlosughini.appmovie.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carlosughini.appmovie.R;

import butterknife.ButterKnife;

public class MainListMovieAdapter extends RecyclerView.Adapter<MainListMovieAdapter.ViewHolder> {



    @NonNull
    @Override
    public MainListMovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_list_row, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView)
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainListMovieAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Wait to do
        }
    }
}
