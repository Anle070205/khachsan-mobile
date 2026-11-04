package vn.edu.ute.datphongtest.data

import vn.edu.ute.datphongtest.model.DonDatPhong
import vn.edu.ute.datphongtest.model.LoaiPhong

object DuLieuMau {
    val dsLoaiPhong : List<LoaiPhong> = listOf(
        LoaiPhong("P139", "Phòng Tiêu chuẩn", 500000, 2),
        LoaiPhong("D201", "Phòng Deluxe", 800000, 2),
        LoaiPhong("F301", "Phòng Gia đình", 1200000, 4),
        LoaiPhong("S401", "Phòng Suite", 2500000, 3),
        LoaiPhong("V501", "Biệt thự", 4500000, 6)
    )
    val dsDonDatPhong : List<DonDatPhong> = listOf(
        DonDatPhong("levietan","1234567891","anle3@gmail.com","P139",
            "20/10/2026",3,3,"rất vui nhọn") ,
        DonDatPhong("levietbinh","1234567892","binhle3@gmail.com","PD201",
        "30/10/2026",4,2,"rất vui nhọn")
    )
}