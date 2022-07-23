package com.dio.calculadoraimcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","Start - deixei a tela visivel para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","Resume - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","Pause - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle","Shop - a tela foi parada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle","Destroy - a tela foi destruida")
    }

}