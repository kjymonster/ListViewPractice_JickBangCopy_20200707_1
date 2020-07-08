package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail_actibity.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.priceTxt
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail_actibity.descTxt as descTxt1

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

        priceTxt.text = receivedRoom.getFormattedPrice()
        descTxt.text =receivedRoom.description
        addressTxt.text = receivedRoom.address
        floorTxt.text = receivedRoom.getFormattedFloor()



    }


}