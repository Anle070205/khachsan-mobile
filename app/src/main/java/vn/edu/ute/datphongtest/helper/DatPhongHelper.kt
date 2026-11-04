package vn.edu.ute.datphongtest.helper

import vn.edu.ute.datphongtest.data.DuLieuMau
import vn.edu.ute.datphongtest.model.LoaiPhong

object DatPhongHelper {
    fun timLoaiPhong(ma: String): LoaiPhong?{
        val key = ma.trim()
        return DuLieuMau.dsLoaiPhong.find { it.ma.equals(key,ignoreCase = true) }
    }
    fun hopLeSoKhach(loai : LoaiPhong , soKhach : Int) : Boolean = soKhach in 1..(loai.sucChua + 2)
    fun tinhTongTien(loai: LoaiPhong,soDem: Int,soKhach: Int): Long{
        if(soDem < 1 || !hopLeSoKhach(loai,soKhach)) return 0
        var tienPhong = loai.giaMotDem * soDem
        if(soDem > 4) {
            tienPhong = tienPhong * 85 / 100
        }
        var khachVuot = maxOf(0,soKhach - loai.sucChua)
        var phuThu = khachVuot * 150000 * soDem
        return tienPhong + phuThu
    }
    


}