<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>学生情報一覧</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container">

    <!-- サイドバー -->
    <aside class="sidebar">

        <h2>CareerAdmin</h2>

        <ul>
            <li>トップ</li>
            <li class="active">学生情報</li>
            <li>企業管理</li>
            <li>就職活動管理</li>
        </ul>

        <button class="logout">
            ログアウト
        </button>

    </aside>


    <!-- メイン -->
    <main class="main">

        <div class="header">

            <h2>学生情報一覧</h2>

            <button class="addBtn">
                ＋ 学生を追加
            </button>

        </div>

        <div class="searchArea">

            <input type="text" placeholder="氏名・学籍番号で検索">

            <select>
                <option>全クラス</option>
            </select>

        </div>


        <table>

            <thead>

            <tr>
                <th>クラス</th>
                <th>出席番号</th>
                <th>学籍番号</th>
                <th>氏名</th>
                <th>読み仮名</th>
                <th>性別</th>
                <th>在籍</th>
                <th>辞退</th>
                <th>県内外</th>
                <th>志望1</th>
                <th>志望2</th>
                <th>志望3</th>
                <th></th>
            </tr>

            </thead>

            <tbody>

            <tr>
                <td>S3A1</td>
                <td>3501</td>
                <td>172101</td>
                <td>有田哲也</td>
                <td>ありた てつや</td>
                <td>男</td>
                <td><span class="green">在籍</span></td>
                <td>-</td>
                <td>県外</td>
                <td>PG</td>
                <td>SE</td>
                <td>-</td>
                <td><a href="#">編集</a></td>
            </tr>

            </tbody>

        </table>

    </main>

</div>

</body>
</html>