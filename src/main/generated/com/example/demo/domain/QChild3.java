package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChild3 is a Querydsl query type for Child3
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChild3 extends EntityPathBase<Child3> {

    private static final long serialVersionUID = 1602695655L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChild3 child3 = new QChild3("child3");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QParent3 parent;

    public QChild3(String variable) {
        this(Child3.class, forVariable(variable), INITS);
    }

    public QChild3(Path<? extends Child3> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChild3(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChild3(PathMetadata metadata, PathInits inits) {
        this(Child3.class, metadata, inits);
    }

    public QChild3(Class<? extends Child3> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QParent3(forProperty("parent")) : null;
    }

}

