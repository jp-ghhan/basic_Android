Android  JetPackProject
Edited han.gilhwan

■Originalからの修正内容
①コメント追加
②JavaStyle→KotlinStyleへ更新
③ソースのシンプル化

■Androidの基礎のサンプルソソース（Navigation機能を利用）

事前準備：Android端末

環境設定：
1. Android studioをインストールをする
https://developer.android.com/studio?hl=ja

2. Android studioを起動し、
「File」>「New」>「Project From Version Control」> 「git」を選択する。

3. URLに「https://github.com/jp-ghhan/basic_Android.git」を入力して「Clone」を押下する

4. AndroidStduioの「▶」のアイコンを押下してBuildをします。

■ソース分析　※細かい部分はコメントを参照
１．左上にあるExploreで   「app」>「res」>「navigation.xml」 を選択します。
２．navigation.xmlのWindow右上にあるDesignアイコンを探して押下します。
３．矢印を含めた画面遷移図が表示されます。
４．左上にあるExploreで「java」>「com.example.android.navigationsampe」>「titleScreen」を選択します。
５．override fun onCreateView　→Viewを生成
６．R.layout.fragment_title_screen　→ViewのレイアウトFile（Ctrl もしくはCommandを押しながらクリックする）レイアウト修正を好みでやってみましょ
７．override fun onViewCreated　→Viewの生成が終わったら
８．play_btn　→　レイアウトFileで定義したボタン
９．setOnClickListener　→クリックイベントを追加
10．Navigation.findNavController(view)　NavigationのInstance
11．navigate(ｘｘ)画面遷移のMethod
12．R.id.action_title_screen_to_in_game　3．の矢印のID、「title_screen」→「in_game」の画面遷移を意味する

基本的に他のViewも同じルールで作成されているので、色々値を修正しながら確認しましょ。


Navigation Guide
https://developer.android.com/guide/navigation/navigation-getting-started

Original Source
https://github.com/android/architecture-components-samples
