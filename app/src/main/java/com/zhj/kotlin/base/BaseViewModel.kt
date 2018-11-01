package com.zhj.kotlin.base

import android.app.Application
import android.arch.lifecycle.AndroidViewModel


/**
 * 介绍: (这里用一句话描述这个类的作用)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/31.
 */
open class BaseViewModel(val app: Application) : AndroidViewModel(app)