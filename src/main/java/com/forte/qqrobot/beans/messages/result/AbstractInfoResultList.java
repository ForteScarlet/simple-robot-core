package com.forte.qqrobot.beans.messages.result;

import java.util.Arrays;

/**
 * InfoResultList的抽象类
 * @see InfoResultList
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public abstract class AbstractInfoResultList<T extends ResultInner> extends AbstractInfoResult implements InfoResultList<T> {

    private T[] list;

    @Override
    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().replaceAll("Abstract", "") + "{" +
                "list=" + Arrays.toString(list) +
                "} " + super.toString();
    }
}
