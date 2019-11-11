package com.tioeun.a20191111_01_dateandtime.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tioeun.a20191111_01_dateandtime.R
import com.tioeun.a20191111_01_dateandtime.datas.ScheduleType
import java.util.zip.Inflater

class ScheduleTypeSpinnerAdapter(context: Context, res:Int, list: ArrayList<ScheduleType>) : ArrayAdapter<ScheduleType>(context, res, list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list: ArrayList<ScheduleType>) : this(context, R.layout.schedule_type_list_item, list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.schedule_type_view_item, null)
        }

        var row = tempRow!!

//        var summaryTxt = row.findViewById<TextView>(R.id.summaryTxt)
//        var typeTxt = row.findViewById<TextView>(R.id.typeTxt)

//        var data = mList.get(position)
//
//        typeTxt.text = data.title
//        summaryTxt.setBackgroundColor(Color.parseColor(data.color))
        var summaryTxt = row.findViewById<TextView>(R.id.summaryTxt)
        var typeTxt = row.findViewById<TextView>(R.id.typeTxt)

        var data = mList.get(position)

        var splitStr = data.title.split(" ")

        typeTxt.text = data.title

        summaryTxt.text = splitStr.get(0)
        summaryTxt.setBackgroundColor(Color.parseColor(data.color))

        return row
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.schedule_type_list_item, null)
        }

        var row = tempRow!!

//        var summaryTxt = row.findViewById<TextView>(R.id.summaryTxt)
//        var typeTxt = row.findViewById<TextView>(R.id.typeTxt)
//
//        var data = mList.get(position)
//
//        typeTxt.text = data.title
//        summaryTxt.setBackgroundColor(Color.parseColor(data.color))
        var summaryTxt = row.findViewById<TextView>(R.id.summaryTxt)
        var typeTxt = row.findViewById<TextView>(R.id.typeTxt)

        var data = mList.get(position)

        var splitStr = data.title.split(" ")

        typeTxt.text = data.title
        summaryTxt.text = splitStr.get(0)
        summaryTxt.setBackgroundColor(Color.parseColor(data.color))

        return row
    }
}