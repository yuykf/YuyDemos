package com.yuy.rxjavademo.bean;

import android.util.Log;

/**
 * from : yuy
 * Date : 2019/12/5
 * Description : 创建服务器返回的类 // 根据返回数据的格式和数据解析方式（Json、XML等）定义
 * VersionYM :
 */
public class Translation {
    /**
     * {
     *     "status":1,
     *     "content":{
     *         "from":"zh-CN",
     *         "to":"en-US",
     *         "out":"android",
     *         "vendor":"ciba",
     *         "err_no":0
     *     }
     * }
     */

    private int status;

    private content content;
    private static class content {
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int errNo;
    }


    //定义 输出返回数据 的方法
    //定义 输出返回数据 的方法
    public void show() {
        Log.d("RxJava", content.out );
    }

}
