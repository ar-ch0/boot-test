package com.example.demo.slave.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserSub is a Querydsl query type for UserSub
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserSub extends EntityPathBase<UserSub> {

    private static final long serialVersionUID = 927986332L;

    public static final QUserSub userSub = new QUserSub("userSub");

    public final NumberPath<Long> areaNo = createNumber("areaNo", Long.class);

    public final NumberPath<Long> deptNo = createNumber("deptNo", Long.class);

    public final NumberPath<Long> resign = createNumber("resign", Long.class);

    public final StringPath resignCause = createString("resignCause");

    public final NumberPath<Long> seqno = createNumber("seqno", Long.class);

    public final StringPath userId = createString("userId");

    public QUserSub(String variable) {
        super(UserSub.class, forVariable(variable));
    }

    public QUserSub(Path<? extends UserSub> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserSub(PathMetadata metadata) {
        super(UserSub.class, metadata);
    }

}

