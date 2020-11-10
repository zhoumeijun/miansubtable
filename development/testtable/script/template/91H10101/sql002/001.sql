INSERT INTO bd_billtype (
        pk_billtypeid,
        accountclass,
        billcoderule,
        billstyle,
        billtypename,
        canextendtransaction,
        checkclassname,
        classname,
        comp,
        component,
        datafinderclz,
        def1,
        def2,
        def3,
        dr,
        emendenumclass,
        forwardbilltype,
        isaccount,
        isapprovebill,
        isbizflowbill,
        iseditableproperty,
        isenablebutton,
        isenabletranstypebcr,
        islightbill,
        islock,
        isrejectuneditableproperty,
        isroot,
        issupportmobile,
        istransaction,
        isworkflowcanautoapprove,
        ncbrcode,
        nodecode,
        parentbilltype,
        pk_billtypecode,
        pk_group,
        pk_org,
        referclassname,
        systemcode,
        transtype_class,
        ts,
        webnodecode,
        wherestring
)
VALUES
        (
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                NULL,
                '主子表',
                'Y',
                NULL,
                NULL,
                NULL,
                'test02',
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                NULL,
                'Y',
                'Y',
                'N',
                'N',
                'N',
                'N',
                'Y',
                NULL,
                NULL,
                'N',
                'Y',
                'N',
                'N',
                '~',
                '91H10101',
                '~',
                'NCMJ',
                '~',
                'GLOBLE00000000000000',
                NULL,
                'DEVELOPMENT',
                NULL,
                '2020-11-10 09:14:04',
                '~',
                NULL
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ8AA895B09078',
                11,
                '~',
                '2',
                NULL,
                'APPROVE',
                'N',
                'N',
                NULL,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );
go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ2918AD3485A3',
                30,
                '~',
                '3',
                NULL,
                'DELETE',
                'N',
                'N',
                NULL,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ9C6121509A5A',
                10,
                '~',
                '1',
                NULL,
                'SAVE',
                'N',
                'N',
                NULL,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_billaction (
        pk_billaction,
        action_type,
        actionnote,
        actionstyle,
        actionstyleremark,
        actiontype,
        constrictflag,
        controlflag,
        dr,
        finishflag,
        pk_billtype,
        pk_billtypeid,
        pushflag,
        showhint,
        ts
)
VALUES
        (
                '0001ZZZZ6838A13DCF0F',
                31,
                '~',
                '1',
                NULL,
                'SAVEBASE',
                'Y',
                'N',
                NULL,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO PUB_BILLACTION (
        PK_BILLACTION,
        ACTION_TYPE,
        ACTIONNOTE,
        ACTIONSTYLE,
        ACTIONSTYLEREMARK,
        ACTIONTYPE,
        CONSTRICTFLAG,
        CONTROLFLAG,
        DR,
        FINISHFLAG,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PUSHFLAG,
        SHOWHINT,
        TS
)
VALUES
        (
                '0001ZZZZE11FC293B7FE',
                12,
                '~',
                '3',
                NULL,
                'UNAPPROVE',
                'N',
                'N',
                NULL,
                'Y',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO PUB_BILLACTION (
        PK_BILLACTION,
        ACTION_TYPE,
        ACTIONNOTE,
        ACTIONSTYLE,
        ACTIONSTYLEREMARK,
        ACTIONTYPE,
        CONSTRICTFLAG,
        CONTROLFLAG,
        DR,
        FINISHFLAG,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PUSHFLAG,
        SHOWHINT,
        TS
)
VALUES
        (
                '0001ZZZZ363F5C4D8E11',
                13,
                '~',
                '3',
                NULL,
                'UNSAVEBILL',
                'N',
                'Y',
                NULL,
                'Y',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                NULL,
                '~',
                '2020-11-10 09:14:04'
        );


go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ22CC9BABE8F9',
                'SAVE',
                'N_NCMJ_SAVE',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ050FEA5A00A0',
                'APPROVE',
                'N_NCMJ_APPROVE',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ12979B010043',
                'UNSAVEBILL',
                'N_NCMJ_UNSAVEBILL',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZEAAAB670395F',
                'UNAPPROVE',
                'N_NCMJ_UNAPPROVE',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO pub_busiclass (
        pk_busiclass,
        actiontype,
        classname,
        dr,
        isbefore,
        pk_billtype,
        pk_billtypeid,
        pk_businesstype,
        pk_group,
        ts
)
VALUES
        (
                '0001ZZZZ23E313F4D425',
                'DELETE',
                'N_NCMJ_DELETE',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );

go

INSERT INTO PUB_BUSICLASS (
        PK_BUSICLASS,
        ACTIONTYPE,
        CLASSNAME,
        DR,
        ISBEFORE,
        PK_BILLTYPE,
        PK_BILLTYPEID,
        PK_BUSINESSTYPE,
        PK_GROUP,
        TS
)
VALUES
        (
                '0001ZZZZ6A7A39EABC61',
                'SAVEBASE',
                'N_NCMJ_SAVEBASE',
                0,
                'N',
                'NCMJ',
                '0001ZZZZA61A7A586EE8',
                '~',
                '~',
                '2020-11-10 09:14:04'
        );
go


insert into pub_workitemconfig (
        pk_workitemconfig,
        dr,
        item,
        itemindex,
        itemtype,
        pk_billtype,
        resourceid,
        ts,
        isdefault,
        ismp
)
values
(
        '0001ZZZZ32627F4B3C34',
        0,
        'NCMJT',
        null,
        null,
        '0001ZZZZA61A7A586EE8',
        null,
        '2020-11-10 09:14:04',
        'Y',
        'Y'
)
go