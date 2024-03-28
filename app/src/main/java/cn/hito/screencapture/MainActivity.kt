package cn.hito.screencapture

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import cn.hito.screencapturekit.ScreenCaptureKit
import cn.hito.screencapturekit.callback.H264CallBack
import java.nio.ByteBuffer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.start).setOnClickListener {
            requestCapture()
        }

        findViewById<Button>(R.id.stop).setOnClickListener {
            ScreenCaptureKit.stop()
        }
    }


    private fun requestCapture() {

        ScreenCaptureKit.init(this).onH264(object : H264CallBack {
            override fun onH264(
                buffer: ByteBuffer,
                isKeyFrame: Boolean,
                width: Int,
                height: Int,
                ts: Long
            ) {
            }

        }).onStart({
            //用户同意采集，开始采集数据
        }).start()

    }
}