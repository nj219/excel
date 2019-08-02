package com.nj.excledemo.domain;

import lombok.Data;

@Data
public class AccessToken {
  private String token;
  private int expiresIn;
}
