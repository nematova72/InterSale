package com.example.internetsale.service;

import com.example.internetsale.dto.MarketDto;
import com.example.internetsale.dto.UserDto;
import com.example.internetsale.model.Market;
import com.example.internetsale.model.User;
import com.example.internetsale.repo.MarketRepo;
import com.example.internetsale.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public List<UserDto> listUser(String firstname) {
        if (firstname == null) {
            List<User> listUser = userRepo.findAll();
            List<UserDto> result = new ArrayList<>();
            for(int i=0; i<listUser.size();i++){
                UserDto userDto = new UserDto();
                userDto.setId(listUser.get(i).getId());
                userDto.setFirstname(listUser.get(i).getFirstname());
                userDto.setSurname(listUser.get(i).getSurname());
                userDto.setItems_id(listUser.get(i).getItemNo().getName());
                userDto.setMarkets_id(listUser.get(i).getMarketName().getName());
                result.add(userDto);
            }
            return result;
        } else {
            //return marketRepo.findByName(name);
            return new ArrayList<>();
        }
//        return items.stream()
//                .filter(item -> item.getName().contains(itemName))
//                .collect(Collectors.toList());
    }

    public User saveUser(User newUser) {
        return userRepo.save(newUser);
    }
    public User findByUserId(Long id) {
        return userRepo.findUserById(id);
    }

    public void deleteItem(Long items_Id) {
        userRepo.deleteById(items_Id);
    }
    public User updateUser(Long id, User newUser) {
        User user = userRepo.findUserById(id);
        user.setFirstname(newUser.getFirstname());
        user.setSurname(newUser.getSurname());
        user.setItems_id(newUser.getItems_id());
        user.setMarkets_id(newUser.getMarkets_id());

        return userRepo.save(user);

    }

    public User getUserById(Long id) {
        User result = userRepo.findUserById(id);
        //тут обработка
        return result;
    }


}
