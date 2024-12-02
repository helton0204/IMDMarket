package br.ufrn.imd.imdmarket

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityAlteracao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alteracao)

        val etCodigo = findViewById<EditText>(R.id.etCodigoAlteracao)
        val etNome = findViewById<EditText>(R.id.etNomeAlteracao)
        val etDescricao = findViewById<EditText>(R.id.etDescricaoAlteracao)
        val etEstoque = findViewById<EditText>(R.id.etEstoqueAlteracao)
        val btnSalvar = findViewById<Button>(R.id.btnSalvarAlteracao)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, ActivityMenu::class.java))
            finish()
        }

        btnSalvar.setOnClickListener {
            val codigo = etCodigo.text.toString()

            if (codigo.isEmpty()) {
                Toast.makeText(this, "Código do produto é obrigatório!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Alterações salvas com sucesso!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
