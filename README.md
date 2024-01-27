# env-java

Javaの環境構築と基本文法について。

# 環境構築手順

## 1. jdkのインストール
以下が無難

https://adoptium.net/

## 2. パスを通す
Windowsの場合、システム環境変数を開き、「Path」に以下を追加。
```
C:\Program Files\Eclipse Adoptium\jdk-21.0.1.12-hotspot\bin
```

## 3. インストール確認

```
$ java -version
openjdk version "21.0.1" 2023-10-17 LTS
OpenJDK Runtime Environment Temurin-21.0.1+12 (build 21.0.1+12-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.1+12 (build 21.0.1+12-LTS, mixed mode, sharing)
```

```
$ javac -version
javac 21.0.1
```

# コンパイル方法

### ソースコード（.javaファイル）のコンパイル
javacコマンドを実行すると.classファイルが生成される。
```
$ javac HelloWorld.java
```

# プログラムの実行
.classファイルのあるフォルダで以下のようにファイル名のみ指定して実行する。
```
$ java HelloWorld
```

# 対話型プログラミング実行
JShellを使えば対話型にコードの実行ができる。

## 開始
```
$ jshell
```

## 終了
```
jshell> /exit
```