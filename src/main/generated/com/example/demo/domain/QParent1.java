package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QParent1 is a Querydsl query type for Parent1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParent1 extends EntityPathBase<Parent1> {

    private static final long serialVersionUID = 899281783L;

    public static final QParent1 parent1 = new QParent1("parent1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QParent1(String variable) {
        super(Parent1.class, forVariable(variable));
    }

    public QParent1(Path<? extends Parent1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParent1(PathMetadata metadata) {
        super(Parent1.class, metadata);
    }

}

