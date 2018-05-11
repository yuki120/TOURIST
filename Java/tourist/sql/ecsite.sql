set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) not null unique,
	login_pass varchar(16) not null,
	name varchar (16) not null,
	name_kana varchar (32) not null,
	sex varchar (16) not null,
	email varchar (50) not null,
	tel_num varchar (16) not null,
	postal_code varchar (16) not null,
	address1 varchar (50) not null,
	address2 varchar (16),
	insert_date datetime,
	updated_date datetime
);

drop table if exists product_info_transaction;

create table product_info_transaction(
	id int not null primary key auto_increment,
	category_id int not null,
	product_name varchar (32) not null,
	product_price int not null,
	product_stock int not null,
	product_description varchar (255) not null,
	image_file_path varchar (255) not null,
	insert_date datetime,
	update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	update_date datetime
);


INSERT INTO login_user_transaction(login_id, login_pass, name, name_kana, sex, email, tel_num, postal_code, address1, address2) VALUES ("taro", "taro123", "山田太郎", "やまだたろう", "man", "taro@gmail.com", "090-0000-0000", "123-1234", "東京都西東京市5-16", "サザンカ101");

INSERT INTO product_info_transaction(category_id, product_name, product_price, product_stock, product_description, image_file_path)
VALUES(1, "パリ8日間の旅", 269000, 10, "オプション満載の大人気プラン！", "./images/paris.jpg"),
(1, "バルセロナ8日間の旅", 220000, 10, "サグラダ・ファミリアの入場券込み！", "./images/barcelona.jpg"),
(1, "ロンドン6日間", 214000, 10, "日本人ガイドと湖水地方を巡り！", "./images/london.jpg"),
(2, "グアム4日間の旅", 150000, 10, "選べるマリンスポーツ付き！", "./images/guam.jpg"),
(2, "ハワイ5日間の旅", 180000, 10, "完全フリープラン！海が見えるお部屋！", "./images/hawaii.jpg"),
(2, "プーケット5日間の旅", 70000, 10, "島内観光ツアー付き！", "./images/phucket.jpg"),
(2, "セブ5日間の旅", 100000, 10, "デラックスホテル滞在プラン！", "./images/sebu.jpg"),
(2, "バリ島5日間の旅", 80000, 10, "マッサージ無料券、プレゼント！", "./images/bali.jpg"),
(3, "ソウル3日間の旅", 30000, 10, "韓流ドラマ聖地巡りツアー付き！", "./images/soul.jpg"),
(3, "台北3日間の旅", 35000, 10, "千と千尋の舞台九份への観光プラン付き！", "./images/taipei.jpg"),
(4, "ロサンゼルス5日間の旅", 210000, 10, "映画の本場！ハリウッドを巡る！", "./images/losangels.jpg"),
(4, "ニューヨーク6日間の旅", 350000, 10, "本場ブロードウェイミュージカル観賞券付き！", "./images/newyork.jpg"),
(5, "ケアンズ5日間の旅", 130000, 10, "グレートバリアリーフが楽しめる！", "./images/keans.jpg"),
(5, "ゴールドコースト5日間の旅", 120000, 10, "世界遺産の熱帯雨林を巡る！", "./images/goldcoast.jpg"),
(5, "メルボルン6日間の旅", 140000, 10, "英国風のオシャレな街を散策！", "./images/melbourn.jpg");