package com.example.pract20

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.pract20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun clickOne(view: View) {
        Snackbar.make(view, "Вы нажали на кнопочку", Snackbar.LENGTH_LONG).show()
    }

    fun clickTwo(view: View) {
        Snackbar.make(
            view,
            "Привет!! нажми на эту кнопочку, пожалуйста ^^ -->",
            Snackbar.LENGTH_LONG
        ).setAction("Кнопочка!") {
            Snackbar.make(view, "Спасибо тебе!!", Snackbar.LENGTH_LONG).show()
        }.show()
    }

    fun clickThree(view: View) {

        val snackbar = Snackbar.make(
            view,
            "А теперь нажми на вот эту кнопочку ^^ -->",
            Snackbar.LENGTH_LONG
        )

        snackbar.setAction("На меня!!") {

            val snackbar2 = Snackbar.make(
                view,
                "Цвет нового уведомнения поменялся, заметили? Успевай читать!!!",
                500
            )
            snackbar2.setTextColor(Color.GREEN)
            snackbar2.show()

        }.show()
    }

    fun clickFloatingActionButton(view: View) {
        Snackbar.make(view, "Вы нажали на некий FloatingActionButton", Snackbar.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

}