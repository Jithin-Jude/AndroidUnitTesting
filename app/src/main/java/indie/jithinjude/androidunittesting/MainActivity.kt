package indie.jithinjude.androidunittesting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import indie.jithinjude.androidunittesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.tvCount.text = "$count"

        binding.btnIncrement.setOnClickListener {
            ++count
            binding.tvCount.text = "$count"
        }
    }
}