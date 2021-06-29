package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTblUser is a Querydsl query type for TblUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTblUser extends EntityPathBase<TblUser> {

    private static final long serialVersionUID = 176944985L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTblUser tblUser = new QTblUser("tblUser");

    public final QTblUserExtra userExtra;

    public final StringPath userName = createString("userName");

    public final NumberPath<Integer> userNo = createNumber("userNo", Integer.class);

    public QTblUser(String variable) {
        this(TblUser.class, forVariable(variable), INITS);
    }

    public QTblUser(Path<? extends TblUser> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTblUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTblUser(PathMetadata metadata, PathInits inits) {
        this(TblUser.class, metadata, inits);
    }

    public QTblUser(Class<? extends TblUser> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userExtra = inits.isInitialized("userExtra") ? new QTblUserExtra(forProperty("userExtra")) : null;
    }

}

