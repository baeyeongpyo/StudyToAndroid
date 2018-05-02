package com.example.yeongpyo.studytoandroid.JAVA_Study.DataBinding;

import android.databinding.ObservableField;

public class binding_VO {

    public ObservableField<String> bindingString = new ObservableField<>();

    public ObservableField<String> getBindingString() {
        return bindingString;
    }

    public void setBindingString(String bindingString) {
        this.bindingString.set( bindingString );
    }
}
