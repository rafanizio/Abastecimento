package com.rafael.abastecimento

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener {
            if (edGasolina.text.toString().isNotEmpty() || edAlcool.text.toString().isNotEmpty()){

                compararPrecos()
            }
            else {
                var msg = "Campos com valores vazios!"
                txtResultados.text = msg

            }

        }
    }

    private fun compararPrecos(){
        var comparacao = (edGasolina.text.toString().toFloat() * 0.70)
        var alcool =  edAlcool.text.toString().toFloat()


        if ((alcool > 0) && (comparacao > 0 )){

            if (alcool <= comparacao){

                var msg = "Compre o Alcool!"
                txtResultados.text = msg
            }

            else {
                var msg = "Compre a Gasolina"

                txtResultados.text = msg

            }


        }else {
            var msg = "Coloque números maiores que 0 para fazer a comparação"

            txtResultados.text = msg

        }

    }
}
