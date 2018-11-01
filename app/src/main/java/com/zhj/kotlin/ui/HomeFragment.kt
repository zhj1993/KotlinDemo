package com.zhj.kotlin.ui

import android.util.Log
import com.zhj.kotlin.R
import com.zhj.kotlin.base.BaseFragment


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/30.
 */
class HomeFragment :BaseFragment() {


    override fun getLayoutId(): Int {
        Log.d("oye","getLayoutId")
        return R.layout.fragment_home_layout
    }

    override fun initData() {

    }
}