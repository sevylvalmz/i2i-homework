# ORACLEDB-EX-04: Java ile Oracle BOOK Tablosuna Veri Ekleme

## Proje Amacı

Bu proje, Java programlama dili kullanarak Oracle veritabanındaki `BOOK` tablosuna otomatik olarak rastgele 100 kayıt eklemeyi amaçlamaktadır.  

Ödev kapsamında aşağıdaki temel yetkinlikler hedeflenmiştir:

- Oracle veritabanına Java JDBC kullanarak bağlanabilmek.  
- Veritabanı tablolarını programatik olarak kontrol edip, gerekiyorsa oluşturabilmek.  
- Rastgele veri üretimi yaparak tabloya veri ekleme işlemini otomatikleştirmek.  
- SQL sorgularının ve PreparedStatement kullanımının pratiğini yapmak.

## Neden Önemli?

- Gerçek dünya uygulamalarında veritabanı işlemleri sıkça otomatikleştirilir.  
- JDBC, Java ile veritabanı arasındaki en temel bağlantı katmanıdır ve etkin kullanımı kritik önemdedir.  
- Veri tabanı bağlantısı, veri ekleme, güncelleme, silme gibi işlemler programatik olarak yapılabilmelidir.  
- Bu proje sayesinde temel veritabanı bağlantısı ve veri ekleme mantığı kavranır.

## Projede Neler Yapıldı?

- `BOOK` tablosunun varlığı kontrol edildi, yoksa oluşturuldu.  
- `NAME` ve `ISBN` alanları için rastgele değerler üretildi.  
- 100 adet kitap kaydı tabloya eklendi.  
- İşlem sırasında başarı ve hata mesajları konsola yazdırıldı.

## Kullanılan Teknolojiler

- Java 15+ (Text Blocks özelliği kullanıldı)  
- Oracle Database (XE veya başka sürüm)  
- JDBC (Java Database Connectivity)  
- IntelliJ IDEA (IDE tercihi)

## Çalıştırma Talimatları

1. Oracle veritabanınızın çalışır durumda olduğundan emin olun.  
2. `ojdbc8.jar` dosyasını projenize dahil edin.  
3. Bağlantı ayarlarını (`url`, `user`, `password`) kendi ortamınıza göre güncelleyin.  
4. Programı çalıştırın.  
5. Konsol çıktısını ve veritabanındaki kayıtları kontrol edin.

---

**Bu proje, veritabanı programlama ve JDBC kullanımında temel pratik yapmak için faydalı bir örnektir.**

