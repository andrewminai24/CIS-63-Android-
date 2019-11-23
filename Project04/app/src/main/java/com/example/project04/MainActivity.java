package com.example.project04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Andronym";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] alpha = getResources().getStringArray(R.array.alpha_array);
        final String[] quotes = getResources().getStringArray(R.array.quotes_array);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        ListAdapter myl = new ArrayAdapter<String>(this,R.layout.list_item,alpha);
        gridview.setAdapter(myl);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast abc = Toast.makeText(MainActivity.this, "" + quotes[position], Toast.LENGTH_SHORT);
                //Toast.makeText(Andronym.this, "" + alpha[position], Toast.LENGTH_SHORT).show();
                abc.setGravity(Gravity.BOTTOM, 0, 0);
                abc.show();
            }
        });
    }
}