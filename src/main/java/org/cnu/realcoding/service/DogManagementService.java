package org.cnu.realcoding.service;

import lombok.Getter;
import org.cnu.realcoding.domain.Dog;
import org.cnu.realcoding.exception.DogConflictException;
import org.cnu.realcoding.exception.DogNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogManagementService {

    @Getter
    private List<Dog> dogs = new ArrayList<>();

    public Dog getDogByName(String name) {
        /* for문 돌면서 일치하는 이름을 찾음 */
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        /* 못찾음 */
        throw new DogNotFoundException();
    }
}
