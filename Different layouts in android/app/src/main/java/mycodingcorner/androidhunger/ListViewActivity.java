package mycodingcorner.androidhunger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    static final String[] version_codes = new String[]{
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", " Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop",
            "Marshmallow", "Nougat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, version_codes);

        listView.setAdapter(adapter);
    }
}
