package ep.appobject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSave.setOnClickListener { saveToAppObject() }
        buttonHelp.setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        }
    }

    // TODO shranite ime v objekt aplikacije
    private fun saveToAppObject(): Unit = TODO()
}