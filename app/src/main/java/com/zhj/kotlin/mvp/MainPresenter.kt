package com.zhj.kotlin.mvp

import com.zhj.kotlin.base.BasePresenter


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/11/1.
 */
class MainPresenter : BasePresenter<MainContract.View, MainViewModel>() ,MainContract.Presenter {

    override fun test() {
        mView?.showLoading()
        mView?.testSuccess()
    }
}