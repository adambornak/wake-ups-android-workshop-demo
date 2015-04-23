/**
 * @file MainActivity.java
 * @author created by: Stefan Mitrik
 * @author created on: 17. 4. 2015
 * @author \n
 * @author Copyright (c) 2015 ESET, spol. s r. o.
 * @note current owner: Stefan Mitrik (stefan.mitrik@eset.sk)
 * @note IMPORTANT: Before doing any significant change to this file check your plan with the current owner to avoid unexpected behavior.
 */
package com.eset.wakeups;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
