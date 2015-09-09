package dto.mainInformation;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Honey on 07.09.2015.
 */
public interface ContactService {
    public void createContact(String firstName, String lastName, LocalDate birthDate);
    public void addHobby(String title, String description);
    public void addPlace(String title, String description, double longitude, double latitude);
    public void addFriendship(Contact newFriend, Contact toWhom);
    public Set<Contact> getFriendList(Contact listOfContacts);
    public List<Message> getConversation(Contact contactWhoseChat, Contact friendWithWhomConversation);
}
