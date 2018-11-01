package com.zhj.kotlin.base

import android.app.Activity


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/31.
 */
interface BaseContract {

    interface Presenter<in V : BaseContract.View> {

        fun attachView(mView: V)

        fun detachView()
    }

    interface View {

        fun showLoading()

        fun dismissLoading()

        fun showEntry()

        fun showToast(isSuccess: Boolean, msg: String)

    }
}