package edu.mobas.cascadia.emilio.moviecollection;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Movie.class}, version = 1)
public abstract class MyMovieDatabase extends RoomDatabase
{
    public abstract MovieDAO movieDAO();
}
