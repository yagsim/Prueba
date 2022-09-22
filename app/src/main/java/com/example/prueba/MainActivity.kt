package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tiempo1: Long= 0;
    private var tiempo2: Long= 0;
    private var tiempoF: Long= 0;
    private var segundos:Double=0.0;
    override fun onCreate(savedInstanceState: Bundle?) {  //en vez de método le llama funcion
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton: Button = findViewById(R.id.boton)
       // val mensaje : TextView=findViewById(R.id.textView)
        //mensaje.setText("Adios Mundo")
        Log.d("Estado Create","Se crea")

    }

    override fun onStart() {
        super.onStart()
        tiempo1= System.currentTimeMillis()
        Log.d("Estado Start","se inicio")
    }

    override fun onResume() {
        super.onResume()


        Log.d("Estado Resume","Se esta ejecutando")

    }

    override fun onPause() {
        super.onPause()

       tiempo2=System.currentTimeMillis()
        tiempoF=tiempo2-tiempo1
        segundos= (tiempoF/ 1000.0)

    }
    override fun onStop() {
        super.onStop()
        Log.d("Estado Stop","se paro")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado Destroy","se cerro")
    }

    override fun onRestart() {
        super.onRestart()
        val mensaje2 : TextView=findViewById(R.id.textView)
        mensaje2.setText("la aplicacion estuvo " + segundos + " antes de cerrarse")
        Log.d("Estado pausado","$segundos")
        Log.d("Estado restart","se reinicio")

    }


}