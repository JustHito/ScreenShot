package cn.hito.screencapturekit

import java.nio.ByteBuffer

data class OutputBufferInfo(var index:Int, var buffer: ByteBuffer, var isKeyFrame:Boolean, var presentationTimestampUs:Long, var size:Int)

