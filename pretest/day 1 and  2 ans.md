1. B. Mengelola logika aplikasi dan komunikasi data dengan database
2. A. Menyembunyikan detail implementasi dan menyediakan akses lewat method
3. C. Meng-inject dependency otomatis ke dalam bean
4. A. Agar controller lebih ringan dan fokus pada request/response
5. C. `@GetMapping("/api")`
6. False
7. True
8. True
9. False
10. True
11. Backend adalah bagian dari aplikasi yang mengelola logika, komunikasi dengan datase, dan melakukan proses data. Perannya, Frontend akan melakukan request dan backend akan mengirimkan respon yang sesuai.
12. Class adalah blueprint untuk membuat objek, sedangkan Object adalah instance konkret yang dibuat dari suatu class. Class mendefinisikan atribut dan metode dari suatu Object
13. - Inheritance: Memungkinkan suatu class mewarisi atribut dan metode dari class lain.
    - Polyphorism: Memungkinkan suatu method memiliki berbagai bentuk atau perilaku tergantung pemanggilannya.
14. `@RestController` digunakan untuk menandai class sebagai REST API controller yang mengelola request HTTP dan mengembalikan data dalam format JSON.
15. Spring Boot menyederhanakan pembuatan server dengan konfigurasi otomatis, dependancy management, dan berbagai fitur siap pakai.
16. Depedency Injection berfungsi secara otomatis menyediakan instance yang dibutuhkan oleh suatu class, menghindari pembuatan objek secara manual dan meningkatkan modularitas.
17. Memisahkan controller dan servie membantu menjaga controller agar tetap ringan dengan ganya menangani HTTP request, sementara service mengelola logika bisnis, membuat kode lebih terstruktur dan mudah diuji.
18. Jika tidak menambahkan `@Service`, Spring tidak akan mengenali class sebagai bean, sehingga tidak dapat diinject ke dalam controller.
19. `@RequestParam` adalah anotasi dalam Spring yang digunakan untuk menangkap parameter dari query string dalam request HTTP dan memetakannya ke parameter metode dalam controller. Dipakai ketika kita mengakses endpoint REST API dengan URL mengandung parameter dan kita perlu menangkap nilai tersebut di controller.
20. Membuat constructor pada controller yang menerima instance dari service sebagai parameter. Spring otomatis melakukan dependency injection jika service dan controller sudah diberi anotasi.
21. hello Service belum dideklarasi sebagia dependency.
Versi benar:
@RestController
public Class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello)
    public String hello() {
        return helloService.sayHello();
    }
}

22. Konstruktor memiliki nama yang salah, harusnya tanpa void
Versi benar:
public class Person {
    public String name;

    public Person(String name) { 
        this.name = name;
    }
}

23. @RequestBody harus memiliki tipe data, tambahkan String
Versi benar:
@RestController
public class GreetController {
    @PostMapping("/greet")
    public String greet(@RequestBody String name) { 
        return "Hello, " + name;
    }
}

24. InfoService info = new, seharsunya menggunakan constructor injection agar Spring mengelola infoService() secara otomatis
Versi Benar:
@Service
public class InfoService {
    public String getInfo() {
        return "Info OK";
    }
}

// Controller
@RestController
public class InfoController {
    private final InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/info")
    public String get() {
        return infoService.getInfo();
    }
}

25. Parameter metode tidak ditangkap dari request, seharusnya menggunakan @RequestParam untuk membaca nilai.
Versi Benar:
@RestController
public class MathController {
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) { 
        return a + b;
    }
}