package cn.hito.screencapturekit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity


object ScreenCaptureKit{

    private var activity: FragmentActivity? = null
    private var fragment: Fragment? = null

    internal lateinit var encodeBuilder:EncodeBuilder

    fun init(activity: FragmentActivity) = EncodeBuilder(fragment, activity).also { encodeBuilder = it }


    fun init(fragment: Fragment) = EncodeBuilder(fragment,activity).also { encodeBuilder =it }

    fun setMicrophoneMute(mute:Boolean){
        encodeBuilder.setMicrophoneMute(mute)
    }

    fun stop(){
        encodeBuilder.stop()
    }







}