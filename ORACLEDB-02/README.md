# ORACLEDB-EX-02

## 📚 Ödevin Amacı

Bu ödevin amacı, Oracle Database 21c Express Edition'ı Docker container içerisinde çalıştırarak kurulum, bağlantı ve temel SQL sorgularını uygulamalı olarak öğrenmektir. Öğrencinin Docker ve Oracle veritabanı yönetim sistemleri konusunda temel seviyede deneyim kazanması hedeflenmiştir.

---

## 🚀 Neler Yapıldı?

1. Oracle tarafından sağlanan `docker-images` deposu klonlandı.
2. `buildContainerImage.sh` betiği ile Oracle XE image'ı oluşturuldu.
3. `docker run` komutu ile container başlatıldı.
4. `sqlplus` CLI aracı kullanılarak veritabanına SYS yetkisi ile bağlanıldı.
5. `SELECT name FROM v$database;` sorgusu çalıştırılarak bağlantı doğrulandı.

---

## 🧠 Kazanımlar

- Docker üzerinde veritabanı container çalıştırma becerisi kazanıldı.
- Oracle Database mimarisi (SID, PDB, SYS/SYSTEM kullanıcıları) hakkında temel bilgi edinildi.
- SQLPlus kullanılarak Oracle veritabanı ile etkileşime girildi.
- GCP/AWS gibi bulut ortamlarına taşınabilecek container yapılarını önce lokal ortamda test etme alışkanlığı kazanıldı.

---

## 🛠️ Kullanılan Komutlar

```bash
git clone https://github.com/oracle/docker-images.git
cd docker-images/OracleDatabase/SingleInstance/dockerfiles
./buildContainerImage.sh -v 21.3.0 -x

docker run --name oraclexe -p 1521:1521 -p 5500:5500 -e ORACLE_PWD=Oracle123 oracle/database:21.3.0-xe

docker exec -it oraclexe bash
sqlplus sys/Oracle123@//localhost:1521/XE as sysdba
SELECT name FROM v$database;
