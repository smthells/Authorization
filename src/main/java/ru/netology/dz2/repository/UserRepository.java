package ru.netology.dz2.repository;

import org.springframework.stereotype.Repository;
import ru.netology.dz2.model.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    private static final Map<String, List<Authorities>> userDatabase = new HashMap<>();

    static {
        List<Authorities> adminAuthorities = new ArrayList<>();
        adminAuthorities.add(Authorities.READ);
        adminAuthorities.add(Authorities.WRITE);
        adminAuthorities.add(Authorities.DELETE);
        userDatabase.put("admin", adminAuthorities);

        List<Authorities> userAuthorities = new ArrayList<>();
        userAuthorities.add(Authorities.READ);
        userDatabase.put("user", userAuthorities);
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin123".equals(password)) {
            return userDatabase.get("admin");
        } else if ("user".equals(user) && "user123".equals(password)) {
            return userDatabase.get("user");
        } else {
            return new ArrayList<>();
        }
    }
}
