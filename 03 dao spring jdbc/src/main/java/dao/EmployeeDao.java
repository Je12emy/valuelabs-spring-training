package dao;

import dao.model.Employee;

public interface EmployeeDao {
    public void save(Employee employee);

    public void update(Employee employee);

    public void remove(int eno);

    public Employee get(int eno);
}
