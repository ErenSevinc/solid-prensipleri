# SOLID PRENSPİLERİ

Solid Prensipleri, yazılım geliştirme süreçlerinde karşılaşılan temel sorunlara getirilen ve içerisinde 5 temel prensibi barındıran prensipler bütünüdür.

Peki, nedir bu sıkça karşılaşılan temel sorunlar;
- Esnemezlik: Kullanılan tasarımın geliştirilememesi ve ekleme yapılamaması.
- Kırılganlık: Bir yerde Yapılan değişikliğin başka bir yerde sorun çıkartması.
- Sabitlik: Geliştirilmiş modülün başka yerde tekrar kullanılabilir (reusable) olmaması.
- Maliyet: Geliştirme maliyetinin ve sürecinin giderek artması.


## SOLİD PRENSİPLERİ

-  S -> Single Responsibilty Principle (SRP)
-  O -> Open/Closed Principle (OCP)
-  L -> Liskov’s Substitution Principle (LSP)
-  I -> Interface Segregation Principle (ISP)
-  D -> Dependency Inversion Principle (DIP)

### Single Responsibilty Principle (SRP)
- **Tanım**: Her sınıf ve metod sade ve sadece ‘Tek Bir Sorumluluğu’ yerine getirmelidir.

- Tek Bir Sorumluluğu yerine getirmek demek, ilgili sınıf ya da metodun değişmek için sadece bir sebebinin bulunması demektir.
	
>[SRP örneği için tıklayınız]

### Open/Closed Principle (OCP)
- **Tanım**: Sınıflar gelişmeye açık lakin değişmeye kapalı olmalıdır.

-  Sınıflarımız veya fonksiyonlarımız değişikliğe kapalı ancak yeni davranışların eklenmesine açık olması gerekir. Geliştirilen programda, yeni bir özellik eklendiğinde **tek bir kod satırı bile** değişmemelidir.

>[OCP örneği için tıklayınız]

### Liskov’s Substitution Principle (LSP)
- **Tanım**: T cinsinden parametre alan tüm programlar (fonksiyonlar) P olacak şekilde, S tipinde o1 nesnesi ve T tipinde o2 nesnesi olsun. Eğer o1 ile o2 nesneleri yer değiştirdiğinde P’nin davranışı değişmiyorsa S tipi T tipinin alt tipidir.

- **Tanımdan Anlamamız Gereken**: Alt sınıflar miras aldığı üst sınıfın bütün özelliklerini kullanmalı, alt sınıflarda oluşturulan nesneler üst sınıfların nesneleriyle yer değiştirdiklerinde aynı davranışı göstermeli ve herhangi bir kullanılmayan özellik olmamalı(Dummy Kod olmamalı). Bu prensipe göre türetilen sınıflar, türeyen sınıfların tüm özelliklerini kullanmak zorundadır.
 
> [LSP örneği için tıklayınız]


### Interface Segregation Principle (ISP)
- **Tanım**: Ara yüzlerin ayrılması prensibidir. 

- Interface implementasyonu sonucunda, eğer Class içinde ihtiyaç duyulmayan ve kullanılmayan,  implement edilmiş metodlar Dummy kod oluşturur. Bunun önüne geçmek için kullanılır.

- Interfaceler ayrılmalı ve Classlarda işlevi olmayan metodlar barındırılmamalıdır.

> [ISP örneği için tıklayınız]


### Interface Segregation Principle (ISP)
- **Tanım**: Katmanlı mimarilerde üst seviye modüller alt seviyedeki modüllere doğruda bağımlı olmamalıdır.

- Üst seviyeli katmanlar kesinlikle alt seviyedeki katmanlara bağlı olmamalı, bağımlılıklar sadece abstract (soyut) kavramlara olmalıdır. Yani buradaki amaç şudur;

- Üst seviyedeki modüllerin alt seviyelere bağımlı olmasından dolayı çıkabilecek sorunları ortadan kaldırmaktır, alt seviyede yapılan herhangi bir değişikliğin üst seviyede kod değişikliğine veya onun bağlılıklarının etkilenmesine engel olmaktır.

> [DIP örneği için tıklayınız]
