package com.zhj.kotlin.viewmodel

import java.lang.reflect.ParameterizedType

/**
 * 介绍: (类转换)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/15.
 */

object ClassHelper {


    /**
     * 获取对应泛型的实例
     *
     * @param object
     * @param i
     * @param <T>
     * @return
    </T> */
    fun <T> getNewInstance(`object`: Any?, i: Int): T? {
        if (`object` != null) {
            try {
                return ((`object`.javaClass
                        .genericSuperclass as ParameterizedType).actualTypeArguments[i] as Class<T>)
                        .newInstance()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: ClassCastException) {
                e.printStackTrace()
            }

        }
        return null
    }


    /**
     * 根据实现类泛型参数获取对于的class
     *
     * @param object
     * @param i
     * @param <T>
     * @return
    </T> */
    fun <T> getClass(`object`: Any?, i: Int): Class<*>? {
        if (`object` != null) {
            try {
                return (`object`.javaClass
                        .genericSuperclass as ParameterizedType).actualTypeArguments[i] as Class<T>
            } catch (e: Exception) {

            }

        }
        return null
    }
}
