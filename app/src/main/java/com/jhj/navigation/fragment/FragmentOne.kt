package com.jhj.navigation.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.jhj.navigation.R
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.button.setOnClickListener {
            getView()?.let { it1 ->
                val bundle = Bundle()
                bundle.putString("data", "111111111")
                Navigation.findNavController(it1).navigate(R.id.action_fragmentOne_to_fragmentTwo, bundle)
            }
        }

    }
}