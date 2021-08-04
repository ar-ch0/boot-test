package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QParent2 is a Querydsl query type for Parent2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParent2 extends EntityPathBase<Parent2> {

    private static final long serialVersionUID = 899281784L;

    public static final QParent2 parent2 = new QParent2("parent2");

    public final ListPath<Child2, QChild2> childList = this.<Child2, QChild2>createList("childList", Child2.class, QChild2.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QParent2(String variable) {
        super(Parent2.class, forVariable(variable));
    }

    public QParent2(Path<? extends Parent2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParent2(PathMetadata metadata) {
        super(Parent2.class, metadata);
    }

}

