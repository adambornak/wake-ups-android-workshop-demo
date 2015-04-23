/**
 * @file ScreenBroadcastReceiver.java
 * @author created by: Stefan Mitrik
 * @author created on: 17. 4. 2015
 * @author \n
 * @author Copyright (c) 2015 ESET, spol. s r. o.
 * @note current owner: Stefan Mitrik (stefan.mitrik@eset.sk)
 * @note IMPORTANT: Before doing any significant change to this file check your plan with the current owner to avoid unexpected behavior.
 */

package com.eset.wakeups;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        // TODO 3: we need to find out whether was screen turned ON or OFF
        // TODO 4: display "toast" with "Hello Kitty" text when screen turns ON
    }
}
