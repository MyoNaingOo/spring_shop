package com.mno.shop.repo;

import com.mno.shop.entity.Postor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostorRepo extends JpaRepository<Postor,Long> {

}
