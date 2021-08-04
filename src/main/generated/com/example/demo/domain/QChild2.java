package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChild2 is a Querydsl query type for Child2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChild2 extends EntityPathBase<Child2> {

    private static final long serialVersionUID = 1602695654L;

    public static final QChild2 child2 = new QChild2("child2");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QChild2(String variable) {
        super(Child2.class, forVariable(variable));
    }

    public QChild2(Path<? extends Child2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChild2(PathMetadata metadata) {
        super(Child2.class, metadata);
    }

}

