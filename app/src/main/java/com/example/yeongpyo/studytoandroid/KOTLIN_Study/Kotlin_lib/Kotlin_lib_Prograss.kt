package com.example.yeongpyo.studytoandroid.KOTLIN_Study.Kotlin_lib

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yeongpyo.studytoandroid.R
import kotlinx.android.synthetic.main.libprograsslayout.*
import nl.komponents.progress.Progress

class Kotlin_lib_Prograss : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.libprograsslayout)
        val masterControl = Progress.containerControl()
        masterControl.progress.update {
            println("${value}")
        }

        val firstChild = masterControl.child(0.1)
        val secondChild = masterControl.containerChild(5.0)
        val secondChildFirstChild = secondChild.child()
        val secondChildSecondChild = secondChild.child()
        val thirdChild = masterControl.child()
        val fourthChild = masterControl.child(2.0)

        firstChild.value = 0.25
        firstChild.value = 0.50
        firstChild.value = 0.75

        secondChildFirstChild.markAsDone()
        secondChildSecondChild.value = 0.5

        thirdChild.value = 0.25
        thirdChild.value = 0.50
        thirdChild.value = 0.75

        fourthChild.value = 0.25
        fourthChild.value = 0.50
        fourthChild.value = 0.75
        progressTest.max = 100


        masterControl.progress.update {
        progressTest.progress = ( value * 100 ).toInt()

            println("${value}")
        }

    }
}
