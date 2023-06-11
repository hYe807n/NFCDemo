package com.example.ohmygod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        Handler(Looper.getMainLooper()).postDelayed({

            // 일정 시간이 지나면 MainActivity 로 이동
            val intent= Intent( this, LoginActivity::class.java)
            startActivity(intent)

            // 이전 키를 눌렀을 때 스플래스 스크린 화면으로 이동을 방지하기 위해
            // 이동한 다음 사용안함으로 finish 처리
            finish()
        }, 500) // 시간 0.5초 이후 실행
    }
}