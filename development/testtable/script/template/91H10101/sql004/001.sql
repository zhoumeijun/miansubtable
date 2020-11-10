
delete from pub_msgtemp where typecode = 'NCMJ';
go

insert into pub_msgtemp(pk_templet,dr,langcode,messagetitle,pk_org,pk_outtemplet,tempcode,tempdscrpt,tempname,textcontent,ts,typecode,attachdoctype,attachtype,attdeftype,pk_temptype) values('0001ZZZZ37eb791d3b52',0,'simpchn','@&m submitter.user_name@提交的主表待审批','GLOBLE00000000000000',null,'NCMJT','主表审批信息','~','<div class="divtext">
<span class="labeltext">财务组织:<span class="normaltext">@&m pk_org.name@</span></span>
</div>
<div class="divtext">
<span class="labeltext">单据编号:<span class="normaltext">@&m billno@</span></span>
</div>','2020-11-10 09:14:04','NCMJ',0,0,'~','0001ZZZZac3518e842b4');
go

delete from pub_msgtemp_type where tempcode = 'WF_development';
go
insert into pub_msgtemp_type(pk_temptype,dr,innercode,metaid,name,parentpk,tempcode,ts,comp) values('0001ZZZZa668fd615702',0,'DTUQC98Y','~','~','1004Z010000000005ALB','WF_development','2020-11-10 09:14:04',null);
go



