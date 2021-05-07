package io.github.rifqips.hitungluaspersegipanjang.presenter

class KelilingPre (
        private val KelilingView: LuasView
) {

    fun hitungKeliling(panjang: Float, lebar: Float ){
        val hasil = 2 * (panjang + lebar);

        KelilingView.hasilLuas(hasil)
    }


}