package com.sparta.entity;

import jakarta.persistence.*;

//@Entity(name = "Memo") 해서 옵션 줘도 됨 엔티티 이름 = 클래스 이름임 근데 이거 디폴트라서 안써도 됨
//Entity를 객체화(인스턴스화) 할 때 기본생성자 사용함 그래서 현재 엔티티 클래스에서 무조건!! 기본생성자 있는지 확인해줘야 함!!!! 꼮!!
@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
@Table(name = "memo") // 매핑할 테이블의 이름을 지정 이것도 생략 가능하긴함 엔티티이름으로 디폴트 지정됨
public class Memo {
    //id = 테이블의 기본키 지정
    @Id
    private Long id;

    //DB의 컬럼 맞음 윗줄이랑 아랫줄을 매핑하겠다는 뜻임
    // nullable: null 허  여부   false = 널 안돼! 디폴트=트루
    // unique: 중복 허용 여부 (false 일때 중복 허용) 디폴트=폴스
    //username unique니까 pangya 두번 넣으면 안딤! 이름 겹치몀ㄴ 아됨
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정
    // 문자 길이 제약조건임 500 넘으면 에러 디폴트는=255임
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}