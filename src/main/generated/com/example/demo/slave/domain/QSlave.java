package com.example.demo.slave.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSlave is a Querydsl query type for Slave
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSlave extends EntityPathBase<Slave> {

    private static final long serialVersionUID = -894947394L;

    public static final QSlave slave = new QSlave("slave");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QSlave(String variable) {
        super(Slave.class, forVariable(variable));
    }

    public QSlave(Path<? extends Slave> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSlave(PathMetadata metadata) {
        super(Slave.class, metadata);
    }

}

