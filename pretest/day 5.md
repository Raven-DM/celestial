## 📄 Pretest Spring Boot Security & Unit Testing\*\*

### ✅ **A. Pilihan Ganda (12 Soal)**

1. Apa tujuan utama dari Spring Security?
    Jawaban: Untuk mengamankan aplikasi dengan menyediakan mekanisme autorisasi dan autentikasi
2. Apa anotasi untuk mengaktifkan Web Security di Spring Boot?
    Jawaban: @EnableWebSecurity
3. Apa fungsi `HttpSecurity` dalam konfigurasi Spring Security?
    Jawaban: untuk konfigurasi keamanan HTTP, seperti aturan autorisasi, autentikasi, dan proteksi CSRF
4. Apa itu prinsip _Authentication Principal_ dalam Spring Security?
    Jawaban: representasi pengguna yang sedang login bisa berupa objek principal dan UserDetail
5. Apa peran dari anotasi `@PreAuthorize("hasRole('ADMIN')")`?
    Jawaban: pembatasan akses metode hanya untuk peran Admin
6. Apa fungsi dari class `UserDetails` di Spring Security?
    Jawaban: antarmuka untuk menyimpan informasi pengguna, seperti username, password, dan role
7. Apa itu BCrypt?
    Jawaban: algoritma hashing untuk amankan password dengan encrypt kuat
8. Library utama yang digunakan untuk testing unit di Spring Boot adalah:
    Jawaban: spring-boot-starter-test mencakup JUnit, Mockito, dan AssertJ
9. Apa kegunaan dari `@MockBean` dalam Spring Boot Test?
    Jawaban: Pada spring boot, @MockBean berguna untuk mengganti bean asli menjadi mock, sehingga pengujian dapat dilakukan tanpa dependasi nyata
10. Apa yang dilakukan oleh anotasi `@WithMockUser`?
    Jawaban: Untuk simulasi pengguna yang sudah login dalam pengujian Spring Security
11. Apa perbedaan mendasar antara `@WebMvcTest` dan `@SpringBootTest`?
    Jawaban: `@WebMvcTest`menguji layer controller sedangkan `@SpringBootTest` menguji keseluruhan aplikasi
12. Apa tujuan dari anotasi `@BeforeEach` dalam unit test?
    Jawaban: menjalankan metode sebelum setiap pengujian, untuk inisialisasi objek

---

### ✅ **B. Benar/Salah (5 Soal)**

13. `BCryptPasswordEncoder` menghasilkan hash yang sama untuk password yang sama. 
    Salah
14. Spring Security dapat digunakan untuk endpoint berbasis REST API maupun form login.
    Benar
15. `@WebMvcTest` bisa digunakan untuk menguji layer service dan repository.
    Salah
16. `Principal` adalah representasi dari user yang sedang login.
    Benar
17. `@MockBean` dan `@Mock` memiliki efek yang sama dalam Spring Boot Test.
    Salah

---

### ✅ **C. Isian Singkat (5 Soal)**

18. Apa peran dari `AuthenticationManager` dalam Spring Security?
    Jawaban: memproses autentikasi pengguna dengan memverifikasi AuthenticationProvider
19. Jelaskan apa yang dilakukan oleh `PasswordEncoder` dan kenapa penting?
    Jawaban: mengubah password menjadi hash yang aman, sehingga tidak disimpan dalam bentuk plain text
20. Apa yang dimaksud dengan "authorization" dalam konteks aplikasi?
    Jawaban: proses pemberian hak akses kepada pengguna berdasarkan role
21. Apa itu _test double_, dan apa perbedaannya dengan _mock_ di unit test?
    Jawaban: _test double_ adalah objek pengganti dalam pengujian, sedangkan _mock_ adalah test double yang digunakan untuk memverifikasi interaksi dengan objek lain
22. Dalam pengujian REST API Spring Boot, apa fungsi utama `MockMvc`?
    Jawaban: mensimulasikan permintaan HTTP tanpa  menjalankan server sebenarnya

---

### ✅ **D. Koreksi Kode (8 Soal)**

Perhatikan kode berikut dan jelaskan apa yang salah.

23.

```java
@Autowired
private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
```
Jawaban: @Autowired tidak bisa digunakan dengan PasswordEncoder, karena Spring tidak dapat mengelola instance yang dibuat secara manual.vGunakan @Bean untuk deklarasi PasswordEncoder
Perbaikan kode:
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

24.

```java
@WithMockUser(username = "user", roles = "USER")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}
```
Jawaban: Pengguna dengan peran USER, tidak bisa coba akses endpoint "/admin" (membutuhkan peran ADMIN).
Perbaikan kode:
@WithMockUser(username = "admin", roles = "ADMIN")
@Test
void testAccessAdminEndpoint() {
    mockMvc.perform(get("/admin")).andExpect(status().isOk());
}

25.

```java
@Mock
UserService userService = new UserServiceImpl();
```
Jawaban: @Mock tidak bisa digunakan bersamaan dengan new UserServiceImpl() yang membuat instance nyata. Gunakan @InjectMocks untuk inject mock ke objek nyata
Kode perbaikan:
@InjectMocks
private UserService userService;

26.

```java
@SpringBootTest
@WebMvcTest
public class MyTest {
}
```
Jawaban: @SpringBootTest tidak bisa digunakan bersamaan dengan @WebMvcTest. @WebMvcTest hanya memuat layer web sedangkan @SpringBootTest memuat seluurh aplikasi. Gunakan salah satu sesuai kebutuhan

27.

```java
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    assertEquals("mypassword", encoder.encode("mypassword"));
}
```
Jawaban: kesalahan pada assertEquals dengan PasswordEncoder.encode(). BCryptPasswordEncoder() menghasilkan hash yang berbeda setiap waktu karena menggunakan salt. Gunakan matches() untuk membandingkan password.
Kode perbaikan:
@Test
void testPasswordHash() {
    PasswordEncoder encoder = new BCryptPasswordEncoder();
    assertTrue(encoder.matches("mypassword", encoder.encode("mypassword")));
}
28.

```java
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isOk());
}
```
Jawaban: Endpoint "/secure-data" memerlukan autentikasi, tetapi tidak ada pengguna yang disimulasikan. Gunakan @WithMockUser untuk simulasikan pengguna.
Kode Perbaikan:
@WithMockUser
@Test
void testUnauthorizedAccess() {
    mockMvc.perform(get("/secure-data"))
           .andExpect(status().isOk());
}


29.

```java
@BeforeAll
void setup() {
    MockitoAnnotations.openMocks(this);
}
```
Jawaban: @BeforeAll harus digunakan dengan metode static, tetapi MockitoAnnotations.openMocks(this) membutuhkan instance. Gunakan @BeforeEach atau metode static.
Kode perbaikan:
@BeforeAll
static void setup() {
    MockitoAnnotations.openMocks(MyTest.class);
}

30.

```java
@Test
void testLogin() {
    when(authService.login("user", "pass")).thenReturn(null);
    assertNotNull(authService.login("user", "pass"));
}
```
Jawaban: thenReturn(null) mengembalikkan null, tetapi assertNotNull() tidak mengharapkan nilai tidak null. Ubah nilai yang dikembalikan agar tidak null atau gunakan assertNull()
Kode Perbaikan:
when(authService.login("user", "pass")).thenReturn(new User());
assertNotNull(authService.login("user", "pass"));
