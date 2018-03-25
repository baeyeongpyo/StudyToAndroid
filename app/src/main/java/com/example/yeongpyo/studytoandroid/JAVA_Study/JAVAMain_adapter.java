package com.example.yeongpyo.studytoandroid.JAVA_Study;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.yeongpyo.studytoandroid.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by yeongpyo on 2018-03-11.
 */

public class JAVAMain_adapter extends BaseExpandableListAdapter {

        LinkedHashMap<String, ArrayList<String>> map;
        ArrayList<String> arr = new ArrayList<>();

        public JAVAMain_adapter(LinkedHashMap<String, ArrayList<String>> map) {
            this.map = map;
            for ( String txt : map.keySet()) arr.add(txt);
        }

        @Override
        public int getGroupCount() {return map.size();}

        @Override
        public int getChildrenCount(int i) {return map.get(arr.get(i)).size();}

        @Override
        public Object getGroup(int i) {return i;}

        @Override
        public Object getChild(int i, int i1) {return i;}

        @Override
        public long getGroupId(int i) {return i;}

        @Override
        public long getChildId(int i, int i1) {return i1;}

        @Override
        public boolean hasStableIds() {return true;}

        @Override
        public boolean isChildSelectable(int i, int i1) {return true;}

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            if ( view == null ) view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.childlayout, viewGroup, false);
            GroupHolder holder = new GroupHolder(view);
            holder.getText().setText(arr.get(i));
            return view;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            if ( view == null ) view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.childlayout, viewGroup, false);
            ChildHolder holder = new ChildHolder(view);
            holder.getText().setText(map.get(arr.get(i)).get(i1));
            return view;
        }

    private class GroupHolder{
        TextView textView;
        private GroupHolder(View view){
            this.textView = view.findViewById(R.id.childTextview);
        }
        private TextView getText(){return textView;}
    }

    private class ChildHolder{
        TextView textView;
        private ChildHolder(View view){
            this.textView = view.findViewById(R.id.childTextview);
        }
        private TextView getText(){return textView;}
    }
}
