package com.example.yeongpyo.studytoandroid.JAVA_Study;

import android.annotation.SuppressLint;
import android.databinding.BindingAdapter;
import android.os.Handler;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class Custom_Binding {
    @BindingAdapter({"customtxt"})
    public static void textbinding(TextView textView, String Text){
        TimerTask timerTask = new TimerTask(){
            @Override
            public void run() {

                try {
                    String[] splittext = Text.split(" ");
                    for ( String s : splittext){
                        Handler textHandler = textView.getHandler();
                        textHandler.post(()->{
                            textView.setText(s);
                        });
                        sleep(1000);
                    }
                }catch (InterruptedException e){}
            }
        };
        new Timer().schedule( timerTask, 100, 1000);


    }


}
