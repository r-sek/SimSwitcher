package dev.r_sek.simswitcher.presenters

import dev.r_sek.simswitcher.contracts.TopContract
import dev.r_sek.simswitcher.models.SimInfo

class TopPresenter(private val view: TopContract.IView) : TopContract.IPresenter {
    override fun getSimInfo() {
        TODO("Not yet implemented")
        view.setSimInfo()
    }

    override fun changeDataUseSim() {
        TODO("Not yet implemented")
    }
}