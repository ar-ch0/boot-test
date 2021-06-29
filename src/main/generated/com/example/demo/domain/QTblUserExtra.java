package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTblUserExtra is a Querydsl query type for TblUserExtra
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTblUserExtra extends EntityPathBase<TblUserExtra> {

    private static final long serialVersionUID = -314942409L;

    public static final QTblUserExtra tblUserExtra = new QTblUserExtra("tblUserExtra");

    public final StringPath phoneNum = createString("phoneNum");

    public final NumberPath<Integer> userNo = createNumber("userNo", Integer.class);

    public QTblUserExtra(String variable) {
        super(TblUserExtra.class, forVariable(variable));
    }

    public QTblUserExtra(Path<? extends TblUserExtra> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTblUserExtra(PathMetadata metadata) {
        super(TblUserExtra.class, metadata);
    }

}

