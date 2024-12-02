package br.ufrn.imd.imdmarket

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ActivityLogin::class.java))
        finish() // Fecha a MainActivity para não voltar a ela ao pressionar "voltar"
    }
}