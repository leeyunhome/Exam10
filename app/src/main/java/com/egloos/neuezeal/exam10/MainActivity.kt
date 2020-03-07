package com.egloos.neuezeal.exam10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruitList = listOf(
            SampleModel(R.drawable.image_1, "딸기"),
            SampleModel(R.drawable.image_2, "오렌지"),
            SampleModel(R.drawable.image_3, "바나나"),
            SampleModel(R.drawable.image_4, "석류"),
            SampleModel(R.drawable.image_5, "키위"),
            SampleModel(R.drawable.image_6, "레몬")
        )

//        val adapter = SampleDataAdapter(fruitList, R.layout.item_box_1)
//        val adapter = SampleDataAdapter(fruitList, R.layout.item_box_2)
        val adapter = SampleDataAdapter(fruitList, R.layout.item_box_3)

        sampleListView.adapter = adapter
//        sampleListView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
//        sampleListView.layoutManager = GridLayoutManager(this, 2)
        sampleListView.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
    }
}
