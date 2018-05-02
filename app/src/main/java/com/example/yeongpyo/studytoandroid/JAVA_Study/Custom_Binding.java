package com.example.yeongpyo.studytoandroid.JAVA_Study;

import android.databinding.BindingAdapter;
import android.widget.TextView;

public class Custom_Binding {
    @BindingAdapter({"customtxt"})
    public static void textbinding(TextView textView, String Text){
        textView.setText(Text + " Text Custom");
    }

}
