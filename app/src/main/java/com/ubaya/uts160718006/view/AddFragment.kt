package com.ubaya.uts160718006.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.squareup.picasso.Picasso
import com.ubaya.uts160718006.R
import kotlinx.android.synthetic.main.fragment_add.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnPreview.setOnClickListener {
            Picasso.get().load(txtInputURL.text.toString()).into(imgPreview)
        }
        val action =  AddFragmentDirections.actionBack()

        btnAdd.setOnClickListener {
            Navigation.findNavController(it).navigate(action)
        }

        btnBack.setOnClickListener {
            Navigation.findNavController(it).navigate(action)
        }
    }
}