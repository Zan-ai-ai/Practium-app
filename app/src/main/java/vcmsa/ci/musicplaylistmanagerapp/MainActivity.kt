package vcmsa.ci.musicplaylistmanagerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

private var userinput1: EditText? = null
private var userinput2: EditText? = null
private var userinput3 : EditText? = null
private var userinput4 : EditText? = null

    // links multiple arrays, one index to the other (ST10488658 Phathutshedzo Azania Sibanda)
    companion object {

        private val songtitle = arrayOf("Blessed", "Pyramids", "Mirrors", "Gonna Love Me")
        private val artistname = arrayOf("Daniel Ceaser", "Frank Ocean", "Justin Timberlake", "Teyana Tylor")
        private val ratings = arrayOf("5", "4", "2", "1")
        private val comments = arrayOf("RnB", "Pop", "Memories", "Slow jam")

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        userinput1= findViewById(R.id.userinput1)
        userinput2= findViewById(R.id.userinput2)
        userinput3= findViewById(R.id.userinput3)
        userinput4= findViewById(R.id.userinput4)

        val exitbtn= findViewById<Button>(R.id.exitbtn)
        val nextbtn= findViewById<Button>(R.id.nextbtn)
        val addmusic= findViewById<Button>(R.id.addmusicbtn)



        exitbtn.setOnClickListener {
            finishAffinity()
            exitProcess(status = 0)

        }
        nextbtn.setOnClickListener {
            startActivity(Intent(this,playlist::class.java))


        }
        addmusic.setOnClickListener{



        }

        }
}





