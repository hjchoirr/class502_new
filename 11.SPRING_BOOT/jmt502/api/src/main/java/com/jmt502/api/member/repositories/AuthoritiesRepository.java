package com.jmt502.api.member.repositories;

import com.jmt502.api.member.entities.Authorities;
import com.jmt502.api.member.entities.AuthoritiesId;
import com.jmt502.api.member.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface AuthoritiesRepository extends JpaRepository<Authorities, AuthoritiesId>, QuerydslPredicateExecutor<Authorities> {

    List<Authorities> findByMember(Member member);
}
