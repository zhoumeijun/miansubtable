insert into sm_appregister(pk_appregister,app_desc,apptype,code,creationtime,creator,dr,fun_property,funtype,height,help_name,image_src,iscauserusable,iscopypage,isenable,mdid,modifiedtime,modifier,mountid,name,orgtypecode,own_module,parent_id,pk_group,resid,source_app_code,target_path,ts,uselicense_load,width)
values('0001ZZZZZZ000091H101','',0,'91H101','2020-11-10 09:14:04','~',0,null,null,null,'',null,null,'N','Y','~',null,'~',null,'主子表',null,'91H1','91H1','~','',null,null,'2020-11-10 09:14:04',null,null);
go



insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZ2fb03d51084e',null,null,0,null,'91','development',null,'~','1004Z510000000000FFL',null,'2020-11-10 09:14:04');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZd48b4946f2c4',null,null,0,null,'91H1','development','91','~','1004Z510000000000FFL',null,'2020-11-10 09:14:04');
go

insert into sm_appmenuitem(pk_menuitem,appcode,appid,dr,menudes,menuitemcode,menuitemname,parentcode,pk_group,pk_menu,resid,ts)
values('0001ZZZZa14c0c28afba',null,null,0,null,'91H101','testtable','91H1','~','1004Z510000000000FFL',null,'2020-11-10 09:14:04');
go


