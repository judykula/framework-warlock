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
 *     继承此策略，id生成策略是"自增"
 * </p>
 * <p>
 *     如果你想自己定义ID生成策略，继承{@link AbstractEntity}【不建议】
 *     如果你想自己指定赋值ID，继承{@link AbstractSpecifyIdEntity}
 * </p>
 *
 * @author Jiang Wanyu
 * @version 1.0
 * @date 2024/2/2
 */
@Setter
@Getter
@SuppressWarnings("unused")
@MappedSuperclass
public class AbstractAutoIncIdEntity extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
