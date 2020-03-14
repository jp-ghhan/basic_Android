Android  JetPackProject
Edit han.gilhwan

■Originalからの修正?容
①コメント追加
②JavaStyle→KotlinStyleへ?更
③ソ?スのシンプル化

■Androidの基礎のサンプルソ?ス（Navigation機能を利用）

事前準備：Android端末

環境設定：
1. Android studioをインスト?ルをする
https://developer.android.com/studio?hl=ja

2. Android studioを起動し、
「File」>「New」>「Project From Version Control」> 「git」を選?する。

3. URLに「https://github.com/jp-ghhan/basic_Android.git」を入力して「Clone」を押下する

4. AndroidStduioの「▶」のアイコンを押下してBuildをします。

■ソ?ス分析　※細かい部分はコメントを?照
１．左上にあるExploreで   「app」>「res」>「navigation.xml」 を選?します。
２．navigation.xmlのWindow右上にあるDesignアイコンを探して押下します。
３．矢印を含めた?面遷移?が表示されます。
４．左上にあるExploreに?って「java」>「com.example.android.navigationsampe」>「titleScreen」を選?します。
５．override fun onCreateView　→Viewを生成
６．R.layout.fragment_title_screen　→ViewのレイアウトFile（Ctrl もしくはCommandを押しながらクリックする）レイアウト修正を好みでやってみましょ
７．override fun onViewCreated　→Viewの生成が終わったら
８．play_btn　→　レイアウトFileで定義したボタン
９．setOnClickListener　→クリックイベントを追加
10．Navigation.findNavController(view)　NavigationのInstance
11．navigate(ｘｘ)?面遷移のMethod
12．R.id.action_title_screen_to_in_game　3．の矢印のID、「title_screen」→「in_game」の?面遷移を意味する

基本的に他のViewも同じル?ルで作成されているので、色?値を修正しながら確認しましょ。


Navigation Guide
https://developer.android.com/guide/navigation/navigation-getting-started

Original Source
https://github.com/android/architecture-components-samples
