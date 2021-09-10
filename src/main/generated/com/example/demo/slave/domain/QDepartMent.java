package com.example.demo.slave.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDepartMent is a Querydsl query type for DepartMent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDepartMent extends EntityPathBase<DepartMent> {

    private static final long serialVersionUID = -1808907797L;

    public static final QDepartMent departMent = new QDepartMent("departMent");

    public final StringPath deptName = createString("deptName");

    public final NumberPath<Long> deptNo = createNumber("deptNo", Long.class);

    public final NumberPath<Long> seqno = createNumber("seqno", Long.class);

    public QDepartMent(String variable) {
        super(DepartMent.class, forVariable(variable));
    }

    public QDepartMent(Path<? extends DepartMent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDepartMent(PathMetadata metadata) {
        super(DepartMent.class, metadata);
    }

}

