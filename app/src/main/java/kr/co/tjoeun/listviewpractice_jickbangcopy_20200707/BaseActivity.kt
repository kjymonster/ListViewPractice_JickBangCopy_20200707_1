package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    //추상 클래스로 만들어줌.

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()  //Intent에서 받아온 값을 넣어주는 등의 기능

}