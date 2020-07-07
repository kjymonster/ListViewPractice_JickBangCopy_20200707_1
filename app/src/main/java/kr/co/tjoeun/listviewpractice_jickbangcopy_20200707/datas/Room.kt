package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

class Room(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
) {

    //억 단위 , 처리 / 주소 옆에 ,+층수
    fun getFormattedPrice(): String {
        // 1억이 넘냐 아니냐에 따라 다르게 가공.
        if (this.price >= 10000) {

            //?억?만원 양식으로 가공 (uk = "억"...)
            //몇억? 85000 => 8억   ----> 85000 / 10000 = 8.5 (Int는 소수점을 버림. 8억으로 표시)
            val uk = this.price / 10000
            val rest = this.price % 10000  //몇만원? 89999 => 9999만 추출? ----> 89999 % 10000 = 9999

            return String.format("%,d억 %,d만원", uk, rest)
        } else {
            //1억이 안되는 경우 => 8,500만원 형식으로 가공. (자바 String이용)
            return String.format("%,d만원", this.price)
        }

        }

    fun getFormattedFloor() : String{

        //지상층 (1이상) / 반지하(0층) / 지하층( -1 ~ 그 이하)
        if(this.floor >= 1){
            //지상
            return "${this.floor}층"
        }
        else if(this.floor == 0){
            //반지하
            return  "반지하"
        }
        else{

            //이미 들어있는 값이 -1 등의 음수이었으므로, 다시 -1을 곱해서 양수가 나오도록 부호 변경
            return "지하 ${-this.floor}층"

        }

    }
}