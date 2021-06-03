package com.example.andreicarrillorfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtnombre = findViewById<EditText>(R.id.nombre)
        var txtapellido = findViewById<EditText>(R.id.pellido)
        var txtapellido2 = findViewById<EditText>(R.id.apellido2)
        var txtdia = findViewById<EditText>(R.id.dia)
        var txtmes = findViewById<EditText>(R.id.mes)
        var txtanio = findViewById<EditText>(R.id.anio)




        //Valores para la Homoclave
        val valores = mutableListOf("A","B","C","D","E","F","G","H","I","J","K","L","M","O","P","Q","R","S","T","U","V","X","Y","Z","0",
            "1","2","3","4","5","6","7","8","9")

        btncrear.setOnClickListener {
            var apellido = txtapellido.text.toString()
            var apellido2 = txtapellido2.text.toString()
            var nombre = txtnombre.text.toString()
            var anio = txtanio.text.toString()
            var mes = txtmes.text.toString()
            var dia = txtdia.text.toString()
            //Los ultimos tres valores los generamos de 3 valores aleatorios entre el abecedario y los numeros naturales
            var valor1 = apellido[0].toString().toUpperCase()
            var valor2 = apellido[1].toString().toUpperCase()
            var valor3 = apellido2[0].toString().toUpperCase()
            var valor4 = nombre[0].toString().toUpperCase()
            var valor5  = anio[2]
            var valor6  = anio[3]
            var valor7 = mes
            var valor8 = dia
            val valor9 = valores.random()
            val valor10 = valores.random()
            val valor11 = valores.random()
            var rfc = findViewById<TextView>(R.id.texxrfc)
            rfc.text =  valor1 + valor2 + valor3+ valor4 + valor5 + valor6 +valor7+ valor8 + valor9 + valor10 + valor11
        }

        btnlimpiar.setOnClickListener {
            var nombre = findViewById<EditText>(R.id.nombre)
            nombre.text.clear()
            var apellido = findViewById<EditText>(R.id.pellido)
            apellido.text.clear()
            var apellido2 = findViewById<EditText>(R.id.apellido2)
            apellido2.text.clear()
            var dia = findViewById<EditText>(R.id.dia)
            dia.text.clear()
            var mes = findViewById<EditText>(R.id.mes)
            mes.text.clear()
            var anio = findViewById<EditText>(R.id.anio)
            anio.text.clear()
        }


    }
}
