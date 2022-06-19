package naturalis.erp.Service;

import localhost.teste.User;
import naturalis.erp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<naturalis.erp.Model.User> getAllUsers(){
        List<naturalis.erp.Model.User> userList = new ArrayList<>();
        userRepository.findAll().forEach(e -> userList.add(e));
        return userList;
    }
}
