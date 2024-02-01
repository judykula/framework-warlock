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

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * <p>
 *     继承此策略，保存数据时需要自己设置ID。
 *
 *     代表在你为{@code entity}赋值的时候，需要为"id"字段赋值
 * </p>
 * <p>
 *     如果你想自己定义ID生成策略，继承{@link AbstractEntity}
 *     如果你想使用统一分布式ID发号器，继承{@link AbstractDistributedIdEntity}
 * </p>
 *
 * @see AbstractEntity
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/1/30
 */
@Data
@SuppressWarnings("unused")
@MappedSuperclass
public abstract class AbstractSpecifyIdEntity extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
