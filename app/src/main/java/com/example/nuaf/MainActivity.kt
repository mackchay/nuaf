package com.example.nuaf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    var truelog : String = "foo"
    var truepass : String = "12345678"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun name(v: View){
        var userlog :  EditText = findViewById(R.id.textView2)
        var userpass : EditText = findViewById(R.id.pass)
        var res : TextView = findViewById(R.id.textView3)

            if (truelog == userlog.text.toString()&& truepass == userpass.text.toString()) {
            var next: Intent = Intent(this,Main2Activity::class.java)
startActivity(next)


            }
            else
            { res.setText("Ты не пройдешь!")
                userlog.setText("")
                userpass.setText("")
            }


        }
    fun name2(v:View)
        
}

