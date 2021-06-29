package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTblPhone is a Querydsl query type for TblPhone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTblPhone extends EntityPathBase<TblPhone> {

    private static final long serialVersionUID = 1185391520L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTblPhone tblPhone = new QTblPhone("tblPhone");

    public final QTblMember member;

    public final StringPath no = createString("no");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public QTblPhone(String variable) {
        this(TblPhone.class, forVariable(variable), INITS);
    }

    public QTblPhone(Path<? extends TblPhone> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTblPhone(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTblPhone(PathMetadata metadata, PathInits inits) {
        this(TblPhone.class, metadata, inits);
    }

    public QTblPhone(Class<? extends TblPhone> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QTblMember(forProperty("member")) : null;
    }

}

