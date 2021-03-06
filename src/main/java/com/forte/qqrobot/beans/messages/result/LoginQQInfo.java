/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     LoginQQInfo.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.beans.messages.result;

import com.forte.qqrobot.beans.messages.NicknameAble;
import com.forte.qqrobot.beans.messages.QQCodeAble;

/**
 * 登录的QQ的信息
 *
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface LoginQQInfo extends InfoResult, QQCodeAble, NicknameAble {

    /**
     * 昵称
     */
    String getName();

    @Override
    default String getNickname(){
        return getName();
    }

    /**
     * QQ号
     *
     * @see #getCode()
     */
    String getQQ();

    /**
     * 头像地址
     */
    default String getHeadUrl() {
        if (getCode() == null) {
            return null;
        } else {
            return "http://q.qlogo.cn/headimg_dl?dst_uin=" + getCode() + "&spec=640";
        }
    }

    @Override
    default String getQQCode() {
        return getQQ();
    }

    /**
     * 等级
     */
    Integer getLevel();

}
