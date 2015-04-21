package contactarchive.service;

import java.util.List;
import contactarchive.domain.Contact;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
