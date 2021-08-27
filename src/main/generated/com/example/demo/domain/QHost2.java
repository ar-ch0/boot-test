package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHost2 is a Querydsl query type for Host2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHost2 extends EntityPathBase<Host2> {

    private static final long serialVersionUID = 1996198458L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHost2 host2 = new QHost2("host2");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QTarget2 target;

    public QHost2(String variable) {
        this(Host2.class, forVariable(variable), INITS);
    }

    public QHost2(Path<? extends Host2> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHost2(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHost2(PathMetadata metadata, PathInits inits) {
        this(Host2.class, metadata, inits);
    }

    public QHost2(Class<? extends Host2> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.target = inits.isInitialized("target") ? new QTarget2(forProperty("target"), inits.get("target")) : null;
    }

}

