package dev.r_sek.simswitcher.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.isVisible
import dev.r_sek.simswitcher.R
import dev.r_sek.simswitcher.models.SimInfo

class SimInfoView(context : Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet){

    private var phoneNoText: TextView
    private var careerText: TextView
    private var dataUsingText: TextView


    init {
        View.inflate(context, R.layout.view_sim_info, this)
        phoneNoText = findViewById(R.id.phone_no_text)
        careerText = findViewById(R.id.carrer_text)
        dataUsingText = findViewById(R.id.data_using_text)
    }

    public fun setSimInfo(info: SimInfo){
        phoneNoText.text = info.phoneNo
        careerText.text = info.careerName
        dataUsingText.isVisible = info.dataUseFlag
    }

}