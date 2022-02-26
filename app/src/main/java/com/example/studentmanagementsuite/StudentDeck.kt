package com.example.studentmanagementsuite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import soup.neumorphism.NeumorphCardView
import soup.neumorphism.NeumorphImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StudentDeck.newInstance] factory method to
 * create an instance of this fragment.
 */
class StudentDeck : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_student_deck, container, false)
        val context = activity as AppCompatActivity
        val fm = context.supportFragmentManager.beginTransaction()
        val logout = v.findViewById<NeumorphCardView>(R.id.logout_button)
        logout.setOnClickListener {
            fm.replace(R.id.host,StudentLogin())
            fm.addToBackStack(null)
            fm.commit()
        }
        val attend = v.findViewById<NeumorphCardView>(R.id.attedence)
        attend.setOnClickListener {
            fm.replace(R.id.host, Attendence())
            fm.addToBackStack(null)
            fm.commit()
        }
        val homeButton = v.findViewById<NeumorphImageButton>(R.id.home_button)
        homeButton.setOnClickListener {
            fm.replace(R.id.host,StudentDeck())
            fm.addToBackStack(null)
            fm.commit()
        }
        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StudentDeck.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StudentDeck().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}