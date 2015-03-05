# spring-boot-sample

Spring Bootを試してみた際のサンプル。

## 起動

```
mvn spring-boot:run

```

## 使い方

下記にアクセスで、template htmlをレンダリング。

src/main/java/com/techscore/spring_boot_sample/hello.html

```
http://localhost:8080
```

下記にアクセスすることで監視情報取得。

```
http://localhost:8080/beans

```

sshで接続。パスワードは起動時に決定されログに出力されている。

```
ssh -p 2000 user@localhost

metrics

```

## 参考

- [Spring Boot 入門](http://www.techscore.com/blog/2014/05/01/spring-boot-introduction/)
- [Spring BootによるWebアプリお手軽構築](http://acro-engineer.hatenablog.com/entry/2014/06/03/120128)