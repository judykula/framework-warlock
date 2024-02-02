/*
 * easy come, easy go.
 *
 * contact : syiae.jwy@gmail.com
 *
 * · · · · ||   ..     __       ___      ____  ®
 * · · · · ||  ||  || _ ||   ||    ||   ||      ||
 * · · · · ||  ||  \\_ ||_.||    ||   \\_  ||
 * · · _//                                       ||
 * · · · · · · · · · · · · · · · · · ·· ·    ___//
 */
package com.jwy.warlock.strategy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * <p>
 *     为jpa的entity设置父策略，统一基础字段，包含：<br/>
 *
 *     创建时间的时间戳: createTime <br/>
 *     以及修改时间的时间戳: updateTime <br/>
 * </p>
 * <p>
 *     这里没有设置主键生成策略，代表你可以自己根据需要设置主键生成策略，你可以阅读代码{@link GeneratedValue}来处理。<br/>
 *
 *     或者继承{@link AbstractSpecifyIdEntity}自己设置ID的值。<br/>
 *     或者继承{@link AbstractAutoIncIdEntity}实现ID自增。<br/>
 * </p>
 * <p>
 *      <i><u>！！不建议直接继承此类，除非必要以及经过讨论</u></i>
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/1/30
 */
@Setter
@Getter
@SuppressWarnings("unused")
@MappedSuperclass
public abstract class AbstractEntity{

    /**
     * 每张表添加默认"创建时间戳"，millisecond
     */
    @Column(updatable = false)
    private long createTime;
    /**
     * 每张表添加默认"修改时间戳"，millisecond
     */
    private long updateTime;

    @PrePersist
    protected void onCreate() {
        createTime = System.currentTimeMillis();
        updateTime = System.currentTimeMillis();
    }

    @PreUpdate
    protected void onUpdate() {
        updateTime = System.currentTimeMillis();
    }
}
