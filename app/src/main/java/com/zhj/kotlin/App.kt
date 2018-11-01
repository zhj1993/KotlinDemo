package com.zhj.kotlin

import android.app.Application


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/31.
 */
class App : Application() {

    companion object {

        var mApp: Application? = null

        fun getInstance(): Application? {
            return mApp
        }
    }

    override fun onCreate() {
        super.onCreate()
        mApp = this
    }
}