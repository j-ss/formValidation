package com.spring.entity;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Details {

  @NotNull(message = "required") @Size(min = 1)
  private String name;
  @NotNull(message = "required")
  @Pattern(regexp = "\\w+\\@[a-z]+\\.[a-zA-Z]{3,5}",message = "enter valid email")
  private String email;
  @NotNull(message = "required")
  @Pattern(regexp = "^(\\+91|0)?[6-9][0-9]{9}",message = "invalid phone no")
  private String phone;
  @NotNull(message = "required")
  private String city;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
