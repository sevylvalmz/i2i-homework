Tabii! İşte Selenium ile e-ticaret sitesine giriş otomasyonu ödevin için örnek, açıklayıcı ve profesyonel bir **README.md** dosyası içeriği.

---

# Ecommerce Login Automation - Selenium Java Ödevi

## Proje Hakkında

Bu proje, **Selenium WebDriver** kullanarak bir e-ticaret sitesine otomatik olarak giriş yapmayı sağlayan bir test otomasyon uygulamasıdır. Java dili ile geliştirilmiş ve web sayfasındaki kullanıcı adı, şifre alanlarına değer girip giriş butonuna tıklanması otomatikleştirilmiştir.

## Ödevin Amacı ve Kazanımları

* **Test otomasyonunun temellerini öğrenmek:** Selenium WebDriver ile web tarayıcısı otomasyonunu kavramak.
* **Web elementlerini tanımak ve etkileşim kurmak:** Sayfadaki input alanlarını ve butonları bulup işlem yapmak.
* **Java ile otomasyon programı geliştirmek:** Java programlama dilinde temel Selenium komutlarını kullanabilmek.
* **Gerçek senaryoları simüle etmek:** E-ticaret sitesine giriş gibi sık kullanılan kullanıcı işlemlerini otomatikleştirmek.
* **Test sonucu kontrolü yapmak:** Giriş işleminin başarılı olup olmadığını kontrol ederek test doğrulaması yapmak.

## Proje Yapısı

* **`pom.xml`**: Maven bağımlılıkları içerir, Selenium ve WebDriver Manager için gerekli kütüphaneler eklenmiştir.
* **`LoginTest.java`**: Otomasyonun ana sınıfı. Chrome tarayıcısını açar, verilen siteye gider, kullanıcı bilgilerini girer ve giriş yapar.
* **WebDriverManager** kullanılarak ChromeDriver otomatik indirilip, tarayıcı sürücüsü ayarlanır.

## Nasıl Çalıştırılır?

1. Java 11 veya üzeri JDK yüklü olmalıdır.
2. Maven proje olarak açılmalı ve bağımlılıklar indirilmelidir.
3. `LoginTest` sınıfı çalıştırıldığında Chrome tarayıcısı açılır, giriş otomatik yapılır ve sonuç konsola yazdırılır.

## Neden Öğreniyoruz?

Bu ödev sayesinde test otomasyonu ve Selenium kullanımına giriş yapılır. Günümüzde yazılım geliştirme süreçlerinde otomatik testler büyük önem taşır.
Özellikle web uygulamalarında kullanıcı işlemlerini tekrarlayan şekilde test etmek, manuel testlerin önüne geçer ve zamandan tasarruf sağlar.
Bu temel otomasyon bilgisi ileride daha kapsamlı test otomasyon projelerinde ve QA süreçlerinde kullanılabilir.

---

