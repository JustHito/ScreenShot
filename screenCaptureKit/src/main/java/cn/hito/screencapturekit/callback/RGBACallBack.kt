package cn.hito.screencapturekit.callback

fun interface RGBACallBack{
    fun onRGBA(rgba: ByteArray,width:Int,height:Int,stride:Int,rotation:Int,rotationChanged:Boolean)
}