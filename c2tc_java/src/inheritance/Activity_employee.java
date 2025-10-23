package inheritance;

// Base class
class Activity_employee {
    private String name;
    private int age;

    public Activity_employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Derived class
class Employee extends Activity_employee {
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return super.toString() +
               ", Employee ID: " + employeeId +
               ", Department: " + department;
    }
}

// Further derived class
class Level1Employee extends Employee {
    private String level;

    public Level1Employee(String name, int age, String employeeId, String department, String level) {
        super(name, age, employeeId, department);
        this.level = level;
    }

    public String getLevel() { return level; }

    @Override
    public String toString() {
        return super.toString() + ", Level: " + level;
    }
}


   
    
