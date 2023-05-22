package com.dede.android_eggs

import android.app.Application
import android.content.Context
import com.dede.android_eggs.settings.SettingsPref
import com.dede.android_eggs.util.ActivityActionDispatcher
import com.dede.android_eggs.util.SplitUtils
import com.dede.basic.GlobalContext
import me.weishu.reflection.Reflection

class EasterEggsApp : Application() {

    override fun attachBaseContext(base: Context?) {
        Reflection.unseal(base)
        GlobalContext.init(this)
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
        SettingsPref.apply(this)
        ActivityActionDispatcher.register(this)
        SplitUtils.initialize(this)
    }

}