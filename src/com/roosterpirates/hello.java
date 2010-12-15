package com.roosterpirates;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class hello extends ListActivity {
    String[] categories = { "Lorem", "ipsum", "dolor", "foo","bar","baz" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setListAdapter(new CategoryAdapter());
    }

    @Override
    protected void onListItemClick(android.widget.ListView l, View v, int position, long id) {

    };

    class CategoryAdapter extends ArrayAdapter<String> {
        CategoryAdapter() {
            super(hello.this, R.layout.category_row, R.id.label, categories);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.category_row, parent, false);

            TextView label = (TextView)row.findViewById(R.id.label);
            label.setText(categories[position]);

            return(row);
        }
    }
}
