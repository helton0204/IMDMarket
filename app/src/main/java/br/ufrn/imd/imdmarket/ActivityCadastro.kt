package br.ufrn.imd.imdmarket

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityCadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val btnSave = findViewById<Button>(R.id.btnSalvar)
        btnSave.setOnClickListener {
            val codigo = findViewById<EditText>(R.id.etCodigo).text.toString()
            val nome = findViewById<EditText>(R.id.etNome).text.toString()
            val descricao = findViewById<EditText>(R.id.etDescricao).text.toString()
            val estoque = findViewById<EditText>(R.id.etEstoque).text.toString()

            if (codigo.isNotEmpty() && nome.isNotEmpty() && descricao.isNotEmpty() && estoque.isNotEmpty()) {
                Toast.makeText(this, "Produto cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
                finish() // Retorna ao menu
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}