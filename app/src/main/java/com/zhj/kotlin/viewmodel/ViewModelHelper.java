package com.zhj.kotlin.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * 介绍: (ViewModelHelper)
 * 作者: zhahaijun
 * 邮箱: zhahaijun@bearead.cn
 * 时间: 2018/10/22.
 */

public class ViewModelHelper {

    /**
     * 返回对应的viewmodel
     * @param activity
     * @param modelClass
     * @param <T>
     * @return
     */
    public  static   <T extends ViewModel> T VMProviders(FragmentActivity activity, @NonNull Class modelClass) {
        if (null == activity || modelClass == null){
            return null;
        }
        return (T) ViewModelProviders.of(activity).get(modelClass);
    }

    /**
     * 返回对应的viewmodel
     * @param fragment
     * @param modelClass
     * @param <T>
     * @return
     */
    public  static   <T extends ViewModel> T VMProviders(Fragment fragment, @NonNull Class modelClass) {
        if (null == fragment || modelClass == null){
            return null;
        }
        return (T) ViewModelProviders.of(fragment).get(modelClass);
    }

}
