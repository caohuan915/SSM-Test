package com.zhr.pojo;

public class User {
    int id;
    String name;
    String Workspace;
    String time;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkshop() {
        return Workspace;
    }

    public void setWorkshop(String workshop) {
        Workspace = workshop;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Workshop='" + Workspace + '\'' +
                ", time='" + time + '\'' +
                ", salary=" + salary +
                '}';
    }

    public User(int id, String name, String workspace, String time, int salary) {
        this.id = id;
        this.name = name;
        workspace = workspace;
        this.time = time;
        this.salary = salary;
    }
}
