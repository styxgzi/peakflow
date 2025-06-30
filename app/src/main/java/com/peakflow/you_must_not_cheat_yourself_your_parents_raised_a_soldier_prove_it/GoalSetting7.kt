package com.peakflow.you_must_not_cheat_yourself_your_parents_raised_a_soldier_prove_it

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import androidx.lifecycle.ViewModel

@AndroidEntryPoint
class GoalSetting7 : AppCompatActivity() {
    private lateinit var userData: UserData
    private lateinit var listView: ListView
    private lateinit var ad: listview_adapter_routine_info
    private val viewModel: GoalSetting7ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goal_setting7)
        userData = intent.getSerializableExtra("userData") as UserData
        listView = findViewById(R.id.list_view_routine_planner)
        ad = listview_adapter_routine_info(this, 7)
        listView.adapter = ad
        val dailyRoutines = ad.getUserAvailability()
        userData.daily_routine = dailyRoutines
        val submit: Button = findViewById(R.id.gs_7_submit_button)
        submit.setOnClickListener {
            val i7 = Intent(this, SignUpActivity::class.java)
            i7.putExtra("userData", userData)
            startActivity(i7)
        }
    }
}

class GoalSetting7ViewModel @Inject constructor() : ViewModel() {
    // Add LiveData and business logic here if needed
} 