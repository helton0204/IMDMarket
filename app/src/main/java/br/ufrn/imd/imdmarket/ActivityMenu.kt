package br.ufrn.imd.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<Button>(R.id.btnCadastro).setOnClickListener {
            startActivity(Intent(this, ActivityCadastro::class.java))
        }
        findViewById<Button>(R.id.btnAlteracao).setOnClickListener {
            startActivity(Intent(this, ActivityAlteracao::class.java))
        }
        findViewById<Button>(R.id.btnExcluir).setOnClickListener {
            startActivity(Intent(this, ActivityExcluir::class.java))
        }
        findViewById<Button>(R.id.btnListagem).setOnClickListener {
            startActivity(Intent(this, ActivityListagem::class.java))
        }
    }
}