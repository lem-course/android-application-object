package ep.appobject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ep.appobject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener { saveToAppObject() }
        binding.buttonHelp.setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        }
    }

    // TODO shranite ime v objekt aplikacije
    private fun saveToAppObject(): Unit = TODO()
}