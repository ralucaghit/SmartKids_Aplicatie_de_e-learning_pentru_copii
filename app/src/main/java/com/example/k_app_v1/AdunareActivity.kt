package com.example.k_app_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdunareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adunare)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nivel1Button = findViewById<CardView>(R.id.incepator_btn)
        val nivel2Button = findViewById<CardView>(R.id.mediu_btn)
        val nivel3Button = findViewById<CardView>(R.id.expert_btn)
        val inapoiButton = findViewById<ImageButton>(R.id.backButton)

        nivel1Button.addPressEffect()
        nivel2Button.addPressEffect()
        nivel3Button.addPressEffect()
        
        nivel1Button.setOnClickListener{
            val intent = Intent(this, AdunareNivel1Activity::class.java)
            startActivity(intent)
        }

        nivel2Button.setOnClickListener{
            val intent = Intent(this, AdunareNivel2Activity::class.java)
            startActivity(intent)
        }

        nivel3Button.setOnClickListener{
            val intent = Intent(this, AdunareNivel3Activity::class.java)
            startActivity(intent)
        }

        inapoiButton.setOnClickListener{
            finish()
        }
    }
}