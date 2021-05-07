package io.github.rifqips.hitungluaspersegipanjang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import io.github.rifqips.hitungluaspersegipanjang.presenter.KelilingPre
import io.github.rifqips.hitungluaspersegipanjang.presenter.KelilingView
import io.github.rifqips.hitungluaspersegipanjang.presenter.LuasPresenter
import io.github.rifqips.hitungluaspersegipanjang.presenter.LuasView

class MainActivity : AppCompatActivity(), LuasView, KelilingView {

        private lateinit var presenter: LuasPresenter
        private lateinit var pre: KelilingPre
        private lateinit var etPanjang: EditText
        private lateinit var etLebar: EditText
        private lateinit var tvHasilLuas: TextView
        private lateinit var tvHasilKeliling: TextView
        private lateinit var btnHitungLuas: MaterialButton
        private lateinit var btnHitungKeliling: MaterialButton


        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                presenter = LuasPresenter(this)
                pre = KelilingPre(this)

                etPanjang = findViewById(R.id.et_masukkan_panjang)
                etLebar = findViewById(R.id.et_masukkan_lebar)
                tvHasilLuas = findViewById(R.id.tv_hasil_luas)
                btnHitungLuas = findViewById(R.id.btn_hitung_luas)
                btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)

                btnHitungLuas.setOnClickListener{
                        val panjang = etPanjang.text.toString().trim().toFloat()
                        val lebar = etLebar.text.toString().trim().toFloat()

                        presenter.hitungLuas(panjang, lebar)
                }
                btnHitungKeliling.setOnClickListener{
                        val panjang = etPanjang.text.toString().trim().toFloat()
                        val lebar = etLebar.text.toString().trim().toFloat()

                        pre.hitungKeliling(panjang, lebar)
                }


        }

        override fun hasilLuas(luas: Float) {
                tvHasilLuas.text = luas.toString()
        }

        override fun hasilKeliling(keliling: Float) {
                tvHasilKeliling.text = keliling.toString()
        }
}
