package io.github.rifqips.hitungluaspersegipanjang.presenter

class LuasPresenter(
    private val luasView: LuasView
) {

    fun hitungLuas(panjang: Float, lebar: Float ){
        val hasil = panjang * lebar;

        luasView.hasilLuas(hasil)
    }


}