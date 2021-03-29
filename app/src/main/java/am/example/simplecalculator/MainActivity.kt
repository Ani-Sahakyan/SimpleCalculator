package am.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.first_num)
        val secondNum = findViewById<EditText>(R.id.second_num)

        val result = findViewById<TextView>(R.id.results)

        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)

        plus.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.plus){
                if (firstNum.text.isNotEmpty() && secondNum.text.isNotEmpty()){
                    result.text = ((firstNum.text.toString().toInt() + secondNum.text.toString().toInt()).toString())
                }
            }
        })

        minus.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.minus){
                if (firstNum.text.isNotEmpty() && secondNum.text.isNotEmpty()){
                    result.text = ((firstNum.text.toString().toInt() - secondNum.text.toString().toInt()).toString())
                }
            }
        })

        multiplication.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.multiplication){
                if (firstNum.text.isNotEmpty() && secondNum.text.isNotEmpty()){
                    result.text = ((firstNum.text.toString().toInt() * secondNum.text.toString().toInt()).toString())
                }
            }
        })

        division.setOnClickListener(View.OnClickListener {
            if (it.id == R.id.division){
                if (firstNum.text.isNotEmpty() && secondNum.text.isNotEmpty()){
                    result.text = ((firstNum.text.toString().toDouble() / secondNum.text.toString().toDouble()).toString())
                }
            }
        })
    }
}