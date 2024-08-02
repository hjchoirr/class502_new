# 스프링부트 CRUD

1. 도서 목록 

   http://localhost:3000/book/list
    - 여기서 등록 삭제 모두 가능함

2. CRUD 대상 테이블 : Book

3. (참고)Author 데이터는 ManyToOne 조인 테스트를 위해 도서 등록 시 자동으로 데이터 1건 인서트하고 시작함.  

4. 테스트 
   - /java/com/choongang/book/Ex01.java

5. 환경변수 
   - 편의상 환경변수 등록 없이 yml 파일에 명시함

```properties
     driver-class-name: oracle.jdbc.driver.OracleDriver
     url: jdbc:oracle:thin:@localhost:1521:XE
     username: BOARD_PROJECT
     password: oracle   
```

## Entity
```java

public class Book extends BaseEntity{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookSeq;

    @Column(length=100, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorCd")
    private Author author;

    @Column(length = 50, nullable = false)
    private String publisher;

    @Column(nullable = false)
    private int pubYear;

    private String content;

}

public class Author extends BaseEntity{
    @Id
    @Column(length = 5, nullable = false, unique = true)
    private String authorCd;

    @Column(length = 50, nullable = false, unique = true)
    private String authorName;

    @ToString.Exclude
    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
```




