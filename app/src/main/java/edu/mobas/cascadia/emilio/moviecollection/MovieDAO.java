package edu.mobas.cascadia.emilio.moviecollection;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MovieDAO
{
    @Insert
    public void addMovie(Movie... movie);

    @Update
    public void updateMovie(Movie... movie);

    @Delete
    public void deleteMovie(Movie... movie);

    @Query("SELECT * FROM movies")
    public List<Movie> getMovies();

}
