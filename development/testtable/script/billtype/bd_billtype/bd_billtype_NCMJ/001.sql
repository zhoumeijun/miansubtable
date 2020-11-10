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
                '0001ZZZZD2ED390A2089',
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
                '0001ZZZZ86628D6BC110',
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
                '0001ZZZZ842A52BE69C4',
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
                '0001ZZZZC692ED56D82E',
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
                '0001ZZZZ55B701D6A875',
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
                '0001ZZZZD050C08C0903',
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
                '0001ZZZZFD8606495362',
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
                '0001ZZZZDE238A52472A',
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
                '0001ZZZZA829CDA0FFCC',
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
                '0001ZZZZ67EAE414EDC1',
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
                '0001ZZZZ52876F9A12D6',
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
                '0001ZZZZ2409D58A3E9F',
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
        '0001ZZZZ5B0548B88A83',
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