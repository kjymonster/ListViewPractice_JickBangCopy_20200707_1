package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()

    }


    override fun setupEvents() {

    }


    override fun setValues() {

        //일부러 지연 처리를 해주는 핸들러 변수
        val myHandler = Handler()


        //핸들러 변수를 이용하여 3초후에 {  }내부의 내용이 실행되도록
        myHandler.postDelayed({
                      val myIntent = Intent(mContext,MainActivity::class.java)
            startActivity(myIntent)

            //화면을 넘기고 나서는 로딩화면 종료
            finish()

        }, 3000)



    }


}