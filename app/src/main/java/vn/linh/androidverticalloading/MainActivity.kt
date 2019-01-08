package vn.linh.androidverticalloading

import android.animation.ObjectAnimator
import android.animation.ValueAnimator.INFINITE
import android.animation.ValueAnimator.REVERSE
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_start.setOnClickListener {
            val animator =
                ObjectAnimator.ofFloat(
                    animate_view,
                    "translationX", 0f, (animate_view.parent as View).width.toFloat() - animate_view.width
                )
            animator.duration = 2000
            animator.repeatMode = REVERSE
            animator.repeatCount = INFINITE
            animator.start()
        }
    }
}
