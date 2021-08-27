package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudent2 is a Querydsl query type for Student2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudent2 extends EntityPathBase<Student2> {

    private static final long serialVersionUID = -1486179161L;

    public static final QStudent2 student2 = new QStudent2("student2");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Subject2, QSubject2> subjects = this.<Subject2, QSubject2>createList("subjects", Subject2.class, QSubject2.class, PathInits.DIRECT2);

    public QStudent2(String variable) {
        super(Student2.class, forVariable(variable));
    }

    public QStudent2(Path<? extends Student2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStudent2(PathMetadata metadata) {
        super(Student2.class, metadata);
    }

}

