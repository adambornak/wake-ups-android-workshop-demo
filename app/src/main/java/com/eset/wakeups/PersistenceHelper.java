/**
 * @file PersistenceHelper.java
 * @author created by: Stefan Mitrik
 * @author created on: 17. 4. 2015
 * @author \n
 * @author Copyright (c) 2015 ESET, spol. s r. o.
 * @note current owner: Stefan Mitrik (stefan.mitrik@eset.sk)
 * @note IMPORTANT: Before doing any significant change to this file check your plan with the current owner to avoid unexpected behavior.
 */

package com.eset.wakeups;

import android.content.Context;
import android.content.SharedPreferences;

public class PersistenceHelper
{
    private static final String DEFAULT_PREFERENCES = "DEFAULT_PREFERENCES";

    private static final String KEY_LAST_WAKE_UP_TIME = "KEY_LAST_WAKE_UP_TIME";
    private static final String KEY_WAKE_UPS_NUMBER = "KEY_WAKE_UPS_NUMBER";
    private static final String KEY_LONGEST_STREAK = "KEY_LONGEST_STREAK";
    private static final String KEY_TOTAL_UP_TIME = "KEY_TOTAL_UP_TIME";

    private SharedPreferences mSharedPrefs;

    public PersistenceHelper(Context context)
    {
        mSharedPrefs = context.getSharedPreferences(DEFAULT_PREFERENCES, Context.MODE_PRIVATE);
    }

    public long getLastWakeUpTime()
    {
        return mSharedPrefs.getLong(KEY_LAST_WAKE_UP_TIME, System.currentTimeMillis());
    }

    public void setLastWakeUpTime(long lastWakeUpTime)
    {
        mSharedPrefs.edit().putLong(KEY_LAST_WAKE_UP_TIME, lastWakeUpTime).apply();
    }

    public int getWakeUpsNumber()
    {
        return mSharedPrefs.getInt(KEY_WAKE_UPS_NUMBER, 0);
    }

    public void incrementWakeUpsNumber()
    {
        mSharedPrefs.edit().putInt(KEY_WAKE_UPS_NUMBER, getWakeUpsNumber() + 1).apply();
    }

    public long getLongestStreak()
    {
        return mSharedPrefs.getLong(KEY_LONGEST_STREAK, 0l);
    }

    public void setLongestStreak(long longestStreak)
    {
        mSharedPrefs.edit().putLong(KEY_LONGEST_STREAK, longestStreak).apply();
    }

    public long getTotalUpTime()
    {
        return mSharedPrefs.getLong(KEY_TOTAL_UP_TIME, 0l);
    }

    public void incrementTotalUpTime(long increment)
    {
        mSharedPrefs.edit().putLong(KEY_TOTAL_UP_TIME, getTotalUpTime() + increment).apply();
    }
}
