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

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * <p>
 *     继承此策略，id生成策略是由"手动赋值"
 *
 *     代表在你为{@code entity}赋值的时候，需要为"id"字段赋值
 * </p>
 * <p>
 *     如果你想自己定义ID生成策略，继承{@link AbstractEntity}
 *     如果你想自己Id自增，继承{@link AbstractAutoIncIdEntity}
 * </p>
 *
 * @see AbstractEntity
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/1/30
 */
@Setter
@Getter
@SuppressWarnings("unused")
@MappedSuperclass
public abstract class AbstractSpecifyIdEntity extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
