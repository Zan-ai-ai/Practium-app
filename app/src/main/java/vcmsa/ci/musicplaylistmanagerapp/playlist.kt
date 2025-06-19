package vcmsa.ci.musicplaylistmanagerapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class playlist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")


    private var songsdisplay : TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_playlist)

        // buttons initializing (ST10488658 Phathutshedzo Azania Sibanda)
        val listbtn = findViewById<Button>(R.id.listbtn)
        val homepagebtn = findViewById<Button>(R.id.homepagebtn)
        val averagebtn = findViewById<Button>(R.id.averagebtn)

        songsdisplay= findViewById(R.id.songsdisplay)



        homepagebtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

        listbtn.setOnClickListener {



        }
        averagebtn.setOnClickListener {

        }



    }
}