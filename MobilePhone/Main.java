package MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("085740199118");
        Contact contact1 = new Contact("Yusuf", "11111");
        mobilePhone.addNewContact(contact1);
        Contact contact2 = new Contact("Yudha", "22222");
        mobilePhone.addNewContact(contact2);
        Contact contact3 = new Contact("Aku", "33333");
        mobilePhone.addNewContact(contact3);
        Contact contact4 = new Contact("Ipul", "44444");
        mobilePhone.addNewContact(contact4);
        mobilePhone.addNewContact(contact2);
        Contact contact5 = new Contact("a","1");
        mobilePhone.updateContact(contact2, contact5);
        System.out.println(mobilePhone.findContact(contact1));
        System.out.println(mobilePhone.findContact("Ipul"));
        System.out.println(mobilePhone.queryContact("Yusuf"));
        mobilePhone.removeContact(contact3);
        mobilePhone.printContacts();
    }
}
