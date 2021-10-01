create database jukebox;
use jukebox;

create table songList(
songId int auto_increment primary key not null,
songName varchar(255) not null,
genre varchar(255) not null,
songDuration varchar(255) not null, 
albumName varchar(255) not null,
foreign key (albumName) references album(albumName)
);

create table album(
albumId int auto_increment primary key not null,
albumName varchar(255)
);

create table playList(
playListId int auto_increment primary key not null,
playListName varchar(255) not null
);