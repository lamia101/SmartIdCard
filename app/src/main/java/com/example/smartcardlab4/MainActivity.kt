package com.example.smartcardlab4

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val email_id:ImageView=findViewById(R.id.email_id)
        val fb_id:ImageView=findViewById(R.id.fb_id)
        val phone_id:ImageView=findViewById(R.id.phone_id)
        val whatsapp_id:ImageView=findViewById(R.id.whatsapp_id)
        val linkedin_id:ImageView=findViewById(R.id.linkedin_id)
        val github_id:ImageView=findViewById(R.id.github_id)
        email_id.setOnClickListener {
            val intent_email=Intent(Intent.ACTION_SENDTO)
            intent_email.data=Uri.parse("mailto:lamialatif01@gmail.com")
            startActivity(intent_email)
        }
        phone_id.setOnClickListener {
            val intent_phone=Intent(Intent.ACTION_DIAL)
            intent_phone.data=Uri.parse("tel:01610895974")
            startActivity(intent_phone)
        }
            fb_id.setOnClickListener {
                val intent_fb=Intent(Intent.ACTION_VIEW)
                intent_fb.data=Uri.parse("https://www.facebook.com/lamia.latif.10")
                startActivity(intent_fb)
            }
        linkedin_id.setOnClickListener {
            val intent_linkedin=Intent(Intent.ACTION_VIEW)
            intent_linkedin.data=Uri.parse("https://www.linkedin.com/in/lamia-binta-latif-482b66291")
            startActivity(intent_linkedin)
        }
        github_id.setOnClickListener {
            val intent_github=Intent(Intent.ACTION_VIEW)
            intent_github.data=Uri.parse("https://github.com/lamia101")
            startActivity(intent_github)
        }
        whatsapp_id.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        "https://api.whatsapp.com/send?phone=+8801610895974&text=Hello Lamia Binta Latif"
                    )
                )
            )
        }
    }
}