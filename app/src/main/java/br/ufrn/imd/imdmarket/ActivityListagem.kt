package br.ufrn.imd.imdmarket

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ActivityListagem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listagem)

        val listView = findViewById<ListView>(R.id.lvProdutos)
        val produtos = listOf("Produto 1", "Produto 2", "Produto 3") // Simulação para teste

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, produtos)
        listView.adapter = adapter
    }
}