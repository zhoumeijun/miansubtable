insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZad9e57c5619b','development','2020-11-10 09:14:04','~',0,0,0,null,'~','~',null,'~','~',1,null,'2020-11-10 09:14:04',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ3750b7b1d651','91H1_H','2020-11-10 09:14:04','~',0,0,20,null,'~','~','0001ZZZZad9e57c5619b','~','~',0,null,'2020-11-10 09:14:04',null);
go

insert into bd_userdefrule(pk_userdefrule,code,creationtime,creator,dataoriginflag,dr,itemcount,modifiedtime,modifier,name,parent_id,pk_group,pk_org,ruletype,showorder,ts,comp) values('0001ZZZZ5625cbb1c8f4','91H1_B','2020-11-10 09:14:04','~',0,0,10,null,'~','~','0001ZZZZad9e57c5619b','~','~',0,null,'2020-11-10 09:14:04',null);
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZ32a435b729c1',null,'2020-11-10 09:14:04','~',null,0,'2020-11-10 09:14:04','~','0001ZZZZ3750b7b1d651','1071b7b2-fb67-4a3c-922a-7fcb4b23ab26','2020-11-10 09:14:04','vdef')
go

insert into bd_userdefruleref(pk_userdefruleref,checkclass,creationtime,creator,dataoriginflag,dr,modifiedtime,modifier,pk_userdefrule,refclass,ts,prefix) values('0001ZZZZcf7569352fb5',null,'2020-11-10 09:14:04','~',null,0,null,'~','0001ZZZZ5625cbb1c8f4','3c61705c-3b9e-4e53-8cd9-f3ee7fcbfe43','2020-11-10 09:14:04','vbdef')
go

