package com.example.wedigitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.example.wedigitapp.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView

class ProfileActivity : AppCompatActivity() {
    lateinit var userName: String

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var profileImage: CircleImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tabLayout = findViewById(R.id.layout_tab)
        viewPager2 = findViewById(R.id.view_pager_2)
        viewPagerAdapter = ViewPagerAdapter(this)
        profileImage = findViewById(R.id.gr_mem_cir_img_view)

        setUpActionBar()

        viewPager2.adapter = viewPagerAdapter
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
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