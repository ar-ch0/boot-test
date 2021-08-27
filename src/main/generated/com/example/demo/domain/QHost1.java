package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHost1 is a Querydsl query type for Host1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHost1 extends EntityPathBase<Host1> {

    private static final long serialVersionUID = 1996198457L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHost1 host1 = new QHost1("host1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QTarget1 target;

    public QHost1(String variable) {
        this(Host1.class, forVariable(variable), INITS);
    }

    public QHost1(Path<? extends Host1> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHost1(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHost1(PathMetadata metadata, PathInits inits) {
        this(Host1.class, metadata, inits);
    }

    public QHost1(Class<? extends Host1> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.target = inits.isInitialized("target") ? new QTarget1(forProperty("target")) : null;
    }

}

