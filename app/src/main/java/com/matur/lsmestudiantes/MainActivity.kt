package com.matur.lsmestudiantes

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.matur.lsmestudiantes.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)
//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
//            Toast.makeText(this, "IniciaMenu", Toast.LENGTH_SHORT).show()
//            val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
//
//            // this creates a vertical layout Manager
//            recyclerview.layoutManager = LinearLayoutManager(this)
//            Toast.makeText(this, "Recyler already 1", Toast.LENGTH_SHORT).show()

//            val data = ArrayList<Topic>()
//            data.add(materia)
//            recyclerview.adapter = RecyclerViewAdapter(DictSigns.getAllTopics())

//            val drawerLayout: DrawerLayout = binding.drawerLayout
//            val navView: NavigationView = binding.navView
//            val navController = findNavController(R.id.nav_host_fragment_content_main)
//            // Passing each menu ID as a set of Ids because each
//            // menu should be considered as top level destinations.
//            appBarConfiguration = AppBarConfiguration(
//                setOf(
//                    R.id.fra, R.id.nav_gallery, R.id.nav_slideshow
//                ), drawerLayout
//            )
//            setupActionBarWithNavController(navController, appBarConfiguration)
//            navView.setupWithNavController(navController)

//            val fragmentTransaction = supportFragmentManager.beginTransaction()
////            var fragment = SignUpFragment()
//            fragmentTransaction.add(R.id.nav_host_fragment_content_main, SettingsFragment())
//            fragmentTransaction.addToBackStack(null)
//            fragmentTransaction.commit()

            val intent = Intent(this, SettingsActivity::class.java)
//            intent.putExtra("key", value)
            startActivity(intent)

            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}