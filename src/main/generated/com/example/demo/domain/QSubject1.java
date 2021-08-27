package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSubject1 is a Querydsl query type for Subject1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubject1 extends EntityPathBase<Subject1> {

    private static final long serialVersionUID = -1137098795L;

    public static final QSubject1 subject1 = new QSubject1("subject1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QSubject1(String variable) {
        super(Subject1.class, forVariable(variable));
    }

    public QSubject1(Path<? extends Subject1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubject1(PathMetadata metadata) {
        super(Subject1.class, metadata);
    }

}

