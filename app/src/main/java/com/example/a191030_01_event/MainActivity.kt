package com.example.a191030_01_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


        var textView:TextView? = null
    //xml에 그려진 초기 값이라고 적힌 텍스트뷰의 글자를 "실행 후"로 변경.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textView.findViewById<>(firstTextView);
        firstTextView.text = "실행 후"

        okBtn.setOnClickListener {
            firstTextView.text ="확인 버튼 클릭됨"
        }

        okBtn.setOnLongClickListener {

            firstTextView.text ="확인 버튼 롱클릭"
            return@setOnLongClickListener false
        }

        //@라벨 에 대한 예시. 책 49p.
        firstFor@ for(i in 0..10)
        {
            secondFor@ for(j in 0 .. 10){

                if(j==2)
                    break@firstFor
            }
        }

        var stringList:ArrayList<String> = ArrayList()

        //조경진 추가
        stringList.add("뫄뫄뫄")
        //"황진호" 글자를 추가
        stringList.add("황진호")
        //"구민성" 글자를 추가
        stringList.add("구민성")

        var intList:ArrayList<Int> = ArrayList()
        intList.add(10)
        intList.add(30)
        intList.add(50)

        //구민성은 몇 버너째로 넣었을까? 어느 위치에?
        val indexOfKoo =  stringList.indexOf("구민성")
        Log.d("구민성님의 위치",String.format("%d",indexOfKoo))

        //뫄뫄뫄씨 제거.
        stringList.remove("뫄뫄뫄")

        var a = 10
        var b = 20
        var c = if(a==b){
            Log.d("로그","둘이 같다")
        }else{
            Log.d("로그","둘이 다르다")
        } //이런 문법도 가능함. 책 39p

        when(a){
            0,1 -> Log.d("when연습","a가 0이나 1이다")
            in 2..5 -> Log.d("when연습","a가 2~5사이다")
            in intList -> Log.d("when연습","a가 intList에 포함")
            !in intList -> Log.d("when연습","a가 intList에 불포함")
        }

        for(name in stringList){
            Log.d("사람이름",name)
        }

        for(i in 0..5){
            Log.d("숫자찍기",String.format("%d",i))
        }


    }
}
