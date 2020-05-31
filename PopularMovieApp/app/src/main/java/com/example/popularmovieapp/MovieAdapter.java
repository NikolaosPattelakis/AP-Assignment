package com.example.popularmovieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter <MovieAdapter.MovieViewHolder> {


    private Context mContext;
    private ArrayList<Movie> mMovieArrayList;

    public MovieAdapter(Context context, ArrayList<Movie> movieArrayList){
        this.mContext = context;
        this.mMovieArrayList = movieArrayList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.mContext).inflate(R.layout.movie, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int position) {
        Movie currentMovie = mMovieArrayList.get(position);

        String imageUrl = ("https://image.tmdb.org/t/p/w185" + currentMovie.getImageUrl());
        String title = currentMovie.getTitle();
        int popularity = currentMovie.getPopularity();
        String description = currentMovie.getDescription();

        movieViewHolder.mTextViewTitle.setText(title);
        movieViewHolder.mTextViewPopularity.setText("Popularity: " + popularity);
        movieViewHolder.mDescription.setText("Description: \n" + description);

        Picasso.get().load(imageUrl).fit().centerInside().into(movieViewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mMovieArrayList.size();
    }


    public class MovieViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextViewTitle;
        public TextView mTextViewPopularity;
        public TextView mDescription;

        public MovieViewHolder(@NonNull View movieView) {
            super(movieView);

            this.mImageView = movieView.findViewById(R.id.image_view);
            this.mTextViewTitle = movieView.findViewById(R.id.text_view_title);
            this.mTextViewPopularity = movieView.findViewById(R.id.text_view_popularity);
            this.mDescription = movieView.findViewById(R.id.text_view_description);
        }
    }
}
