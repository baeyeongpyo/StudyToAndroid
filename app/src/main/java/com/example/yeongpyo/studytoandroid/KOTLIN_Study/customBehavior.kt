package com.example.yeongpyo.studytoandroid.KOTLIN_Study

import android.support.design.widget.CoordinatorLayout
import android.view.View

class customBehavior : CoordinatorLayout.Behavior<View>() {

    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: View, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type)

    }
}