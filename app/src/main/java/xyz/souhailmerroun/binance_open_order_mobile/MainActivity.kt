package xyz.souhailmerroun.binance_open_order_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://buy.stripe.com/aEU3eOcYm3yR3Xq6op")
    }
}