/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     BanList.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.beans.messages.result;

import com.forte.qqrobot.beans.messages.result.inner.BanInfo;

/**
 * 禁言列表
 * 注意，很多插件都不支持此api了
 * @author ForteScarlet <[emaIl]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface BanList extends InfoResultList<BanInfo> {
}
