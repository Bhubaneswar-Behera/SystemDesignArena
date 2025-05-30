package com.lld.design.patterns.behavioural.builder;

public class Student {
    private String name;
    private String age;

    private Student (Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
    }

    public static Builder getBuilder() {
        return new Builder();
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

    static class Builder {
        private String name;
        private String age;

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
