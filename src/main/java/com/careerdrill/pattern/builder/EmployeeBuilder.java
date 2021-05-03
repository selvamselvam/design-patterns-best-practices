package com.careerdrill.pattern.builder;

public class EmployeeBuilder {

    private final int age;
    private final String fname;
    private final String lname;
    private final int employeeID;
    private final String city;
    private final String state;
    private final String country;

    public EmployeeBuilder(Builder builder) {
        this.age = builder.age;
        this.fname = builder.fname;
        this.lname = builder.lname;
        this.employeeID = builder.employeeID;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
    }

    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "age=" + age +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", employeeID=" + employeeID +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private static class Builder {
        private int age;
        private String fname;
        private String lname;
        private int employeeID;

        private String city;
        private String state;
        private String country;

        public Builder(int employeeID, String fname) {
            this.employeeID = employeeID;
            this.fname = fname;
        }

        public Builder empage(int age) {
            this.age = age;
            return this;
        }

        public Builder lastname(String lname) {
            this.lname = lname;
            return this;
        }

        public Builder empcity(String city) {
            this.city = city;
            return this;
        }


        public Builder empstate(String state) {
            this.state = state;
            return this;
        }

        public Builder empcountry(String country) {
            this.country = country;
            return this;
        }

        public EmployeeBuilder build() {
            return new EmployeeBuilder(this);
        }

    }


    public static void main(String[] args) {
        EmployeeBuilder empbuilder = new Builder(11, "siva").build();

        System.out.println(empbuilder);

    }
}
