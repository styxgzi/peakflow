package com.peakflow.you_must_not_cheat_yourself_your_parents_raised_a_soldier_prove_it

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import androidx.lifecycle.ViewModel

@AndroidEntryPoint
class GoalSetting3 : AppCompatActivity() {
    private lateinit var userData: UserData
    private val viewModel: GoalSetting3ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goal_setting3)
        userData = intent.getSerializableExtra("userData") as UserData
        val ad = listview_adapter_breakdown_monthly(this, 7)
        val monthlyGoals = ad.getUserInputData()
        val submit: Button = findViewById(R.id.gs_3_submit_monthly_goals)
        submit.setOnClickListener {
            val i3 = Intent(this, GoalSetting4::class.java)
            userData.monthly_goals = monthlyGoals
            i3.putExtra("userData", userData)
            startActivity(i3)
        }
    }
}

class GoalSetting3ViewModel @Inject constructor() : ViewModel() {
    // Add LiveData and business logic here if needed
} 