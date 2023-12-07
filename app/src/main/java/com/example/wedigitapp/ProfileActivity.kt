package com.example.wedigitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class ProfileActivity : AppCompatActivity() {
    lateinit var userName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setUpActionBar()
    }

    private fun setUpActionBar() {
        val toolbar = findViewById<Toolbar>(R.id.usr_prof_toolbar)
        setSupportActionBar(toolbar)

        val supportActionBar = supportActionBar
        supportActionBar?.title = resources.getString(R.string.user_name)

        toolbar.setNavigationIcon(R.drawable.ic_send)
        toolbar.setNavigationIcon(R.drawable.ic_options)

        toolbar.navigationIcon = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.options_menu_btn -> {
                return true
            }
            R.id.options_menu_btn -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}