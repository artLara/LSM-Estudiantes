package com.matur.lsmestudiantes

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.matur.lsmestudiantes.databinding.FragmentAdivinaSeniaBinding
import com.matur.lsmestudiantes.databinding.FragmentAprenderBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val TOPIC = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AprenderFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AprenderFragment : Fragment(), AdapterView.OnItemSelectedListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var topic: String? = null
    private var _binding: FragmentAprenderBinding? = null
    private lateinit var signName: TextView
    private lateinit var topicSelected: Topic
    private var videoView: VideoView? = null
    private lateinit var buttonNext: Button
    private lateinit var buttonBack: Button

    // This property is only valid between onCreateView and
    // onDestroyView.
//    private val binding get() = _binding!!
    private lateinit var binding: FragmentAprenderBinding
//    private var topics: List<Topic>? = null

    private lateinit var spinner: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentAprenderBinding.inflate(layoutInflater)

        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
            topic =  it.getString(TOPIC)
        }
        binding.textViewAprenderCorrect.text = topic

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        container?.removeAllViews()
        val view: View = inflater.inflate(R.layout.fragment_aprender, container, false)
        Log.d("--->AprenderFragment:", "topic=$topic")
        this.signName = view.findViewById(R.id.textViewAprenderCorrect)
        this.signName.text = topic
        this.spinner = view.findViewById(R.id.spinnerTopics)
        this.topicSelected = DictSigns.getSpecificTopic(topic!!)
        this.videoView = view.findViewById(R.id.videoviewAprender)
        this.buttonNext = view.findViewById(R.id.buttonNext)
        this.buttonBack = view.findViewById(R.id.buttonBack)


        var aa = ArrayAdapter(activity!!, android.R.layout.simple_spinner_item, this.topicSelected.wordsList)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        with(this.spinner)
        {
            adapter = aa
            setSelection(0, true)
            onItemSelectedListener = this@AprenderFragment
            prompt = "Selecciona la palabra a mostrar"
            gravity = Gravity.CENTER
        }
        var topicString : String = topicSelected.wordsList[0]
        signName.text = topicString
        topicSelected.wordsIds[topicString]?.let { startVideo(it) }

        buttonNext.setOnClickListener{
            var position: Int = spinner.selectedItemPosition
            if(position < topicSelected.wordsList.size-1){
                position++
            }else{
                position = 0
            }
            topicString = topicSelected.wordsList[position]
            spinner.setSelection(position)
            signName.text = topicString
            topicSelected.wordsIds[topicString]?.let { startVideo(it) }
        }

        buttonBack.setOnClickListener{
            var position: Int = spinner.selectedItemPosition
            if(position > 0){
                position--
            }else{
                position = topicSelected.wordsList.size-1
            }
            topicString = topicSelected.wordsList[position]
            spinner.setSelection(position)
            signName.text = topicString
            topicSelected.wordsIds[topicString]?.let { startVideo(it) }
        }
//        val spinner = Spinner(this)
//        spinner.id = NEW_SPINNER_ID
//
//        val ll = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
//
//        ll.setMargins(10, 40, 10, 10)
//        linearLayout.addView(spinner)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AprenderFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(topic: String) =
            AprenderFragment().apply {
                arguments = Bundle().apply {
//                    val adapter = ArrayAdapter(this,
//                        android.R.layout.activity_list_item, topics)
                    putString(TOPIC, topic)

                }
            }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        val topicString : String
        topicString = topicSelected.wordsList[position]
        signName.text = topicString
        topicSelected.wordsIds[topicString]?.let { startVideo(it) }

//        when (view?.id) {
//            1 -> signName.text = signsTopic[view!!.id]
//            else -> {
//                showToast(message = "Spinner 1 Position:${position} and language: ${languages[position]}")
//            }
//        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        Toast.makeText(context, "Nada seleccionado", Toast.LENGTH_SHORT).show()
    }

    fun startVideo(id: Int){
        videoView!!.setVideoURI(
            Uri.parse("android.resource://"
                    + context!!.packageName + "/" + id))

        videoView!!.requestFocus()
        videoView!!.start()
        videoView!!.setOnPreparedListener { it.isLooping = true }



        // display a toast message if any
        // error occurs while playing the video
        videoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(context, "An Error Occurred " +
                    "While Playing Video !!!", Toast.LENGTH_LONG).show()
            false
        }
    }
}