package com.example.android_animation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.android_animation.databinding.FragmentAnimationBinding

class AnimationFragment : Fragment(R.layout.fragment_animation) {

    private var binding: FragmentAnimationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAnimationBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding!!.apply {

            bnZoom.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.zoom)
                imAndroid.startAnimation(anim)
            }

            bnRotate.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.rotate)
                imAndroid.startAnimation(anim)
            }

            bnFade.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.fade)
                imAndroid.startAnimation(anim)
            }

            bnBlink.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.blink)
                imAndroid.startAnimation(anim)
            }

            bnMove.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.move)
                imAndroid.startAnimation(anim)
            }

            bnSlide.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(context, R.anim.slide)
                imAndroid.startAnimation(anim)
            }

            bnJson.setOnClickListener {


                if(lottie.isAnimating == false){
                    imAndroid.visibility = View.GONE
                    lottie.visibility = View.VISIBLE
                    lottie.playAnimation()
                }

            }
        }

    }
}