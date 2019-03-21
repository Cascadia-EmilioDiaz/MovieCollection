package edu.mobas.cascadia.emilio.moviecollection;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button BtnAddMovie, BtnViewMovie;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        BtnAddMovie = view.findViewById(R.id.AddMovieButton);
        BtnAddMovie.setOnClickListener(this);

        BtnViewMovie = view.findViewById(R.id.ViewMovies);
        BtnViewMovie.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.AddMovieButton:
                MainActivity.fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, new AddMovieFragment())
                        .addToBackStack(null).commit();
                break;

            case R.id.ViewMovies:
                MainActivity.fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, new ReadMovieFragment())
                        .addToBackStack(null).commit();
                break;
        }
    }
}
