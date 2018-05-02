package com.example.yeongpyo.studytoandroid.JAVA_Study.DataBinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.yeongpyo.studytoandroid.R;
import com.example.yeongpyo.studytoandroid.databinding.ActivityJavaDataBindingBinding;

public class JavaDataBinding extends AppCompatActivity {

    binding_VO bindingString = new binding_VO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_data_binding);
        ActivityJavaDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_java_data_binding);
        binding.setBindString(bindingString);

        findViewById(R.id.inputButton).setOnClickListener(view -> {
            bindingString.bindingString.set(((EditText) findViewById(R.id.inputBox)).getText().toString());
        });

    }
}
