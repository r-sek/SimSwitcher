package dev.r_sek.simswitcher.contracts

import dev.r_sek.simswitcher.models.SimInfo

interface TopContract {
    interface IView{
        public fun setSimInfo()
    }

    interface IPresenter{
        public fun getSimInfo()
        public fun changeDataUseSim()
    }
}