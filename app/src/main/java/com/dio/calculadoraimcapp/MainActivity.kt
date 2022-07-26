package com.dio.calculadoraimcapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dio.calculadoraimcapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    fun setListeners() {
        binding.calcularBTN.setOnClickListener {
            calcularIMC(
                binding.pesoEDT.text.toString(),
                binding.alturaEDT.text.toString()
            )
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            var result = ""
            if (imc >= 40.0) {

                result = "Obesidade Grau III"
                binding.textIMC.setTextColor(Color.parseColor("#D50000"))
                textIMC.text = result

            } else if (imc >= 35.0) {

                result = "Obesidade Grau II"
                binding.textIMC.setTextColor(Color.parseColor("#B71C1C"))
                textIMC.text = result

            } else if (imc >= 30.0) {
                result = "Obesidade Grai I"
                binding.textIMC.setTextColor(Color.parseColor("#D32F2F"))
                textIMC.text = result
            } else if (imc >= 25.0) {

                result = "Sobrepeso"
                binding.textIMC.setTextColor(Color.parseColor("#F44336"))
                textIMC.text = result

            } else if (imc >= 18.5) {

                result = "Peso Normal"
                binding.textIMC.setTextColor(Color.parseColor("#689F38"))
                textIMC.text = result

            } else if (imc <= 18.5) {

                result = "Abaixo do Peso"
                binding.textIMC.setTextColor(Color.parseColor("#FF9800"))
                textIMC.text = result
            }

            titleTXT.text = "IMC: %.2f".format(imc)
        }

    }
}