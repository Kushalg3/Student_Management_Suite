package com.example.studentmanagementsuite

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import soup.neumorphism.NeumorphCardView
import soup.neumorphism.NeumorphImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TeacherLogin.newInstance] factory method to
 * create an instance of this fragment.
 */
class TeacherLogin : Fragment() {
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
        val v = inflater.inflate(R.layout.fragment_teacher_login, container, false)
        val context = activity as AppCompatActivity
        val backButton = v.findViewById<NeumorphImageButton>(R.id.backbtn2)
        val fm = context.supportFragmentManager.beginTransaction()
        backButton.setOnClickListener(){
            fm.replace(R.id.host,LoginAs())
            fm.addToBackStack(null)
            fm.commit()
        }
        val loginButton = v.findViewById<NeumorphCardView>(R.id.login_button2)
        loginButton.setOnClickListener{
            fm.replace(R.id.host,Teacher_deck())
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
         * @return A new instance of fragment TeacherLogin.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TeacherLogin().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}