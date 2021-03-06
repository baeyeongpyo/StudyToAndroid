package com.example.yeongpyo.studytoandroid.KOTLIN_Study.ClipBoardManager

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.support.v7.app.AppCompatActivity
import com.example.yeongpyo.studytoandroid.R

class Clip_StudyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clip__study)

        var clipboard_manager : ClipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        var Clipdata : ClipData = ClipData.newPlainText("TEST CLIIP BOARD", "TEST MESSAGE")
        clipboard_manager.primaryClip = Clipdata

        findViewById<Button>(R.id.input_Button1).setOnClickListener { view ->
            findViewById<EditText>(R.id.input1).let {
                clipboard_manager.primaryClip = ClipData.newPlainText("Test Clipboard", it.text)
            } }
        findViewById<Button>(R.id.input_Button2).setOnClickListener() {view ->
            findViewById<EditText>(R.id.input2).let { it.setText(clipboard_manager.primaryClip.toString())  }
        }
    }
}
