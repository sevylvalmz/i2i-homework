# ORACLEDB-EX-03 – Oracle SQL Developer ile BOOK Tablosu Oluşturma

## 📌 Amaç

Bu ödevin amacı, daha önce Docker ortamında kurulan Oracle veritabanına (ORACLEDB-EX-02) Oracle SQL Developer veya DBeaver kullanarak bağlanmak ve içinde `BOOK` adında bir tablo oluşturmaktır.

---

## 🧰 Kullanılan Araçlar

- **Oracle XE 21c (Docker üzerinde çalışıyor)**
- **DBeaver** veya **Oracle SQL Developer**
- **Oracle JDBC Driver**
- (İsteğe bağlı olarak) Terminal / PowerShell

---

## 🛠️ Adımlar

### 1. Oracle SQL Developer veya DBeaver kurulumu
- SQL Developer: [https://www.oracle.com/tools/downloads/sqldev-downloads.html](https://www.oracle.com/tools/downloads/sqldev-downloads.html)
- DBeaver: [https://dbeaver.io/download/](https://dbeaver.io/download/)

### 2. Oracle Docker Container Bağlantı Bilgileri
- **Host:** `localhost`
- **Port:** `1521`
- **Service Name:** `XE` veya `xepdb1`
- **Username:** `system`
- **Password:** (kullanıcının belirlediği şifre)

### 3. Bağlantının Test Edilmesi
- Bağlantı arayüzünden "Test Connection" tıklanarak bağlantının sağlandığı doğrulanır.

### 4. BOOK Tablosunun Oluşturulması

```sql
CREATE TABLE BOOK (
  ID NUMBER,
  NAME VARCHAR2(128),
  ISBN VARCHAR2(32),
  CREATE_DATE DATE DEFAULT SYSDATE
);
