package com.mycompany.testingproject;

public class UserDto {
    private Long id;
    private String name;
    private int age;
    private String email;

    public UserDto(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    public UserDto() {
        this.id = -1L;
        this.name = "";
        this.age = 0;
        this.email = "";        
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }  
}
