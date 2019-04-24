package com.forte.qqrobot.sender;

import java.util.Map;

/**
 * 提供方法以便汇总Set类型方法
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface SenderSet {

    /**
     * 设置类型接口汇总方法
     * @param params 参数键值对
     * @return 成功与否
     */
    boolean set(Map<String, String> params);


}