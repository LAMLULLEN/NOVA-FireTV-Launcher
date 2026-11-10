
package com.nova.launcher

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(12, 16, 29))
        }

        val title = TextView(this).apply {
            text = "N O V A"
            textSize = 38f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "YOUR SPACE. YOUR WORLD."
            textSize = 12f
            setTextColor(Color.rgb(160, 180, 220))
            gravity = Gravity.CENTER
        }

        val apps = TextView(this).apply {
            text = "\n\n▶  Apps\n\n◈  Instellingen\n\n✦  Achtergronden"
            textSize = 22f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(apps)

        setContentView(root)
    }
}
