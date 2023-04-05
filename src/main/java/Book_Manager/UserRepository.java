package Book_Manager;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public class UserRepository {
    public Optional<User> getByUserId(Integer userId){
        return userDb.containsKey(userId)? Optional.of(UserDb.get(userId)):Optional.empty();

    }

    public updateUser(User user){
        User user2=userDb.get(user.getUserId());
        userDb.put(user.getUserId(),user);

    }
}
