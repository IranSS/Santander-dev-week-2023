package project.service;

import project.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userCreate);
}
