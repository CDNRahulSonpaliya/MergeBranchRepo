package com.cdn.merge2branchdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Rahul Sonpaliya on 27/12/17.
 */

public class CommonClass {

    public static void showMsg(Context context){
        Toast.makeText(context, "Hello World from common class", Toast.LENGTH_LONG).show();
    }

}
