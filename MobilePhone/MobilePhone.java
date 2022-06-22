package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (myContacts.contains(contact)){
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (myContacts.contains(oldContact)){
            int indexOldContact = myContacts.indexOf(oldContact);
            myContacts.set(indexOldContact, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            int indexOldContact = myContacts.indexOf(contact);
            myContacts.remove(indexOldContact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact){
        if(myContacts.indexOf(contact) >= 0){
            System.out.println("Contact Exists");
            return myContacts.indexOf(contact);
        } else {
            System.out.println("Contact does not Exists");
            return myContacts.indexOf(contact);
        }
    }

    public int findContact(String contact){
        for (Contact item:myContacts){
            if(item.getName().equalsIgnoreCase(contact)){
                System.out.println("Contact Exists");
                return myContacts.indexOf(item);
            }
        }
        System.out.println("Contact doesnot Exists");
        return -1;
    }

    public Contact queryContact(String contact){
        for (Contact item:myContacts){
            if (item.getName().contains(contact)){
                return item;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        if (myContacts.size() == 0){
            System.out.println("List of contacts is empty");
        } else {
            for (int index = 0; index < myContacts.size(); index++){
                System.out.println((index+1) + ". " + myContacts.get(index).getName() + " -> " + myContacts.get(index).getPhoneNumber());
            }
        }
    }
}
