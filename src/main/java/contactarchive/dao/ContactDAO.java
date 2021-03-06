package contactarchive.dao;

import java.util.List;
import contactarchive.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
