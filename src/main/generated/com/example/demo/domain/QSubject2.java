package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubject2 is a Querydsl query type for Subject2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubject2 extends EntityPathBase<Subject2> {

    private static final long serialVersionUID = -1137098794L;

    public static final QSubject2 subject2 = new QSubject2("subject2");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Student2, QStudent2> students = this.<Student2, QStudent2>createList("students", Student2.class, QStudent2.class, PathInits.DIRECT2);

    public QSubject2(String variable) {
        super(Subject2.class, forVariable(variable));
    }

    public QSubject2(Path<? extends Subject2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubject2(PathMetadata metadata) {
        super(Subject2.class, metadata);
    }

}

