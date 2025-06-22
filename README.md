# JUnitPractice

JUnit でテスト自動化の練習をするためのプロジェクトです。


## Eclipse からの使用方法

`File` メニューから `Import` を選び、インポート操作を行ってください。
`Git` から `Projects from Git` を選び、Clone URI として、このリポジトリの URL (`https://github.com/takashi-ishio/JUnitPractice`) を指定すると、
リポジトリのデータが PC にコピー（clone）されます。

Eclipse プロジェクトとしてのファイルが収録されているので、
デフォルト設定で Next を選んでいくと自動で JUnitPractice というプロジェクトがパッケージエクスプローラに出現するはずです。

プロジェクトのインポートを中断してしまった場合、clone 操作が完了していなければ、この手順を最初から行うことになります。
PC 側にデータが既にコピーされている場合は、インポートダイアログの `General` に分類されている
`Existing Projects into Workspace` を選んで、データがコピーされているディレクトリを選んでください
（Windows であれば、ユーザのデータが格納されているディレクトリに `git` というディレクトリがつくられています）。


## 動作確認

実行（Run）操作の Run Configurations から実行ダイアログを開き、
左側の構成リストから「JUnit」を選んで、「New launch configuration」を作成してください。
`Run all tests in the selected project, ...` というオプションを選び、
実行対象として `JUnitPractice` を選択すると、
`Run` によってこのプロジェクト内部の全テストが実行されるようになります。


## テストの作成

`test` フォルダにある `TriangleTest` クラスが最初の練習です。
`Triangle` クラスに定義されている `getType` メソッドのテストを記述してみましょう。

`getType` メソッドには、まだ部分的にしかメソッドの内容が記述されていませんので、
正しくテストが書かれていれば、まだ作っていない機能のテストは失敗するはずです。
テストの失敗を確認してから、実際に getType の中身も実装してみましょう。

