

package kg.tutorialapp.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.editText)
        val number2 = findViewById<EditText>(R.id.editText2)

        val result = findViewById<TextView>(R.id.textView)

        val plus = findViewById<Button>(R.id.button)
        val minus = findViewById<Button>(R.id.button2)
        val multiply = findViewById<Button>(R.id.button3)
        val toSplit = findViewById<Button>(R.id.button4)

        var num1 = 0.0
        var num2 = 0.0
        var lastResult = 0.0

        plus.setOnClickListener {
            if (TextUtils.isEmpty(number1.text.toString()) || TextUtils.isEmpty(number2.text.toString())) {
                return@setOnClickListener
            }
            num1 = number1.text.toString().toDouble()
            num2 = number2.text.toString().toDouble()

            lastResult = num1 + num2

            result.text = "$num1 + $num2 = $lastResult"
        }
        minus.setOnClickListener {
            if (TextUtils.isEmpty(number1.text.toString()) || TextUtils.isEmpty(number2.text.toString())) {
                return@setOnClickListener
            }
            num1 = number1.text.toString().toDouble()
            num2 = number2.text.toString().toDouble()

            lastResult = num1 - num2

            result.text = "$num1 - $num2 = $lastResult"
        }
        multiply.setOnClickListener {
            if (TextUtils.isEmpty(number1.text.toString()) || TextUtils.isEmpty(number2.text.toString())) {
                return@setOnClickListener
            }
            num1 = number1.text.toString().toDouble()
            num2 = number2.text.toString().toDouble()

            lastResult = num1 * num2

            result.text = "$num1 * $num2 = $lastResult"
        }
        toSplit.setOnClickListener {
            if (TextUtils.isEmpty(number1.text.toString()) || TextUtils.isEmpty(number2.text.toString())) {
                return@setOnClickListener
            }
            num1 = number1.text.toString().toDouble()
            num2 = number2.text.toString().toDouble()

            if (num2.equals(0.0)){

                result.text = "На ноль делить нельзя!!!"

            }else{
                lastResult = num1 / num2

                result.text = "$num1 / $num2 = $lastResult"
            }
        }
    }

}