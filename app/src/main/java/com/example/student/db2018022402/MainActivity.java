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
    String[] cities = {"台北", "台中", "台南", "高雄"};
    String[] codes = {"02", "04", "06", "07"};
    int[] imgs = {R.drawable.tpe, R.drawable.tc, R.drawable.tn, R.drawable.kh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter();
        lv.setAdapter(adapter);
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
            tv.setText(cities[position] );
            tv2.setText(codes[position] );
            iv.setImageResource(imgs[position]);
            return v;
        }
    }

}
