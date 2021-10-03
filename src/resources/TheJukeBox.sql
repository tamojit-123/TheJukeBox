create database TheJukeBox;

use TheJukeBox;

create table SongTable
(
    SongId       int primary key auto_increment,
    SongName     varchar(255) not null,
    SongDuration time         not null,
    AlbumName    varchar(255) not null,
    ArtistName   varchar(255) not null,
    Genre        varchar(255) not null
) auto_increment 1;

drop table SongTable;

insert into SongTable (SongName, SongDuration, AlbumName, ArtistName, Genre)
values ('Hit this hard', '00:04:09', 'Stoney', 'Post Malone', 'Hip Hop'),
       ('Liggi', '00:03:02', 'Dev', 'Ritviz', 'Hip Hop'),
       ('Sage', '00:04:09', 'Sage', 'Ritviz', 'Hip Hop'),
       ('Mirchi', '00:03:13', 'Mirchi', 'DIVINE', 'Hip Hop'),
       ('Lean On', '00:02:57', 'Lean On', 'DJ Sanke', 'Hip Hop'),
       ('HOLIDAY', '00:04:28', 'INDUSTRY BABY', 'Lil Nas X', 'Pop'),
       ('Old Town Road', '00:05:08', '7 EP', 'Lil Nas X', 'Pop'),
       ('Panini', '00:01:55', '7 EP', 'Lil Nas X', 'Pop'),
       ('Beautiful Mistakes', '00:03:47', 'Beautiful Mistakes', 'Maroon 5', 'Pop'),
       ('Thunder', '00:03:07', 'Evolve', 'Imagine Dragons', 'Electronic'),
       ('STAY', '00:02:21', 'STAY', 'JUstine Bieber', 'Pop'),
       ('Flight', '00:05:27', 'Man of Steel', 'Hans Zimmer', 'Soundtrack'),
       ('I have So many Questions', '00:03:47', 'Man of Steel', 'Hans Zimmer', 'Soundtrack'),
       ('Ignition', '00:01:19', 'Man of Steel', 'Hans Zimmer', 'Soundtrack'),
       ('You die or I die', '00:03:13', 'Man of Steel', 'Hans Zimmer', 'Soundtrack'),
       ('Tornedo', '00:02:53', 'Man of Steel', 'Hans Zimmer', 'Soundtrack'),
       ('Run It', '00:02:43', 'Run It', 'DJ Sanke', 'Electronic'),
       ('Red Right Hand', '00:02:51', 'Peaky Blinders', 'PJ harvey', 'Rock'),
       ('Something In the Way', '00:03:52', 'Nevermind', 'Nirvana', 'Rock'),
       ('In the End', '00:04:09', 'Linkin Park', 'Linkin Park', 'Rock'),
       ('Superhero In My Sleep', '00:03:06', 'Superhero In My Sleep', 'Natan Chaim', 'Electronic'),
       ('Rise', '00:03:04', 'Rise', 'Jnathyn', 'Electronic'),
       ('Love Me Better', '00:02:53', 'Love', 'Vizzen', 'Romance'),
       ('Donot Bother', '00:03:04', 'Love', 'Emily J', 'Romance');

select *
from SongTable;

create table PodCast
(
    podCastId       int primary key auto_increment,
    podCastName     varchar(255) not null,
    podCastDuration time         not null,
    publishedDate   date         not null,
    podCastAlbum    varchar(255) not null,
    podCastHost     varchar(255) not null,
    Topic           varchar(255) not null
) auto_increment 101;

drop table PodCast;
desc PodCast;

insert into PodCast (podCastName, podCastDuration, publishedDate, podCastAlbum, podCastHost, Topic)
values ('TED Radio Health', '00:51:09', '2021-10-01', 'TED Radio Hour', 'Hui-wen Sato', 'Heartache'),
       ('TED Radio Dailys', '00:55:00', '2020-11-02', 'Ted Radio Story', 'Alvin Irby', 'School Of Life'),
       ('TED Talks', '00:24:29', '2021-09-22', 'TED Talk Science', 'Jaspreet Bindra', 'Blockchain'),
       ('Wan Show', '01:04:09', '2021-10-25', 'Wan', 'Linus Sabastian', 'Microsft'),
       ('Wan Show', '01:55:00', '2021-05-12', 'Wan', 'Linus Sabastian', 'PC build'),
       ('Sunday Suspance', '02:24:24', '2020-11-22', 'Sherlock Holmes', 'Jeremy Brett',
        'The Hound of the Baskervilles'),
       ('Sunday Suspance', '01:04:09', '2021-04-15', 'Sherlock Holmes', 'Jeremy Brett', 'A Study in Scarlet'),
       ('TED Talks', '00:47:30', '2021-10-24', 'TED Talk Science', 'Chris Bailey', 'How to Get Your Brain to Focus'),
       ('Harvard Podcast', '00:24:00', '2021-11-05', 'Nature', 'Mick Ross', 'subpoena'),
       ('Harvard Podcast', '00:35:00', '2021-11-07', 'Nature', 'Harvey spectre', 'Harvard Law');

select *
from PodCast;