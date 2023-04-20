package dev.r_sek.simswitcher.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.r_sek.simswitcher.R
import dev.r_sek.simswitcher.contracts.TopContract
import dev.r_sek.simswitcher.databinding.FragmentTopBinding
import dev.r_sek.simswitcher.presenters.TopPresenter

class TopFragment : Fragment(), TopContract.IView {

    private var _binding :FragmentTopBinding? = null
    lateinit var presenter: TopContract.IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = TopPresenter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTopBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_top, container, false)
    }

    override fun onResume() {
        super.onResume()
        //TODO: SIM情報の取得、データ処理の反映
        presenter.getSimInfo()

        _binding?.changeDataUseButton?.setOnClickListener{
            presenter.changeDataUseSim()
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun setSimInfo() {
        TODO("Not yet implemented")
    }
}