package com.zopsmart.cl_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
var input :String=""
    val textInput : TextView by lazy { findViewById(R.id.txtInput) }
    val one : Button by lazy { findViewById(R.id.btnOne) }
    private val two: Button by lazy { findViewById(R.id.btnTwo) }
    private val three: Button by lazy { findViewById(R.id.btnThree) }
    private val four: Button by lazy { findViewById(R.id.btnFour) }
    private val five: Button by lazy { findViewById(R.id.btnFive) }
    private val six: Button by lazy { findViewById(R.id.btnSix) }
    private val seven: Button by lazy { findViewById(R.id.btnSeven) }
    private val eight: Button by lazy { findViewById(R.id.btnEight) }
    private val nine: Button by lazy { findViewById(R.id.btnNine) }
    private val zero: Button by lazy { findViewById(R.id.btnZero) }
    private val equal: Button by lazy { findViewById(R.id.btnEquals) }
    private val add: Button by lazy { findViewById(R.id.btnAdd) }
    private val sub: Button by lazy { findViewById(R.id.btnSubtract) }
    private val multi: Button by lazy { findViewById(R.id.btnMultiply) }
    private val divide: Button by lazy { findViewById(R.id.btnDivide) }

    //private val  decimal : Button=findViewById(R.id.btnDecimal)
    private val clear: Button by lazy { findViewById(R.id.btnClear) }
    private val back: Button by lazy { findViewById(R.id.btnBack) }

    private val textSolution: TextView by lazy { findViewById(R.id.txtSolution) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener { input+="1"
            textInput.text=input}

        two.setOnClickListener { input+="2"
            textInput.text=input}
        three.setOnClickListener { input+="3"
            textInput.text=input}
        four.setOnClickListener { input+="4"
            textInput.text=input}
        five.setOnClickListener { input+="5"
            textInput.text=input}
        six.setOnClickListener { input+="6"
            textInput.text=input}
        seven.setOnClickListener { input+="7"
            textInput.text=input}
        eight.setOnClickListener { input+="8"
            textInput.text=input}
        nine.setOnClickListener { input+="9"
            textInput.text=input}
        zero.setOnClickListener { input+="0"
            textInput.text=input}
        add.setOnClickListener { input+="+"
            textInput.text=input}
        sub.setOnClickListener { input+="-"
            textInput.text=input}
        multi.setOnClickListener { input+="*"
            textInput.text=input}
        divide.setOnClickListener { input+="/"
            textInput.text=input}
        clear.setOnClickListener {
            input=""
            textInput.text=input
            textSolution.text=""
        }

        back.setOnClickListener{
            input=input.dropLast(1)
            textInput.text=input
        }
        equal.setOnClickListener { calculate()}


    }

private fun calculate()
    {           var result:Int=0
                var operatorIdx:Int=0
                var k:Int=0
                var n1 :String=""
                n1+=input[0]
                for(i in 1..input.length-1)
                {
                    if(input[i]=='-' || input[i]=='+' || input[i]=='*' || input[i]=='/')
                    {
                        operatorIdx=i
                        k=i+1
                        break
                    }
                    n1+=input[i]
                }
                var n2 :String = ""
                n2+=input[k]

                for(i in k+1..input.length-1)
                {
                    if(input[i]=='-' || input[i]=='+' || input[i]=='*' || input[i]=='/')
                    {
                        break
                    }
                    n2+=input[i]
                }


                val firstValue = n1.toInt()
                val secondValue = n2.toInt()

                if(input[operatorIdx]=='+')
                {
                    result = firstValue + secondValue
                }

                if (input[operatorIdx]=='*')
                {

                    result = firstValue * secondValue
                }

                 if (input[operatorIdx]=='/')
                {
                    result = firstValue / secondValue
                }
                 if(input[operatorIdx]=='-')
                {
                    result = firstValue - secondValue
                }


textSolution.text=result.toString()


    }

    }
