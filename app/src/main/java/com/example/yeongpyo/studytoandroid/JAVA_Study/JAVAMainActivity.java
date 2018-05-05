package com.example.yeongpyo.studytoandroid.JAVA_Study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.yeongpyo.studytoandroid.JAVA_Study.DataBinding.JavaDataBinding;
import com.example.yeongpyo.studytoandroid.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;

public class JAVAMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        LinkedHashMap<String, Class<?>> map1 = new LinkedHashMap<>();
        map1.put("BindingTest", JavaDataBinding.class);

        LinkedHashMap<String, Class<?>> TotalMap = new LinkedHashMap<>();
        TotalMap.putAll(map1);

        LinkedHashMap<String, ArrayList<String>> adaterMap = new LinkedHashMap<>();
        adaterMap.put("Binding", keyset_converter(map1.keySet()));

        ExpandableListView elv_list = findViewById(R.id.main_elv_listview);
        elv_list.setAdapter(new JAVAMain_adapter(adaterMap));
        elv_list.setOnChildClickListener((ExpandableListView expandableListView, View view, int i1, int i2, long l) -> {
                    String childname = ((TextView) view.findViewById(R.id.childTextview)).getText().toString();
                    startActivity(new Intent(getApplicationContext(), TotalMap.get(childname)));
                    return true;
                }
        );



    }

    private ArrayList<String> keyset_converter(Set<String> set) {
        ArrayList<String> arr = new ArrayList<>();
        for (String string : set) {
            arr.add(string);
        }
        return arr;
    }

}
