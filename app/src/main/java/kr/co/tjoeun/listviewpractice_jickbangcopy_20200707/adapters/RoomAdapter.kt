package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class RoomAdapter (val rContext: Context, val resId:Int, val rList : <Room>) :ArrayAdapter<Room>(rContext,resId,rList){
}