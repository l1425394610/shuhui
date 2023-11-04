create table if not exists shuhui.sys_dept
(
    id   int          not null
        primary key,
    name varchar(255) null
);

create table if not exists shuhui.sys_dict_data
(
    id   int          null,
    type int          null comment '字典类型',
    text varchar(255) null comment '名称',
    code int          null comment '编码'
)
    comment '字典数据表';

create table if not exists shuhui.sys_dict_type
(
    id          int auto_increment comment 'id'
        primary key,
    name        varchar(255) not null comment '字典名称',
    code        varchar(255) not null comment '编码',
    sort_code   int          null comment '排序码',
    description varchar(255) null comment '描述',
    status      int          null comment '状态（1：正常，2：停用）',
    create_time datetime     null comment '创建时间',
    create_user datetime     null comment '创建人',
    update_time datetime     null comment '修改时间',
    update_user datetime     null comment '修改人'
)
    comment '字典类型表';

create table if not exists shuhui.sys_menu
(
    id     int          not null
        primary key,
    router varchar(255) null
);

create table if not exists shuhui.sys_role
(
    id   int          not null
        primary key,
    name varchar(255) null
);

create table if not exists shuhui.sys_user
(
    id          int auto_increment comment 'id'
        primary key,
    account     varchar(255) null comment '账号',
    password    varchar(255) null comment '密码',
    name        varchar(255) null comment '姓名',
    avatar      varchar(255) null comment '头像',
    age         int          null comment '年龄',
    birth       datetime     null comment '出生日期',
    create_time datetime     null comment '创建时间',
    dept_id     int          null comment '部门id'
);
