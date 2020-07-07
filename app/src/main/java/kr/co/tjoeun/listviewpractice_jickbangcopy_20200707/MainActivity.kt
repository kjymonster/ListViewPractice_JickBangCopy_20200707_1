package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdater: RoomAdapter

    // 1st Step: AppCom~~ 을 BaseActivity로 변경
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mRoomList.add(Room(8000, "마포구 서교동", 1, "망원/홍대역 풀옵션 넓은 원룸"  ))
        mRoomList.add(Room(28500,"마포구 서교동",3,"신혼부부의 보금자리 서교동 신축빌라"))
        mRoomList.add(Room(30000, "마포구 서교동", 10, "망원/홍대역 풀옵션 넓은 원룸"  ))
        mRoomList.add(Room(24500,"마포구 서교동",13,"신혼부부의 보금자리 서교동 신축빌라"))
        mRoomList.add(Room(9000, "은평구 불광동", 5, "연신내 풀옵션 넓은 원룸"  ))
        mRoomList.add(Room(12400,"은평구 불광동",-1,"불광역 도보1분 보금자리 서교동 신축빌라"))
        mRoomList.add(Room(55000, "동대문구 OO동", 0, "롯데백화점 근접 풀옵션 넓은 원룸"  ))
        mRoomList.add(Room(52300,"은평구 녹번동",12,"신혼부부의 보금자리 녹번동 신축빌라"))

        mRoomAdater = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdater
    

    }



}