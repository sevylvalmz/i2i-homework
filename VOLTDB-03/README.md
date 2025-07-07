

# VoltDB Projesi

## Proje Hakkında
Bu proje, VoltDB veritabanı sistemi kullanılarak oluşturulan basit bir tablo ve bu tabloya veri ekleme işlemlerini kapsamaktadır. VoltDB, yüksek performanslı, dağıtık ve hafıza içi (in-memory) bir veritabanı olarak, gerçek zamanlı uygulamalar için tercih edilmektedir.

---

## VoltDB Nedir ve Neden Kullanıyoruz?

VoltDB, **yüksek hızda veri işleme ve düşük gecikme süresi** sunan, dağıtık mimariye sahip bir ilişkisel veritabanı sistemidir. Geleneksel veritabanlarından farklı olarak tüm verileri bellekte tutar, bu sayede hızlı sorgulamalar yapabilir.

### Kullanım Amaçları:
- Gerçek zamanlı veri analizi
- Yüksek performans gerektiren finansal ve telekomünikasyon uygulamaları
- Dağıtık yapıda ölçeklenebilir uygulamalar geliştirmek

---

## Projede Yapılanlar

- VoltDB Docker konteyneri üzerinde VoltDB çalıştırıldı.
- DBeaver aracılığıyla VoltDB'ye bağlanıldı.
- `mth3902` adında bir tablo oluşturuldu.
- Tablo üzerinde `partition` işlemi yapıldı.
- Tabloya örnek veriler (id, start_date_epoch, create_user) eklendi.
- Verilerin başarılı bir şekilde sorgulanması sağlandı.

---

## VoltDB Kullanmanın Avantajları

- **Yüksek Performans:** Verilerin tamamı RAM’de tutulduğu için çok hızlı erişim sağlar.
- **Dağıtık Mimari:** Ölçeklenebilir ve yüksek kullanılabilirlik sunar.
- **SQL Desteği:** Geleneksel SQL sorgularını destekler.
- **Kolay Entegrasyon:** DBeaver gibi araçlarla kolayca entegre edilir.

---

## Projeyi Çalıştırmak İçin

1. VoltDB Docker konteyneri başlatılır.
2. DBeaver üzerinde VoltDB driver kurulumu yapılır.
3. VoltDB’ye bağlanılır ve SQL scriptleri çalıştırılır.

---

