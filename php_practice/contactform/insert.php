<?php
mb_internal_encoding("utf8");

$pdo = new PDO("mysql:dbname=lesson01;host=localhost","root","mysql");

$pdo->exec("insert into contactform(name,mail,age,comments)
values('".$_POST['name']."','".$_POST['mail']."','".$_POST['age']."','".$_POST['comments']."');");

?>


<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>お問合わせフォームを作る</title>
        <link rel="stylesheet" type="text/css" href="style2.css">
    </head>
    <body>
        <h1>お問合せフォーム</h1>
        <div class="confirm">
            <p>お問合せありがとうございました。
                <br>３営業日以内に担当者よりご連絡差し上げます。
            </p>
        </div>

        
    </body>
</html>
