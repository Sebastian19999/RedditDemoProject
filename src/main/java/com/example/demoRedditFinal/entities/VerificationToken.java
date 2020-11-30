package com.example.demoRedditFinal.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.FetchType.LAZY;

//CLASA MENITA VERIFICARII INREGISTRARII UNUI USER
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "token")
public class VerificationToken {

  @Id
  @GeneratedValue(strategy = IDENTITY)
    private Long id;
  private String token;

  @OneToOne(fetch = LAZY)
    private User user;
  private Instant expiringDate;

}
