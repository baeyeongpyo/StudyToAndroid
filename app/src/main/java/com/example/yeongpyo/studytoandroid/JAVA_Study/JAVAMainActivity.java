package com.example.yeongpyo.studytoandroid.JAVA_Study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.yeongpyo.studytoandroid.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class JAVAMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        map.put("test1", new ArrayList<>(Arrays.asList("1","2,","3","4")));
        map.put("test2", new ArrayList<>(Arrays.asList("5","6","7","8")));
        map.put("test3", new ArrayList<>(Arrays.asList("9","10","11","12")));
        map.put("test4", new ArrayList<>(Arrays.asList("13","14,","15","16")));

        ((ExpandableListView) findViewById(R.id.main_elv_listview)).setAdapter(new JAVAMain_adapter(map));

    }
}
