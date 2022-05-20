package com.davidmahendra.webviewlanjutan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

public class WebAppInterface
{
    private Activity _Activity;
    private Context _Context;

    public WebAppInterface(Context context, Activity activity)
    {
        _Context = context;
        _Activity = activity;
    }

    @JavascriptInterface
    public void showSms()
    {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        _Context.startActivity(intent);
    }
    @JavascriptInterface
    public  void showCalendar()
    {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        _Context.startActivity(intent);
    }
}
