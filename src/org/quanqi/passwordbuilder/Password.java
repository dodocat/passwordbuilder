package org.quanqi.passwordbuilder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;

public class Password extends Activity {
	
	private WebView mPassWebView;
	final static String URL = "file:///android_asset/p.html";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_password);
		this.initPassWebview();
		
	}
	
	private void initPassWebview() {
		this.mPassWebView = (WebView) findViewById(R.id.webView_password_builder);
		this.mPassWebView.setWebChromeClient(new myWebChromeClient());
		WebSettings settings = this.mPassWebView.getSettings();
		settings.setJavaScriptEnabled(true);
		settings.setMinimumFontSize(22);		
		this.mPassWebView.loadUrl(URL);
	}
	
	/**
	 * empty for future feature
	 * @author jingquanqi
	 *
	 */
	private class myWebChromeClient extends WebChromeClient {}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.password, menu);
		return true;
	}

}
