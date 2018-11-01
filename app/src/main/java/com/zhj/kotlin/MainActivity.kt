package com.zhj.kotlin

import com.zhj.kotlin.base.BaseActivity
import com.zhj.kotlin.mvp.MainContract
import com.zhj.kotlin.mvp.MainPresenter
import com.zhj.kotlin.mvp.MainViewModel
import com.zhj.kotlin.ui.HomeFragment

/**
 * 主页
 */
class MainActivity : BaseActivity<MainPresenter, MainViewModel>(), MainContract.View {

    override fun attachView() {
        mPresenter?.attachView(this)
    }


    override fun testSuccess() {
        showToast(false, "嘿嘿嘿")
    }


    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment, HomeFragment())
                .commit()
    }

    override fun initData() {
        mPresenter?.test()
    }


}
