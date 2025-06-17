## 📘 **PRETEST **

---

### 🔹 A. **Pilihan Ganda (20 Soal)**

#### ✅ Spring Boot Security

1. Anotasi yang digunakan untuk mengaktifkan Spring Security:
   A. `@EnableSecurity`
   B. `@EnableWebSecurity`
   C. `@EnableSpringBootSecurity`
   D. `@EnableSecureApp`

   Jawaban: B.

2. Apa itu `AuthenticationManager` dalam Spring Security?
   A. Komponen untuk mengatur authorization
   B. Class yang memproses autentikasi user
   C. Konfigurasi password encoder
   D. Token parser

   Jawaban: B.

3. Apa peran dari `@PreAuthorize("hasRole('ADMIN')")`?
   A. Mengatur login
   B. Menghindari token expiry
   C. Membatasi akses method hanya untuk ADMIN
   D. Menyimpan role ke database

   Jawaban: C.

4. Class `UserDetails` diimplementasikan untuk...?
   A. Konfigurasi JPA
   B. Logging REST request
   C. Representasi user dalam security context
   D. Mapping endpoint

   Jawaban: C.

5. Library umum untuk hashing password di Spring Security:
   A. AES
   B. MD5
   C. BCrypt
   D. HMAC256

   Jawaban: C.

---

#### 🌐 Basic REST API (Spring Web)

6. Anotasi `@RestController` adalah gabungan dari...?
   A. `@Controller` + `@RequestParam`
   B. `@Controller` + `@PathVariable`
   C. `@Controller` + `@ResponseBody`
   D. `@RequestMapping` + `@Service`

   Jawaban: C.

7. HTTP method `PUT` biasanya digunakan untuk...?
   A. Menghapus data
   B. Mengupdate atau mengganti resource
   C. Mengambil file
   D. Menyambungkan endpoint

   Jawaban: B.

8. Jika Anda ingin mengambil parameter dari `/product/{id}`, Anda akan menggunakan...?
   A. `@RequestParam`
   B. `@RequestHeader`
   C. `@PathVariable`
   D. `@PathParam`

   Jawaban: C. 

9. Untuk membaca JSON body dan mengonversinya ke object Java, kita gunakan...?
   A. `@RequestMapping`
   B. `@RequestBody`
   C. `@PathVariable`
   D. `@GetMapping`

   Jawaban: B.

10. Kode status HTTP yang sesuai untuk `Resource Not Found`:
    A. 200
    B. 201
    C. 404
    D. 500

    Jawaban: C.

---

#### 🧩 Spring Data JPA

11. Anotasi `@Entity` di JPA digunakan untuk...?
    A. Mengatur mapping DTO
    B. Menandai class sebagai table di database
    C. Mendaftarkan bean service
    D. Mengatur konfigurasi Spring Boot

    Jawaban: B.

12. Apa tujuan dari `@Id` dalam entity class?
    A. Menandai kolom biasa
    B. Menyimpan objek transient
    C. Menandai primary key
    D. Mengatur sorting

    Jawaban: C.

13. Anotasi `@GeneratedValue(strategy = GenerationType.IDENTITY)` digunakan untuk...?
    A. Menyimpan record tanpa ID
    B. Membuat kolom unik
    C. Membiarkan database membuat ID otomatis
    D. Mengatur batch update

    Jawaban: C.

14. Apa peran `JpaRepository` dalam Spring Data?
    A. Konfigurasi controller
    B. Layer service REST
    C. Abstraksi akses data CRUD
    D. Mapping response JSON

    Jawaban: C.

15. Relasi One-to-Many di JPA ditandai dengan...?
    A. `@ManyToMany`
    B. `@OneToOne`
    C. `@OneToMany`
    D. `@Column(unique = true)`

    Jawaban: C.

---

#### 🧪 Unit Testing

16. Apa anotasi JUnit 5 untuk membuat method menjadi test unit?
    A. `@Run`
    B. `@TestCase`
    C. `@Test`
    D. `@Execute`

    Jawaban: C.

17. Mockito digunakan untuk...?
    A. Menyimpan object ke file
    B. Menguji performance
    C. Membuat object palsu (mock)
    D. Mengatur cache object

    Jawaban: C.

18. `@MockBean` biasanya digunakan di...?
    A. Spring Boot Application utama
    B. Test berbasis Spring context
    C. File konfigurasi YAML
    D. Static class

    Jawaban: B.

19. `MockMvc` berguna untuk...?
    A. Testing service layer
    B. Membuat dummy API
    C. Menguji controller REST tanpa menjalankan server
    D. Logging request

    Jawaban: C.

20. Apa tujuan dari anotasi `@BeforeEach`?
    A. Menjalankan test terakhir
    B. Setup sebelum setiap test method
    C. Cleanup setelah test
    D. Menentukan environment

    Jawaban: B.

---

### 🔸 B. **Benar / Salah (10 Soal)**

21. Spring Security secara default memblokir semua endpoint.
    Benar
22. `@PathVariable` digunakan untuk membaca data dari query parameter.
    Salah
23. `JpaRepository` menyediakan method seperti `findAll()` dan `save()`.
    Benar
24. `@GeneratedValue` dapat digunakan bersama `@Id`.
    Benar
25. Spring Boot membutuhkan konfigurasi manual untuk mapping JSON ke class.
    Salah
26. `@RestController` hanya bisa digunakan untuk GET request.
    Salah
27. `BCryptPasswordEncoder` menghasilkan hash yang konsisten tanpa salt.
    Salah
28. Penamaan variable sebaiknya camelCase.
    Benar
29. Nama class di Java sebaiknya menggunakan PascalCase.
    Benar
30. `assertEquals(expected, actual)` digunakan untuk membandingkan dua nilai dalam unit test.
    Benar

---

### 🧾 C. **Isian Singkat (5 Soal)**

31. Apa perbedaan antara `@RestController` dan `@Controller`?
Jawaban: `@RestController` digunakan untuk REST API dan otomatis mengembalikkan JSON sebagai respon, sedangkan `@Controller` digunakan untuk aplikasi berbasis MVC dengan View.
32. Jelaskan fungsi `@ManyToOne` dan contoh penggunaannya dalam relasi data.
Jawaban: `@ManyToOne` digunakan untuk merepresentasikan relasi banyak ke satu di database.
Contoh:
@Entity
class Order {
    @ManyToOne
    private Customer customer;
}
33. Apa itu `principal` dalam konteks Spring Security?
Jawaban: `principal` adalah objek yang merepresentasikan user yang sedang login dan biasanya diakses melalui SecurityContextHolder.getContext().getAuthentication().getPrinciap()
34. Sebutkan dua konvensi penamaan dalam Java (untuk class dan variable).
Jawaban:
Class: PascalCase (Contoh: UserService)
Variable: camelCase (contoh: customerName)
35. Mengapa penting menggunakan mocking saat membuat unit test?
Jawaban: Karena agar kita bisa menguji bagian tertentu dari aplikasi tanpa harus tergantung pada database, sehingga test lebih cepat dan terisolasi

---

### 🔧 D. **Koreksi Kode (5 Soal)**

36.

```java
@Entity
public class Product {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
```
Jawaban: Perlu menambahkan anotasi @Id agar Spring mengetahui bahwa id adalah primary key
Perbaikan:
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}

37.

```java
@GetMapping("/user/{id}")
public User getUser(@RequestParam Long id) {
    ...
}
```
Jawaban: Harusnya menggunakan @PathVariable bukan @RequestParam untuk gunakan path /user/{id}
Perbaikan:
@GetMapping("/user/{id}")
public User getUser(@PathVariable Long id) {
    ...
}

38.

```java
@PostMapping("/register")
public String registerUser(User user) {
    ...
}
```
Jawaban: Perlu menambahkan @RequestBody pada parameter User user agar dapat membaca data dari JSON.
Perbaikan:
@PostMapping("/register")
public String registerUser(@RequestBody User user) {
    ...
}

39.

```java
@Mock
UserService userService = new UserServiceImpl();
```
Jawaban: Seharusnya instance tidak diinisialisasi dalam @Mock, biarkan @Mock menangani pembuatan instance sendiri.
Perbaikan:
@Mock
UserService userService;

40.

```java
public class userService {
    public void saveUser(User user) { ... }
}
```
Jawaban: Nama class pada Java harus menggunakan PascalCase bukan camelCase.
Pebaikan:
public class UserService {
    public void saveUser(User user) { ... }
}

---
