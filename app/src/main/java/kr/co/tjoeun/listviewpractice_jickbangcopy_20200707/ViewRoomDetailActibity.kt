package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class ViewRoomDetailActibity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail_actibity)
        setupEvents()
        setValues()

    }


    override fun setupEvents() {

    }

    override fun setValues() {
       val receivedRoom = intent.getSerializableExtra("room") as Room


    }


}