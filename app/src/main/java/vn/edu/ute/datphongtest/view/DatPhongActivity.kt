package vn.edu.ute.datphongtest.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import vn.edu.ute.datphongtest.R
import vn.edu.ute.datphongtest.databinding.ActivityDatphongBinding


class DatPhongActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatphongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatphongBinding.inflate(layoutInflater)
        setContentView(binding.root)
        savedInstanceState?.getString("ma_loai")?.let { ma -> DatPhongHelper }
        }
    }
