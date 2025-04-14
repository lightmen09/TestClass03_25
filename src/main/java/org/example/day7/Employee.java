package org.example.day7;

    class Employee {
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public Employee() {
            this("Unnamed", 100_000);
        }

        public void printInfo() {
            System.out.println("Имя: " + name);
            System.out.println("Зарплата: " + salary);
        }
    }

    class Developer extends Employee {
        int linesOfCodePerDay;

        public Developer(String name, int salary, int linesOfCodePerDay) {
            super(name, salary);
            this.linesOfCodePerDay = linesOfCodePerDay;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Строк кода в день: " + linesOfCodePerDay);
        }
    }

    class Manager extends Employee {
        int numberOfMeetingsPerDay;

        public Manager(String name, int salary, int numberOfMeetingsPerDay) {
            super(name, salary);
            this.numberOfMeetingsPerDay = numberOfMeetingsPerDay;
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println("Встреч в день: " + numberOfMeetingsPerDay);
        }
    }



