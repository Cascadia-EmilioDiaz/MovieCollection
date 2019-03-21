package edu.mobas.cascadia.emilio.moviecollection;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.lang.ref.Reference;

//Having trouble with foreignKey?
@Entity (tableName = "movies",
        foreignKeys = @ForeignKey(entity = Director.class, parentColumns = "id", childColumns = "director_id"))

public class Movie
{
    @PrimaryKey (autoGenerate = true)
    private int _id;

    private String title;

    private int year;

    @ColumnInfo(name="director_id")
    private int director_id;

    private String run_time;

    private int collection;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }
}
