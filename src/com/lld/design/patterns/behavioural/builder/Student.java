package com.lld.design.patterns.behavioural.builder;

public class Student {
    private String name;
    private String age;
    private String address;
    private String batch;
    private String grade;
    private String phoneNumber;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student (Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
        this.batch = builder.getBatch();
        this.grade = builder.getGrade();
        this.phoneNumber = builder.getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    static class Builder {
        private String name;
        private String age;
        private String address;
        private String batch;
        private String grade;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAge() {
            return age;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getGrade() {
            return grade;
        }

        public Builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            //Validate starts
            if (this.getName() == null || this.getName().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            if (this.getAge() == null || this.getAge().isEmpty()) {
                throw new IllegalArgumentException("Age cannot be null or empty");
            }
            //Validate completes
            return new Student(this);
        }
    }
}
