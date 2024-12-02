package br.ufrn.imd.imdmarket

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityExcluir : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excluir)

        val etCodigo = findViewById<EditText>(R.id.etCodigoExcluir)
        val btnExcluir = findViewById<Button>(R.id.btnExcluir)

        btnExcluir.setOnClickListener {
            val codigo = etCodigo.text.toString()

            if (codigo.isEmpty()) {
                Toast.makeText(this, "Código do produto é obrigatório!", Toast.LENGTH_SHORT).show()
            } else {
                // Lógica para exclusão do produto (não implementada nesta etapa)
                Toast.makeText(this, "Produto excluído com sucesso!", Toast.LENGTH_SHORT).show()
                finish() // Retorna ao menu
            }
        }
    }
}