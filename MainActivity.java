package com.jarvis.answerai;
import android.app.*;import android.os.*;import android.webkit.*;import android.speech.tts.TextToSpeech;import java.util.*;import android.Manifest;import android.content.pm.PackageManager;
public class MainActivity extends Activity{
 WebView w; TextToSpeech tts;
 @Override public void onCreate(Bundle b){super.onCreate(b); w=new WebView(this); w.setBackgroundColor(0xff0b1020); WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);w.setWebChromeClient(new WebChromeClient());w.addJavascriptInterface(new Object(){@JavascriptInterface public void speak(String text){if(tts!=null)tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,"jarvis");}},"Android");setContentView(w);tts=new TextToSpeech(this,st->{if(st==TextToSpeech.SUCCESS)tts.setLanguage(Locale.US);});w.loadUrl("file:///android_asset/index.html");if(Build.VERSION.SDK_INT>=23&&checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED)requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO},10);}
 @Override protected void onDestroy(){if(tts!=null)tts.shutdown();super.onDestroy();}
}
