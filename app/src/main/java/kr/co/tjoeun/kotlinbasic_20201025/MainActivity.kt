package kr.co.tjoeun.kotlinbasic_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn.setOnClickListener {

            Log.d("메인화면", "로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어보기")

        }

        toastBtn.setOnClickListener {


        }

    }
}