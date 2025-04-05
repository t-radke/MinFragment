// Tyler Radke
// MinFragment Assignment
// MainActivity.kt file

package edu.msudenver.cs3013.MinFragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import edu.msudenver.cs3013.minfragment.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Start Fragment Function

    fun startFragment(view: View) {
        findViewById<FragmentContainerView>(R.id.fragment_container)?.let { frameLayout ->
            val blueFragment = BlueFragment.newInstance("FIRST")
            supportFragmentManager.beginTransaction().add(frameLayout.id, blueFragment).addToBackStack(null).commit()
        }
    }

}