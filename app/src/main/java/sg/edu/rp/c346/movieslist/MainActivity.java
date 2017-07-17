package sg.edu.rp.c346.movieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieItem> movieList;
    CustomAdapter caToDo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        movieList = new ArrayList<MovieItem>();

        caToDo = new CustomAdapter(this, R.layout.movieitem_row, movieList);
        lvMovie.setAdapter(caToDo);

        Calendar d1 = Calendar.getInstance(); //Create a Calendar object with current date/time
        d1.set(2016,10,1); //Set it to a new date
        MovieItem item1 = new MovieItem("War for the Planet of the Apes.", "A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's"); //Create a ToDoItem object named item1
        movieList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        Calendar d2 = Calendar.getInstance();
        d2.set(2016,9,20);
        MovieItem item2 = new MovieItem("King Kong.","Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s.");
        movieList.add(item2);

    }
}