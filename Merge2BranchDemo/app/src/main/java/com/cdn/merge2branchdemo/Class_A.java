package com.cdn.merge2branchdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Rahul Sonpaliya on 27/12/17.
 */

public class Class_A {

    public static void showMsg(Context context){
        Toast.makeText(context, "Hello World from Class A", Toast.LENGTH_SHORT).show();
        //made this change to check if git-merge proper works
        Toast.makeText(context, "Toast after merge", Toast.LENGTH_SHORT).show();
    }

}
