package cn.hito.screencapturekit.callback

import cn.hito.screencapturekit.ErrorInfo


fun interface ErrorCallBack {
    fun onError(error: ErrorInfo)
}