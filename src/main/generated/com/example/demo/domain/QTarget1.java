package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTarget1 is a Querydsl query type for Target1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTarget1 extends EntityPathBase<Target1> {

    private static final long serialVersionUID = 154380144L;

    public static final QTarget1 target1 = new QTarget1("target1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QTarget1(String variable) {
        super(Target1.class, forVariable(variable));
    }

    public QTarget1(Path<? extends Target1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTarget1(PathMetadata metadata) {
        super(Target1.class, metadata);
    }

}

