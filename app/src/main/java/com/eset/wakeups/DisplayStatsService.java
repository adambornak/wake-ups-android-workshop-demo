/**
 * @file DisplayStatsService.java
 * @author created by: Stefan Mitrik
 * @author created on: 17. 4. 2015
 * @author \n
 * @author Copyright (c) 2015 ESET, spol. s r. o.
 * @note current owner: Stefan Mitrik (stefan.mitrik@eset.sk)
 * @note IMPORTANT: Before doing any significant change to this file check your plan with the current owner to avoid unexpected behavior.
 */

package com.eset.wakeups;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.widget.Toast;

public class DisplayStatsService extends Service
{
    private BroadcastReceiver mReceiver;

    @Override
    public void onCreate()
    {
        super.onCreate();
        initBroadcastReceiver();
    }

    private void initBroadcastReceiver()
    {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);

        // TODO 2: add SCREEN_OFF action to intent filter

        mReceiver = new ScreenBroadcastReceiver();
        registerReceiver(mReceiver, filter);
    }

    @Override
    public void onDestroy()
    {
        unregisterReceiver(mReceiver);
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
