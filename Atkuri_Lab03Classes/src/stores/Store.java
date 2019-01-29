/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

/**
 * This is the class for store.
 * @author Ashok Atkuri
 * Class Store
 */
public class Store {
    
    private String storeName;
    private int storeID;
    private String phoneNumber;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    
    
    /**
     * This is the parameterized Constructor.
     * @param storeName
     * @param storeID
     * @param phoneNumber
     * @param street
     * @param city
     * @param state
     * @param zipCode
     */
    public Store(String storeName, int storeID, String phoneNumber, 
            String street, String city, String state, int zipCode) 
    {
        this.storeName = storeName;
        this.storeID = storeID;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;    
    }
    
    /**
     *This is No argument Constructor.
     */
    public Store() { }
    

    /**
     * This is the getter to retrieve the value of storeName.
     * @return String Returns the value in storeName.
     */
    public String getStoreName() { return storeName; }
    
    /**
     * This is the setter to set the value of storeName.
     * @param storeName This is the parameter to set store name. 
     */
    public void setStoreName(String storeName) { this.storeName = storeName; }
    
    /**
     * This is the getter to retrieve the value of storeID.
     * @return Integer Returns the value in storeID.
     */
    public int getStoreID() { return storeID; }

    /**
     * This is the setter to set the value of storeID.
     * @param storeID This is the parameter to set storeID. 
     */
    public void setStoreID(int storeID) { this.storeID = storeID; }

    /**
     * This is the getter to retrieve the value of phoneNumber.
     * @return String Returns the value in phoneNumber.
     */
    public String getPhoneNumber() { return phoneNumber; }

    /**
     * This is the setter to set the value of phoneNumber.
     * @param phoneNumber This is the parameter to set phoneNumber. 
     */
    public void setPhoneNumber(String phoneNumber) 
    { 
        this.phoneNumber = phoneNumber;
    }
   
    /**
     * This is the getter to retrieve the value of street.
     * @return String Returns the value in street.
     */
    public String getStreet() { return street; }

    /**
     * This is the setter to set the value of street.
     * @param street This is the parameter to set street. 
     */
    public void setStreet(String street) { this.street = street; }

    /**
     * This is the getter to retrieve the value of city.
     * @return String Returns the value in city.
     */
    public String getCity() { return city; }

    /**
     * This is the setter to set the value of city.
     * @param city This is the parameter to set city. 
     */
    public void setCity(String city) { this.city = city; }

    /**
     * This is the getter to retrieve the value of state.
     * @return String Returns the value in state.
     */
    public String getState() { return state; }

    /**
     * This is the setter to set the value of state.
     * @param state This is the parameter to set state. 
     */
    public void setState(String state) { this.state = state; }

    /**
     * This is the getter to retrieve the value of zipCode.
     * @return Integer Returns the value in zipCode.
     */
    public int getZipCode() { return zipCode; }

    /**
     * This is the setter to set the value of zipCode.
     * @param zipCode This is the parameter to set zipCode. 
     */
    public void setZipCode(int zipCode) { this.zipCode = zipCode; }
    
     /**
     * This is the method to format and return the value of Address.
     * @return String Returns the formatted value of Address.
     */
    public String getFormattedAddress()
    {
        return (this.street + "\n" + this.city + "," + " " + this.state + "-" 
                + this.zipCode);
    }
  
    /**
     * This is the method to format and return the value of PhoneNumber.
     * @return String Returns the formatted value of PhoneNumber.
     */
    public String getFormattedPhoneNumber()
    {
       return "(".concat(phoneNumber.substring(0, 3)).concat(")")
               .concat(phoneNumber.substring(3, 6)).concat("-")
               .concat(phoneNumber.substring(6, 10));
    }
    
    /**
     * This is the method to replace the value of store name with given name.
     * @param oldName
     * @param newName
     */
    public void replaceStoreName(String oldName, String newName)
    {
        this.storeName =  this.storeName.replaceAll(oldName, newName);
    }
    
    /**
     * This is the method to return the first word in storeName.
     * @return Returns the first word in storeName.
     */
    public String getFirstWordOfStoreName()
    {
        return this.storeName.substring(0, storeName.indexOf(" "));            
    }
    
    /**
     * This is the method to return the middle word of storeName
     * @return Returns the middle word of storeName
     */
    public String getMiddleWordOfStoreName()
    {
        return this.storeName.substring(storeName.indexOf(" ") + 1,
                    storeName.lastIndexOf(" "));
    }
    
    /**
     * This is the method to return the last word in storeName.
     * @return Returns the last word in storeName.
     */
    public String getLastWordOfStoreName()
    {
      return this.storeName.substring(storeName.lastIndexOf(" ") + 1,
                    storeName.length() - 1);   
    }

    @Override
    //Prints the values in Store Class.
    public String toString() {
        return getStoreName() + " " + "(" + getStoreID() + ")" + "\n" 
                + getFormattedAddress() + "\n" + getFormattedPhoneNumber();
    }
}
