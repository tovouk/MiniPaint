package com.josehinojo.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import androidx.core.view.doOnLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvasView = MyCanvasView(this)
        // myCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN deprecated
        //below makes view fullscreen when it is on the layout
        myCanvasView.doOnLayout {
            window.setDecorFitsSystemWindows(false)
        }
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}