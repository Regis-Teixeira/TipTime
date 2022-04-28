package com.ds.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botaoCalcular.setOnClickListener{ calcularGorjeta()}
    }
    fun calcularGorjeta(){
        val stringInTextFIeld = binding.custoServico.text.toString()
        val custo = stringInTextFIeld.toDouble()
        val selectedId = binding.opcoes.checkedRadioButtonId
        val gorjetaPorcentagem = when (selectedId) {
            R.id.opcao_vinte -> 0.20
            R.id.opcao_dezoito -> 0.18
            else -> 0.15
        }
        var gorjeta = gorjetaPorcentagem * custo
    }
}
