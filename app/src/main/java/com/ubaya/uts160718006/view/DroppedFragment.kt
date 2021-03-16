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
import com.ubaya.uts160718006.viewmodel.DroppedListViewModel
import com.ubaya.uts160718006.viewmodel.PlanListViewModel
import kotlinx.android.synthetic.main.fragment_dropped.*
import kotlinx.android.synthetic.main.fragment_plan.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DroppedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DroppedFragment : Fragment() {
    private lateinit var viewModel: DroppedListViewModel
    private val droppedAdapter = DroppedListAdapter(arrayListOf())
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dropped, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel= ViewModelProvider(this).get(DroppedListViewModel::class.java)
        viewModel.refresh()

        recViewDropped.layoutManager = LinearLayoutManager(context)
        recViewDropped.adapter = droppedAdapter

        observeViewModel()
    }


    fun observeViewModel(){
        viewModel.droppedLD.observe(viewLifecycleOwner, Observer {
            droppedAdapter.updateDroppedList(it)
        })
    }
}