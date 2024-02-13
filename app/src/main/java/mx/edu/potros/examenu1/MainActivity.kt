package mx.edu.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonACelsius = findViewById<Button>(R.id.buttonACelsius)
        val buttonAFahrenheit = findViewById<Button>(R.id.buttonAFahrenheit)
        val editTextF = findViewById<(EditText)>(R.id.editTextF)
        val editTextC = findViewById<(EditText)>(R.id.editTextC)

        buttonACelsius.setOnClickListener {
            val fahrenheit = editTextF.text.toString().toDouble()
            val celsius = (fahrenheit - 32) * 5 / 9
            editTextC.setText(celsius.toString())
        }

        buttonAFahrenheit.setOnClickListener {
            val celsius = editTextC.text.toString().toDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            editTextF.setText(fahrenheit.toString())
        }
    }
}