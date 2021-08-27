package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTarget2 is a Querydsl query type for Target2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTarget2 extends EntityPathBase<Target2> {

    private static final long serialVersionUID = 154380145L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTarget2 target2 = new QTarget2("target2");

    public final QHost2 host;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QTarget2(String variable) {
        this(Target2.class, forVariable(variable), INITS);
    }

    public QTarget2(Path<? extends Target2> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTarget2(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTarget2(PathMetadata metadata, PathInits inits) {
        this(Target2.class, metadata, inits);
    }

    public QTarget2(Class<? extends Target2> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.host = inits.isInitialized("host") ? new QHost2(forProperty("host"), inits.get("host")) : null;
    }

}

