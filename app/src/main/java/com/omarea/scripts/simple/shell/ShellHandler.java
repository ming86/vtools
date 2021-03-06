package com.omarea.scripts.simple.shell;

import android.os.Handler;
import android.widget.TextView;

/**
 * Created by Hello on 2018/04/01.
 */

public abstract class ShellHandler extends Handler {
    /**
     * 处理启动信息
     */
    static int EVENT_START = 0;

    /**
     * 命令行输出内容
     */
    static int EVENT_REDE = 2;

    /**
     * 命令行错误输出
     */
    static int EVENT_READ_ERROR = 4;

    /**
     * 脚本写入日志
     */
    static int EVENT_WRITE = 6;

    /**
     * 处理Exitvalue
     */
    static int EVENT_EXIT = -2;

    TextView textView;
}
