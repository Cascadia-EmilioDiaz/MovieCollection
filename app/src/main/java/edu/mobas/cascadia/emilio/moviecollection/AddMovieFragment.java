package edu.mobas.cascadia.emilio.moviecollection;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddMovieFragment extends Fragment {

    private EditText MovieTitle, MovieYear, MovieRunTime;
    private Button BtnSave;

    public AddMovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_movie, container, false);

        MovieTitle = view.findViewById(R.id.MovieTitleText);
        MovieYear = view.findViewById(R.id.MovieYearText);
        MovieRunTime = view.findViewById(R.id.MovieRunTimeText);
        BtnSave = view.findViewById(R.id.SaveMovieButton);

        BtnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String movietitle = MovieTitle.getText().toString();
                int movieyear = Integer.parseInt(MovieYear.getText().toString());
                String movieruntime = MovieRunTime.getText().toString();

                Movie movie = new Movie();
                movie.setTitle(movietitle);
                movie.setYear(movieyear);
                movie.setRun_time(movieruntime);

                MainActivity.mMovieDatabase.movieDAO().addMovie(movie);
                Toast.makeText(getActivity(), "Movie added Successfully", Toast.LENGTH_SHORT).show();

                MovieTitle.setText("");
                MovieYear.setText("");
                MovieRunTime.setText("");
            }
        });

        return view;
    }

}
