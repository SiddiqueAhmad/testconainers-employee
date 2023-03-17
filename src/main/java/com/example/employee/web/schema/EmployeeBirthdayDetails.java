package com.example.employee.web.schema;

import com.example.employee.domain.Email;
import com.example.employee.domain.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeBirthdayDetails {

    private final NameDTO name;

    private final String phone;

    private final String dateOfBirth;

    private final List<EmailDTO> emailDTO;

    public EmployeeBirthdayDetails(Employee employee) {
        this.name = new NameDTO(employee.getName().getFirst(), employee.getName().getLast());
        this.phone = employee.getPhone();
        this.dateOfBirth = employee.getDateOfBirth();
        this.emailDTO = employee.getEmail().stream().map(Email::from).collect(Collectors.toList());
    }

    public NameDTO getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<EmailDTO> getEmailDTO() {
        return emailDTO;
    }
}
