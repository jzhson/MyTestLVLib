package com.linariavulgaris.mylibrary.utils;

import android.content.Context;
import android.widget.TextView;

public class SPUtils {

    public static void init(Context context){
        if (context == null){
            throw new RuntimeException("");
        }
        TextView textView = new TextView(context);
        textView.setText("Hello, World!");
    }
}
