package com.matur.lsmestudiantes.ui.gallery

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.matur.lsmestudiantes.DictSigns
import com.matur.lsmestudiantes.R
import com.matur.lsmestudiantes.Topic
import com.matur.lsmestudiantes.databinding.FragmentAdivinaSeniaBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentAdivinaSeniaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var videoView: VideoView? = null
    private var pause: Boolean = true
    private var questionNumber = 1
    private var iterations = 10
    private var correctAnswer: String = ""
    private var score: Int = 0



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)
        container?.removeAllViews()


        _binding = FragmentAdivinaSeniaBinding.inflate(inflater, container, false)
        val root: View = binding.root
        videoView = binding.videoView
//        val textView: TextView = binding.textGallery
//        galleryViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        initOptions()
        startGame()



        return root
    }


//    override fun onResume() {
//        startGame()
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initOptions(){
        binding.option1.setOnClickListener{
            evaluateAnswer(binding.option1.text.toString())
            startGame()
        }
        binding.option2.setOnClickListener{
            evaluateAnswer(binding.option2.text.toString())
            startGame()
        }
        binding.option3.setOnClickListener{
            evaluateAnswer(binding.option3.text.toString())
            startGame()
        }
        binding.option4.setOnClickListener{
            evaluateAnswer(binding.option4.text.toString())
            startGame()
        }
    }

    fun evaluateAnswer(inputAnswer: String){
        if(inputAnswer == correctAnswer){
            score++
            binding.score.text = "Score $score / $iterations"
            Toast.makeText(context, "¡¡Respuesta correcta!!", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "¡INCORRECTO! Respuesta correcta: $correctAnswer", Toast.LENGTH_LONG).show()
        }
    }
    fun startGame(){
        val topics: MutableList<Topic> = DictSigns.getSelectedTopics()
        if(topics.isEmpty()){
            Toast.makeText(context, "Seleccione por lo menos un tema en Settings para poder jugar", Toast.LENGTH_LONG).show()
            return
        }
        binding.questionNumber.text = "Pregunta: $questionNumber/$iterations"
        binding.score.text = "Score $score / $iterations"
        val randomTopic = (0 until topics.size).random()
        val randomWord = (0 until topics[randomTopic].wordsList.size).random()

        var keyTopic: String = topics[randomTopic].wordsList[randomWord]
        val randomTopicName: String = topics[randomTopic].name
        Log.d("------>KeyTopic", "$keyTopic del $randomTopicName")
        var id: Int = topics[randomTopic].wordsIds[keyTopic]!!
        correctAnswer = keyTopic
        val randomOptions = Array<String>(4) { "it = $it" }
        randomOptions[0] = keyTopic
        randomOptions[1] = topics[randomTopic].wordsList[(0 until topics[randomTopic].wordsList.size).random()]
        randomOptions[2] = topics[randomTopic].wordsList[(0 until topics[randomTopic].wordsList.size).random()]
        randomOptions[3] = topics[randomTopic].wordsList[(0 until topics[randomTopic].wordsList.size).random()]
        randomOptions.shuffle()
        binding.option1.text = randomOptions[0]
        binding.option2.text = randomOptions[1]
        binding.option3.text = randomOptions[2]
        binding.option4.text = randomOptions[3]
        startVideo(id)
        questionNumber++
//
//        for (number in 1 .. iterations){
//            pause = true
//            binding.questionNumber.text = "Pregunta: $number/$iterations"
//            var keyTopic: String = topics[0].wordsList[0]
//            var id: Int = topics[0].wordsIds[keyTopic]!!
//            binding.option1.text = keyTopic
//            binding.option2.text = topics[0].wordsList[1]
//            binding.option3.text = topics[1].wordsList[0]
//            binding.option4.text = topics[1].wordsList[1]
//            startVideo(id)
////            Thread.sleep(5_000)
////            while (pause){
////                videoView!!.start()
////            }
//        }

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