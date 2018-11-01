package com.zhj.kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.zhj.kotlin.viewmodel.ClassHelper
import com.zhj.kotlin.viewmodel.ViewModelHelper


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/30.
 */
abstract class BaseActivity<P : BasePresenter<*, *>, V : BaseViewModel> :
        AppCompatActivity(), BaseContract.View {

    var mPresenter: P? = null
    var mViewModel: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initViewModel()
        attachView()
        initView()
        initData()
    }

    //layoutId
    abstract fun getLayoutId(): Int

    abstract fun initView()

    abstract fun initData()


    /**
     * 初始化viewmodel presenter
     */
    protected fun initViewModel() {
        mViewModel = ViewModelHelper.VMProviders(this, ClassHelper.getClass<V>(this, 1)!!)
        mPresenter = ClassHelper.getNewInstance(this, 0)
        mPresenter?.buildViewModel(mViewModel)
    }

    /**
     * 绑定生命周期
     */
    abstract fun attachView()

    /**
     * 解绑
     */
    fun detachView() {
        mPresenter?.detachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        detachView()
    }

    override fun showLoading() {

    }

    override fun dismissLoading() {
    }

    override fun showEntry() {
    }

    override fun showToast(isSuccess: Boolean, msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}