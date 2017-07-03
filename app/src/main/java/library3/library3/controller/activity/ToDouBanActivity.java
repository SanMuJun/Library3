package library3.library3.controller.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import library3.library3.R;

public class ToDouBanActivity extends Activity {

    private String bookInternetUrl;

    @ViewInject(R.id.wb_webview)
    private WebView wb_webview;
    @ViewInject(R.id.pb_loading)
    private ProgressBar pb_loading;
    @ViewInject(R.id.tv_loading)
    private TextView tv_loading;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_dou_ban);
        x.view().inject(this);
        bookInternetUrl = getIntent().getStringExtra("bookInternetUrl");
        getWebView();

    }
    private void getWebView() {
        WebSettings settingWebView = wb_webview.getSettings();
        settingWebView.setJavaScriptEnabled(true);
        wb_webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                pb_loading.setVisibility(View.GONE);
                tv_loading.setVisibility(View.GONE);
            }
        });

        wb_webview.loadUrl(bookInternetUrl);

    }


}
