# 🚀 VoltDB Docker Ödevi – VOLTDB-EX-02

## 📌 Ödev Tanımı

Bu ödevde amaç, Docker üzerinde VoltDB (Community Edition) çalıştırarak hem veritabanı konteyner teknolojilerine aşina olmak hem de bulut ortamında dağıtık sistem kurulumlarının temelini anlamaktır.

> **Görev:** VoltDB imajını Docker Hub üzerinden çekip yerel makinede veya AWS/GCP gibi bulut sunucularında çalıştırmak.

---

## 🛠️ Uygulama Adımları

1. Docker kurulu sistem üzerinde:
    - VoltDB imajı çekildi:
      ```bash
      docker pull full360/docker-voltdb-ce
      ```

2. VoltDB konteyneri başlatıldı:
    ```bash
    docker run -d --name voltdb-node -p 8080:8080 -p 21212:21212 full360/docker-voltdb-ce
    ```

3. VoltDB Web UI arayüzü başarılı şekilde `http://localhost:8080` adresinde çalıştırıldı.

4. (İsteğe bağlı) Bu yapı bulut ortamında (AWS EC2) da tekrarlandı.

---

## 🎯 Ödevin Bize Kattıkları

- ✅ **Docker kullanım pratiği** kazandırır.
- ✅ **Veritabanı konteynerleştirme** sürecine giriş sağlar.
- ✅ **VoltDB gibi yüksek performanslı veritabanlarının** kullanımına dair temel bilgi edinilir.
- ✅ **Bulut sistemlere bağlanma**, port yönlendirme ve güvenlik grubu ayarlama konularında deneyim kazandırır.
- ✅ Gerçek bir sistemin terminalden nasıl ayağa kaldırılacağını öğretir.
- ✅ Yazılım geliştirmede **altyapı hazırlığı ve konfigürasyon yönetimi** gibi önemli kavramlara farkındalık kazandırır.

---

## 🌐 Kaynaklar

- [VoltDB Community Docker Hub](https://hub.docker.com/r/full360/docker-voltdb-ce)
- [VoltDB Quick Start Guide](https://docs.voltdb.com/)

---

> 📌 Bu ödev, hem backend geliştiriciler hem de sistem altyapısı ile ilgilenen kişiler için güçlü bir başlangıçtır.
