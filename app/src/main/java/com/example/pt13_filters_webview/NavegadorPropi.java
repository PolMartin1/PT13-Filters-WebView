package com.example.pt13_filters_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import static android.text.TextUtils.isEmpty;

public class NavegadorPropi extends AppCompatActivity {

    WebView myWeb = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador_propi);

        /*Intent intent = getIntent();
        Uri url = intent.getData();

        Log.d("test", "rep: " + url.toString());

        myWeb = (WebView) findViewById(R.id.NavegadorPropi);

        myWeb.setWebViewClient(new MyWebViewClient());

        myWeb.getSettings().setJavaScriptEnabled(true);

        Log.d("test","loadurl abans: "+ url);

        myWeb.loadUrl(String.valueOf(url));

        Log.d("test","after loading url: "+ url);

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //Si la url es la de l'institut, la carrega MyWebViewClient
            if (Uri.parse(url).getHost().contains("escoladeltreball")) {
                Log.d("test","shouldOverride no:"+url);
                return false;

            }
            //Si es una altre url, l'activitat la inicia l'aplicació del sistema android que pugui llegir URLs
            Log.d("test","shouldOverride: yes "+url);
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
            return true;
        }*/
    }

}
