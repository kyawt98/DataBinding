package com.kyawt.testingdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.kyawt.testingdatabinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {
            var name: String = et_name.text.toString()
            var occupation: String = et_occupation.text.toString()
            var person:Person = Person("${name}","${occupation}")
            binding.person = person
        }
    }
}
