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

import javax.persistence.MappedSuperclass;

/**
 * <p>
 *     继承此策略，保存数据时使用分布式ID发号器生成的ID。
 *
 *     代表在你为{@code entity}赋值的时候，无须关心"id"字段，这里会为你生成一个由id generator server分配的id
 * </p>
 * <p>
 *     如果你想自己定义ID生成策略，继承{@link AbstractEntity}
 *     如果你想自己指定ID，继承{@link AbstractSpecifyIdEntity}
 * </p>
 *
 * @see AbstractEntity
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/1/30
 */
@Getter
@SuppressWarnings("unused")
@MappedSuperclass
public abstract class AbstractDistributedIdEntity extends AbstractEntity{


}
