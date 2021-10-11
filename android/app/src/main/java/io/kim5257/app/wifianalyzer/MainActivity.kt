package io.kim5257.app.wifianalyzer

import android.os.Bundle
import android.util.Log
import com.getcapacitor.BridgeActivity

class MainActivity: BridgeActivity() {
    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate")
    }
}
