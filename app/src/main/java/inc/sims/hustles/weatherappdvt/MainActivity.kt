package inc.sims.hustles.weatherappdvt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import inc.sims.hustles.weatherappdvt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}