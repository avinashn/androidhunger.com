package mycodingcorner.androidhunger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button llh = (Button) findViewById(R.id.buttonLlh);
        Button llv = (Button) findViewById(R.id.buttonLlv);
        Button rl = (Button) findViewById(R.id.buttonRl);
        Button gv = (Button) findViewById(R.id.buttonGv);
        Button lv = (Button) findViewById(R.id.buttonLv);
        llh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, LinearLayoutHorizontalActivity.class));
            }
        });
        llv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, LinearLayoutVerticalActivity.class));
            }
        });
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });
        gv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, GridViewActivity.class));
            }
        });
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this, ListViewActivity.class));
            }
        });
    }
}
