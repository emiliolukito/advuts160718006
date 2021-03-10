package com.ubaya.uts160718006.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ubaya.uts160718006.R
import com.ubaya.uts160718006.viewmodel.WatchingListViewModel
import kotlinx.android.synthetic.main.fragment_main.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    private lateinit var viewModel:WatchingListViewModel
    private val watchingAdapter = WatchingListAdapter(arrayListOf())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this).get(WatchingListViewModel::class.java)
        viewModel.refresh()

        recViewWatching.layoutManager = LinearLayoutManager(context)
        recViewWatching.adapter = watchingAdapter

        observeViewModel()
    }
    fun observeViewModel(){
        viewModel.watchingLD.observe(viewLifecycleOwner, Observer {
            watchingAdapter.updateWatchingList(it)
        })
    }
}