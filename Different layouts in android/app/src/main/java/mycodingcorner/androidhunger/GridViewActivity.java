package mycodingcorner.androidhunger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;

    static final String[] version_codes = new String[]{
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", " Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop",
            "Marshmallow", "Nougat", "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", " Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop",
            "Marshmallow", "Nougat", "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", " Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop",
            "Marshmallow", "Nougat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        gridView = (GridView) findViewById(R.id.gridView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, version_codes);

        gridView.setAdapter(adapter);
    }
}
