package com.sean.myapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.webview);

        WebView MyWebView = (WebView) findViewById(R.id.webView);
        MyWebView.getSettings().setJavaScriptEnabled(true);
        MyWebView.setWebViewClient(new WebViewClient());
        MyWebView.loadUrl("http://www.wemart.cn/v2/weimao/index.html?disableCache=true&shopId=shop000201511056459");

    }
}
