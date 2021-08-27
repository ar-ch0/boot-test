package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudent1 is a Querydsl query type for Student1
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudent1 extends EntityPathBase<Student1> {

    private static final long serialVersionUID = -1486179162L;

    public static final QStudent1 student1 = new QStudent1("student1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Subject1, QSubject1> subjects = this.<Subject1, QSubject1>createList("subjects", Subject1.class, QSubject1.class, PathInits.DIRECT2);

    public QStudent1(String variable) {
        super(Student1.class, forVariable(variable));
    }

    public QStudent1(Path<? extends Student1> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudent1(PathMetadata metadata) {
        super(Student1.class, metadata);
    }

}

