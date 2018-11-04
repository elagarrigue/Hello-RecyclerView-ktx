package com.android.ejercicios.hellorecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    listView.apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = ItemXAdapter(createDataSet())
    }
  }

  // photos from https://picsum.photos/
  private fun createDataSet(): List<ItemX> =
      ArrayList<ItemX>(24).apply {
        for (i in 0..23) {
          add(
              ItemX("item $i",
                  "Some description",
                  when (i % 6) {
                    0 -> R.drawable.picsum1
                    1 -> R.drawable.picsum2
                    2 -> R.drawable.picsum3
                    3 -> R.drawable.picsum4
                    4 -> R.drawable.picsum5
                    5 -> R.drawable.picsum6
                    else -> -1
                  }))
        }
      }
}
