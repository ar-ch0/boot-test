package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParent3 is a Querydsl query type for Parent3
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParent3 extends EntityPathBase<Parent3> {

    private static final long serialVersionUID = 899281785L;

    public static final QParent3 parent3 = new QParent3("parent3");

    public final ListPath<Child3, QChild3> childList = this.<Child3, QChild3>createList("childList", Child3.class, QChild3.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QParent3(String variable) {
        super(Parent3.class, forVariable(variable));
    }

    public QParent3(Path<? extends Parent3> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParent3(PathMetadata metadata) {
        super(Parent3.class, metadata);
    }

}

