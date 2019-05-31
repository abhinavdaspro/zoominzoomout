package com.example.student.zoominzoomout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img = findViewById<ImageView>(R.id.image1)
        val zoomin = findViewById<Button>(R.id.button1)
        val zoomout = findViewById<Button>(R.id.button2)
        val change = findViewById<Button>(R.id.button3)
        val im= arrayOf(
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Flag_of_United_States_of_America.png",
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Stark_Industries_-_Infobox_Logo.png",
                "https://marvelcinematicuniverse.fandom.com/wiki/Iron_Man?file=Avengers_Logo.png")

       zoomin.setOnClickListener{
           val x:Float=img.scaleX
           val y:Float=img.scaleY
           img.scaleX=x+1
           img.scaleY=y+1
       }
        zoomout.setOnClickListener{
            val x:Float=img.scaleX
            val y:Float=img.scaleY
            img.scaleX=x-1
            img.scaleY=y-1
        }

        var i:Int=0
        val n:Int=im.size
        change.setOnClickListener{
            Glide.with(this).load(im[i%n]).into(img)
            i++
        }
    }
}
