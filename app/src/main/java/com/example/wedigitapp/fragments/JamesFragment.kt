package com.example.wedigitapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wedigitapp.R
import com.example.wedigitapp.adapters.JamesItemAdapter
import com.example.wedigitapp.models.ProfileData

class JamesFragment : Fragment() {

    private lateinit var list: ArrayList<ProfileData>
    private lateinit var adapter: JamesItemAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_james, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list = ArrayList()

        val profileData1 = ProfileData(
            "82.4k", R.drawable.flag
        )

        val profileData2 = ProfileData(
            "82.4k", R.drawable.flag
        )

        val profileData3 = ProfileData(
            "82.4k", R.drawable.flag
        )

        val profileData4 = ProfileData(
            "82.4k", R.drawable.flag
        )

        val profileData5 = ProfileData(
            "82.4k", R.drawable.flag
        )

        val profileData6 = ProfileData(
            "82.4k", R.drawable.flag
        )

        list.add(profileData1)
        list.add(profileData2)
        list.add(profileData3)
        list.add(profileData4)
        list.add(profileData5)
        list.add(profileData6)

        recyclerView = view.findViewById(R.id.james_rec_view)

        val layoutManager = GridLayoutManager(context, 3)
        recyclerView.layoutManager = layoutManager

        recyclerView.setHasFixedSize(true)
        adapter = JamesItemAdapter(requireContext(), list)
        recyclerView.adapter = adapter
    }
}