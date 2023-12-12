package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile("cats")
@Service("pets")
public class CatPetService implements PetService {
@Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
