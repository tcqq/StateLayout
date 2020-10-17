package com.example.statelayout

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tcqq.statelayout.StateLayout
import kotlinx.android.synthetic.main.activity_main.*


/**
 * @author Perry Lance
 * @since 2010-10-17 Created
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_content -> state_layout.setState(StateLayout.State.CONTENT)
            R.id.action_loading -> state_layout.setState(StateLayout.State.LOADING)
            R.id.action_info -> {
                state_layout.apply {
                    setState(StateLayout.State.INFO)
                    infoTitle("Failed to load")
                    infoMessage("Network connection failed, please try again later")
                    infoImage(R.drawable.ic_baseline_cloud_off_24, R.color.state_layout_error_color)
                    infoButtonText("Retry") {
                        Toast.makeText(this@MainActivity, "Retry", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}