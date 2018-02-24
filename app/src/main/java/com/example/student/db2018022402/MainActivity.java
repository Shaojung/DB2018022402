package com.example.student.db2018022402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    MyAdapter adapter;
    City cities[] = new City[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter();
        lv.setAdapter(adapter);
        cities[0] = new City("台北", "02", R.drawable.tpe);
        cities[1] = new City("台中", "04", R.drawable.tc);
        cities[2] = new City("台南", "06", R.drawable.tn);
        cities[3] = new City("高雄", "07", R.drawable.kh);


    }

    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return cities.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
            View v = inflater.inflate(R.layout.item1, null);
            TextView tv = v.findViewById(R.id.textView);
            TextView tv2 = v.findViewById(R.id.textView2);
            ImageView iv = v.findViewById(R.id.imageView);
            tv.setText(cities[position].cityname );
            tv2.setText(cities[position].citycode );
            iv.setImageResource(cities[position].cityimg);
            return v;
        }
    }

}
