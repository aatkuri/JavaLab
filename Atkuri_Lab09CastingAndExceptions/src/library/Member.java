/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import exceptions.MaximumItemsReachedException;
import exceptions.UnderAgeException;
import java.util.Random;

/**
 * Member represents a library member
 * @author Ashok Atkuri
 */
public abstract class Member {

    /**
     * Unique ID of member
     */
    private String memberID;
    /**
     * Name of the member
     */
    private String name;
    /**
     * Static integer variable that is initialized to 900000
     */
    private static int _919_counter = 900000;
    /**
     * Holds the number of items that a member checked out from the Library.
     */
    private Item[] items;
    /**
     * It counts the number of items added to the array.
     */
    private int itemsCount;
    /**
     * Age of the member
     */
    private int age;

    /**
     * Initializes itemsCount to 0. Assign generateMemberID() to memberID and
     * initializes other instance variable of class
     *
     * @param name Name of the member
     * @param age Age of the member
     */
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        this.itemsCount = 0;
        this.memberID = generateMemberID();
    }

    /**
     * Returns MemberID of member
     *
     * @return String MemberID of member
     *
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * Returns name of the member
     *
     * @return String Name of the member
     */
    public String getName() {
        return name;
    }

    /**
     * Return an item array
     *
     * @return Array - Items array
     */
    public Item[] getItems() {
        return items;
    }

    /**
     * Returns age of the member
     *
     * @return age Age of the member
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets name of the member
     *
     * @param name Name of the member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets an item array
     *
     * @param items An array of items
     */
    public void setItems(Item[] items) {
        this.items = items;
    }

    /**
     * Sets age of the member
     *
     * @param age Age of the member
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method returns a unique ID. It generates a 6 digit random number
     * followed by "919" using seed value 20L. Increment the
     * <code>_919_couner</code> before returning the String. Examples:
     * <br>
     * 919649853
     * <br> 919656567
     *
     * @return String Unique member ID
     */
    public String generateMemberID() {
        this._919_counter += 1;
        Random rand = new Random();
        return "919" + (100000 + rand.nextInt(900000));
    }

    /**
     * This method add items to <code>items</code> array. If
     * <code>itemsCount</code> is less than length of the array then add items
     * to array, else throw MaximumItemsReachedException with message
     * "<code>memberID</code> : You have reached your maximum limit".
     * <br>
     * <br>
     * If item is a Book,
     * <br>
     * Check age of the member with age specified in Genre. If member's age is
     * greater than or equal to age specified in Genre, then convert the book
     * title to uppercase and update the book title, set the item available to
     * false and then add the book to <code>items</code> array. Increment the
     * <code>itemsCount</code>. Else, throw UnderAgeException with message
     * "<code>memberID</code> : Not allowed to check out this book".
     * <br>
     * <br>
     * If item is a DVD,
     * <br>
     * Check age of the member with age specified in MPAA_Rating of DVD. If
     * member's age is greater than age specified in MPAA_Rating, then convert
     * the DVD title to lowercase and update the DVD title, set the item
     * available to false and then add the DVD to <code>items</code> array.
     * Increment the <code>itemsCount</code>. Else, throw UnderAgeException with
     * message "memberID : The DVD has a <code>MPAA_rating description</code>
     * rating, Your are not allowed to check out this item".
     * <br>
     * <br>
     * If item is a device,
     * <br>
     * Convert the device title to lower case and update the device title, set
     * the item available to false and then add device to <code>items</code>
     * array. Increment the <code>itemsCount</code>.
     *
     * @param item Item
     * @throws MaximumItemsReachedException if items array is full.
     * @throws UnderAgeException if age of member is less than the specified
     * age.
     */
    public void addItems(Item item)
            throws MaximumItemsReachedException,
            UnderAgeException {
        if (!(this.itemsCount < this.items.length)) {
            throw new MaximumItemsReachedException(this.getMemberID() + " : You have reached your maximum limit");
        }
        String itemType = item.getClass().getSimpleName();
        if (itemType.equals("Book")) {
            if (this.age < ((Book) item).getGenre().getAge()) {
                throw new UnderAgeException(this.memberID + " : Not allowed to check out this book");
            } else {
                item.setTitle(item.getTitle().toUpperCase());
                item.setAvailable(false);
                items[itemsCount] = item;
                itemsCount++;
            }
        }
        if (itemType.equals("DVD")) {
            if (this.age < ((DVD) item).getRating().getAge()) {
                throw new UnderAgeException(memberID+" : The DVD has a "+((DVD) item).getRating().getDescription()
                    + " rating,Your are not allowed to check out this item");
            } else {
                item.setTitle(item.getTitle().toLowerCase());
                item.setAvailable(false);
                items[itemsCount] = item;
                itemsCount++;
            }
        }
        if (itemType.equals("Device")) {
            item.setTitle(item.getTitle().toLowerCase());
            item.setAvailable(false);
            items[itemsCount] = item;
            itemsCount++;
        }
    }

    /**
     * String representation of Member in given format.
     * <br>
     * For example:
     * <br>
     * <code>
     * MemberID: 919649853
     * <br>
     * Name: Mike Husser
     * <br>
     * Age: 18
     * <br>
     * Title: THE HUNGER GAMES, Available: false, BookID: NWM_B_1, RackNo:
     * SH.1.2011, Edition: 2.0, Authors: Arml, D. L., Tan, P., Teck, T.
     * <br>
     * Title: THE GIVER, Available: false, BookID: NWM_B_2, RackNo: GY.2.2010,
     * Edition: 4.0, Authors: Sierra, K., Goss, J., tek, L.
     * <br>
     * Title: android charger, Available: false, DeviceID: NWM_D_3, RackNo:
     * droid Charger_D_7
     * <br>
     * </code>
     *
     * @return String representation of Member
     */
    @Override
    public String toString() {
        String titles="";
        for(int i=0;i<itemsCount;i++){
            titles+="\n"+items[i].toString();
        }
        return "MemberID: " + memberID
                +"\nName: " + name
                +"\nAge: " + age
                +titles;
    }
}
