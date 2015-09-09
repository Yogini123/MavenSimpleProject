import dto.mainInformation.Contact;
import dto.mainInformation.ContactService;
import dto.mainInformation.Message;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Honey on 07.09.2015.
 */
public class ContactServiceImpl  implements ContactService {


    @Override
    public void createContact(String firstName, String lastName, LocalDate birthDate) {

    }

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void addPlace(String title, String description, double longitude, double latitude) {

    }

    @Override
    public void addFriendship(Contact newFriend, Contact toWhom) {

    }

    @Override
    public Set<Contact> getFriendList(Contact listOfContacts) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact contactWhoseChat, Contact friendWithWhomConversation) {
        return null;
    }
}

