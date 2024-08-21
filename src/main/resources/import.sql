insert into myrelatedentity (id, fieldName) values (1, 'related field 1');
insert into myrelatedentity (id, fieldName) values (2, 'related field 2');
alter sequence myrelatedentity_seq restart with 3;

insert into myentity (id, field, foo, bar, related_entity_id) values(1, 'field-1', 'foo', 3, 1);
insert into myentity (id, field, foo, bar, related_entity_id) values(2, 'field-2', 'bar', 16, null);
insert into myentity (id, field, foo, bar, related_entity_id) values(3, null, 'baz', 8, 2);
alter sequence myentity_seq restart with 4;