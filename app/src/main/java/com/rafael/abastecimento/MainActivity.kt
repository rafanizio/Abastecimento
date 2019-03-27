package com.rafael.abastecimento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {

    var msg = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener {
            if (edGasolina.text.toString().isEmpty() || edAlcool.text.toString().isEmpty()){
                msg = "Algum campo esta vazio!"
            }
            if (edGasolina.text.toString().isNotEmpty() || edAlcool.text.toString().isNotEmpty()){
                compararPrecos()
            }

            else {
                msg = "Os 2 campos estão vazios!"
            }
            txtResultados.text = msg
        }
    }

    private fun compararPrecos(){
        val comparacao = (edGasolina.text.toString().toFloat() * 0.70)

        val alcool =  edAlcool.text.toString().toFloat()
        if ((alcool > 0) && (comparacao > 0 )){

            if (alcool <= comparacao){
                msg = "Compre o Alcool!"
                txtResultados.text = msg
            }
            else {
                msg = "Compre a Gasolina"
                txtResultados.text = msg
            }
        }else {
            var msg = "Coloque números maiores que 0 para fazer a comparação"
            txtResultados.text = msg
        }

    }
}
