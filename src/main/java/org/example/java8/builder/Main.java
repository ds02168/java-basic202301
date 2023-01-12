package org.example.java8.builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        Member m = new Member("abc1234","1234", null, null, 22, true);

//        Member m = new Member("abc1234", "1234");
//        m.setAge(22);

        Member m = Member.builder()
                .account("abc1234")
                .age(33)
                .password("1234")
                .regDate(LocalDateTime.now())
                .build();

        Board.builder()
                .content("글내용잉 블라블라~~~")
                .writer("김똘끼")
                .id(100L)
                .title("제목이야~~~")
                .build();
    }
}
