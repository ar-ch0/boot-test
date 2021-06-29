package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTblMember is a Querydsl query type for TblMember
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTblMember extends EntityPathBase<TblMember> {

    private static final long serialVersionUID = -1996297560L;

    public static final QTblMember tblMember = new QTblMember("tblMember");

    public final StringPath name = createString("name");

    public final CollectionPath<TblPhone, QTblPhone> phone = this.<TblPhone, QTblPhone>createCollection("phone", TblPhone.class, QTblPhone.class, PathInits.DIRECT2);

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public QTblMember(String variable) {
        super(TblMember.class, forVariable(variable));
    }

    public QTblMember(Path<? extends TblMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTblMember(PathMetadata metadata) {
        super(TblMember.class, metadata);
    }

}

