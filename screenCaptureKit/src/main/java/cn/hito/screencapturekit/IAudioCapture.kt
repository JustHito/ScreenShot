package cn.hito.screencapturekit

interface IAudioCapture {
    fun startRecording(): Boolean
    fun stopRecording()
}