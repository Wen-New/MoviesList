package sg.edu.rp.c346.movieslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;

    //Modify your data class name
    ArrayList<MovieItem> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<MovieItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Standard code
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI Elements and assign to variables
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = (TextView) rowView.findViewById(R.id.textViewDescription);

        //Obtain the to-do item based on the 'position'
        MovieItem currentItem = movieList.get(position);

        //Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getDescription());

        return rowView;
    }
}
