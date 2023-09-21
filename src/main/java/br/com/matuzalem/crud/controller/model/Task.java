package br.com.matuzalem.crud.controller.model;


//NAO USEI O LOOMBOK 
public class Task {


    public Task(String name, String email, long tel){
        this.name = name;
        this.email = email;
        this.tel = tel;
    }
    
    private String name;
    private String email;
    private long tel;



public void setName(String name) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setEmail(String email) {
    this.email = email;
}
public String getEmail() {
    return email;
}
public void setTel(long tel) {
    this.tel = tel;
}
public long getTel() {
    return tel;
}
    
}
