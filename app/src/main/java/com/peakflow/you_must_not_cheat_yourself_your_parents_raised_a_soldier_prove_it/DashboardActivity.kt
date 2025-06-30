package com.peakflow.you_must_not_cheat_yourself_your_parents_raised_a_soldier_prove_it

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {
    private val viewModel: DashboardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        // Observe LiveData from ViewModel here
        // viewModel.someLiveData.observe(this) { /* update UI */ }
    }
} 