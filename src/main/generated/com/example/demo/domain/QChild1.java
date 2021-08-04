package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChild1 is a Querydsl query type for Child1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChild1 extends EntityPathBase<Child1> {

    private static final long serialVersionUID = 1602695653L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChild1 child1 = new QChild1("child1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QParent1 parent;

    public QChild1(String variable) {
        this(Child1.class, forVariable(variable), INITS);
    }

    public QChild1(Path<? extends Child1> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChild1(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChild1(PathMetadata metadata, PathInits inits) {
        this(Child1.class, metadata, inits);
    }

    public QChild1(Class<? extends Child1> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QParent1(forProperty("parent")) : null;
    }

}

