# --- !Ups

create table fight (
  id                        bigint not null,
  side_a                    text,
  side_b                    text,
  constraint pk_fight primary key (id))
;

create sequence fight_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists fight;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists fight_seq;

