package com.example.demo.slave.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDepartMentUser is a Querydsl query type for DepartMentUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDepartMentUser extends EntityPathBase<DepartMentUser> {

    private static final long serialVersionUID = 1849537622L;

    public static final QDepartMentUser departMentUser = new QDepartMentUser("departMentUser");

    public final NumberPath<Long> resign = createNumber("resign", Long.class);

    public final StringPath resignCause = createString("resignCause");

    public QDepartMentUser(String variable) {
        super(DepartMentUser.class, forVariable(variable));
    }

    public QDepartMentUser(Path<? extends DepartMentUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDepartMentUser(PathMetadata metadata) {
        super(DepartMentUser.class, metadata);
    }

}

