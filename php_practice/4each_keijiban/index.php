<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>4eachblog 掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
 
    <body>
    <?php
        mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
        $stmt = $pdo->query("select * from 4each_keijiban");
    ?>      
        
    <div class="main-container">
        <header>
                <div class="logo">
                    <img src="4eachblog_logo.jpg">
                </div>
                <ul>
                    <li>トップ</li>                      
                    <li>プロフィール</li>
                    <li>4eachについて</li>
                    <li>登録フォーム</li>
                    <li>問い合わせ</li>
                    <li>その他</li>
                </ul>               
        </header>
        
        <main>
                <div class="main-box">
                    <div class="left">
                        <h2>プログラミングに役立つ掲示板</h2>
                        <form method="post" action="insert.php">
                            <div class="input-form">
                                <h3>入力フォーム</h3><br>
                                <label>ハンドルネーム</label><br>
                                <input type="text" name="handlename" size="40"><br><br>
                                <label>タイトル</label><br>
                                <input type="text" name="title" size="40"><br><br>
                                <label>コメント</label><br>
                                <textarea name="comments" rows="8" cols="50"></textarea><br><br>
                                <input class="btn" type="submit" value="送信する">
                            </div>
                        </form>
                        
                        <?php
                        while ($row = $stmt->fetch()){
                            echo "<div class='kiji'>";
                                echo "<h3>".$row['title']."</h3>";
                                echo "<p>".$row['comments']."</p>";
                                echo "<p>posted by".$row['handlename']."</p>";
                            echo "</div>";
                        }
                        ?>
                    </div>
                
                    <dev class="right">
                    <h3>人気の記事</h3>
                    <p>PHP オススメ本</p>
                    <p>PHP MyAdminの使い方</p>
                    <p>今人気のエディタ Top5</p>
                    <p>HTMLの基礎</p>    
                    <h3>オススメリンク</h3>
                    <p>インターノウス株式会社</p>
                    <p>XAMPPのダウンロード</p>
                    <p>Eclipseのダウンロード</p>
                    <p>Bracketsのダウンロード</p>    
                    <h3>カテゴリ</h3>
                    <p>HTML</p>
                    <p>PHP</p>
                    <p>MySQL</p>
                    <p>JavaScript</p>    
                    </dev>
              
                </div>                
            </main>
        
            <footer>
            <!--"&copy;"は(c)マークを出せる-->
            copyright &copy; internous | 4each blog is the one which provides A to Z about programming.
            </footer>
            
    </div>
    </body>
</html>