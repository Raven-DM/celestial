1. b. `@Entity`
2. c. Menyediakan endpoint berbasis REST
3. a. Menangani request GET ke endpoint `/user`
4. c. `findAll()`
5. a. `@ManyToOne`
6. c. `application.properties`
7. b. `@Autowired`
8. c. `@Query`
9. b. Mengambil data JSON dari body request
10. c. Mengambil data dari path endpoint
11. Benar
12. Benar
13. Salah
14. Benar
15. Salah
16. `@Controller`mengembalikkan tampilan (HTML), sedangkan `@RestController` mengembalikkan langsung data dalam format JSON atau XML untuk layanan REST API
17. `@GeneratedValue` untuk menentukan strategi otomatis dalam pembuatan nilai primary key, seperti AUTO, IDENTITY, SEQUENCE, atau TABLE
18. Karena DTO untuk memisahkan entitas database dari model yang dikirimkan API, meningkatkan keamanan, efisiensi, dan fleksibilitas dalam proses data.
19. Spring menggunakan metode query derivation, dimana nama method diterjemahkan secara otomatis ke query database berdasarkan properti entitas.
20. `@Column(name = "full_name")` digunakan untuk menentukan nama kolom di database agar berbeda dari nama field di kelas entitas JPA.
21. Tidak ada anotasi @id sebagai primary key dan tidak ada @GeneratedValue untuk konfigurasi ID otomatis.
Perbaikan:
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
22. Parameter name tidak ditandai dengan @RequestParam sehingga nilainya akan selalu null.
Perbaikan:
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}

23. Gunakan anotasi @OneToMany dan @ManyToOne untuk masing-masing entitas, sebagai berikut: 
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}

24. Dengan akses /user/123, return yang dihasilkan adalah User ID: 123

25. Dapat menggunakan @ResponseStatus dan exception seperti berikut: 
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

selanjutnya, controller bisa di adjust sebagai berikut saat user tidak ditemukan: 
@GetMapping("/user/{id}")
public User getUser(@PathVariable Long id) {
    return userRepository.findById(id)
            .orElseThrow(() -> new UserNotFoundException("User dengan ID " + id + " tidak ditemukan"));
}