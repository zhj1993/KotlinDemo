package com.zhj.kotlin.base


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/31.
 */
open class BasePresenter<V : BaseContract.View, M : BaseViewModel> : BaseContract.Presenter<V> {

    var mView: V? = null
    var mViewModel: M? = null

    fun buildViewModel(viewModel: BaseViewModel?) {
        this.mViewModel = viewModel as M
    }

    override fun attachView(mView: V) {
        this.mView = mView
    }

    override fun detachView() {
        if (null != this.mView) {
            mView = null
        }
    }
}