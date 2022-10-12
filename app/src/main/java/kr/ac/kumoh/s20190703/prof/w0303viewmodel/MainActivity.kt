package kr.ac.kumoh.s20190703.prof.w0303viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kr.ac.kumoh.s20190703.prof.w0303viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model:CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtCount.text = model.count.value.toString()
        model.count.observe(this, {
            binding.txtCount.text = it.toString()
        })
        binding.btnAdd.setOnClickListener {
            model.add()
        }
    }
}