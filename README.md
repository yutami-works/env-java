# env-java

Javaの環境構築手順

## 環境構築手順

### jdkのインストール
以下が無難

https://adoptium.net/

### インストール確認

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

## コンパイル方法

### ソースコード（.javaファイル）のコンパイル
javacコマンドを実行すると.classファイルが生成される。
```
$ javac HelloWorld.java
```

### .classファイルの実行
クラス名だけで良い
```
$ java HelloWorld
```