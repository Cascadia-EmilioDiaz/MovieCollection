package edu.mobas.cascadia.emilio.moviecollection;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadMovieFragment extends Fragment {

    private TextView MovieInfo;


    public ReadMovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_movie, container, false);

        MovieInfo = view.findViewById(R.id.DisplayMovieInfo);

        List<Movie> movies = MainActivity.mMovieDatabase.movieDAO().getMovies();

        String info = "";

        for (Movie movie : movies){
            String MovieTitle = movie.getTitle();
            int MovieYear = movie.getYear();
            String RunTime = movie.getRun_time();

            info = info + "\n\n" + "Title: " + MovieTitle + "\n" + "Year: " + MovieYear + "\n" + "Run Time: " + RunTime;
        }

        MovieInfo.setText(info);

        return view;
    }

}
