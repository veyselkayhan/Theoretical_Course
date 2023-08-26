package com.veysel.repository.entity;


import java.io.Serializable;
import java.util.UUID;


public class User implements Serializable {

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String gender;
 private Name name;
 private Location location;
 private String email;
 private Login login;
 private Dob dob;
 private String phone;
 private String cell;
 private ID id;
 private Picture picture;
 private String nat;

 @Override
public String toString() {
	return "User [gender=" + gender + ", name=" + name + ", location=" + location + ", email=" + email + ", login="
			+ login + ", dob=" + dob + ", phone=" + phone + ", cell=" + cell + ", id=" + id + ", picture=" + picture
			+ ", nat=" + nat + "]";
}
public String getGender() { return gender; }
 public void setGender(String value) { this.gender = value; }

 public Name getName() { return name; }
 public void setName(Name value) { this.name = value; }

 public Location getLocation() { return location; }
 public void setLocation(Location value) { this.location = value; }

 public String getEmail() { return email; }
 public void setEmail(String value) { this.email = value; }

 public Login getLogin() { return login; }
 public void setLogin(Login value) { this.login = value; }

 public Dob getDob() { return dob; }
 public void setDob(Dob value) { this.dob = value; }


 public String getPhone() { return phone; }
 public void setPhone(String value) { this.phone = value; }

 public String getCell() { return cell; }
 public void setCell(String value) { this.cell = value; }

 public ID getID() { return id; }
 public void setID(ID value) { this.id = value; }

 public Picture getPicture() { return picture; }
 public void setPicture(Picture value) { this.picture = value; }

 public String getNat() { return nat; }
 public void setNat(String value) { this.nat = value; }
 
 
//Dob.java

class Dob {

private long age;



@Override
public String toString() {
	return "Dob [age=" + age + "]";
}
public long getAge() { return age; }
public void setAge(long value) { this.age = value; }
}

//ID.java


class ID {
private String name;
private String value;

public String getName() { return name; }
public void setName(String value) { this.name = value; }

@Override
public String toString() {
	return "ID [name=" + name + ", value=" + value + "]";
}
public String getValue() { return value; }
public void setValue(String value) { this.value = value; }
}

//Location.java


public class Location {
private Street street;
private String city;
private String state;
private String country;
private String postcode;
private Coordinates coordinates;
private Timezone timezone;

@Override
public String toString() {
	return "Location [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + ", postcode="
			+ postcode + ", coordinates=" + coordinates + ", timezone=" + timezone + "]";
}
public Street getStreet() { return street; }
public void setStreet(Street value) { this.street = value; }

public String getCity() { return city; }
public void setCity(String value) { this.city = value; }

public String getState() { return state; }
public void setState(String value) { this.state = value; }

public String getCountry() { return country; }
public void setCountry(String value) { this.country = value; }

public String getPostcode() { return postcode; }
public void setPostcode(String value) { this.postcode = value; }

public Coordinates getCoordinates() { return coordinates; }
public void setCoordinates(Coordinates value) { this.coordinates = value; }

public Timezone getTimezone() { return timezone; }
public void setTimezone(Timezone value) { this.timezone = value; }
}

//Coordinates.java


public class Coordinates {
private String latitude;
private String longitude;

public String getLatitude() { return latitude; }
public void setLatitude(String value) { this.latitude = value; }

@Override
public String toString() {
	return "Coordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
}
public String getLongitude() { return longitude; }
public void setLongitude(String value) { this.longitude = value; }
}


//Street.java


public class Street {
private long number;
private String name;

@Override
public String toString() {
	return "Street [number=" + number + ", name=" + name + "]";
}
public long getNumber() { return number; }
public void setNumber(long value) { this.number = value; }

public String getName() { return name; }
public void setName(String value) { this.name = value; }
}

//Timezone.java


public class Timezone {
private String offset;
private String description;

@Override
public String toString() {
	return "Timezone [offset=" + offset + ", description=" + description + "]";
}
public String getOffset() { return offset; }
public void setOffset(String value) { this.offset = value; }

public String getDescription() { return description; }
public void setDescription(String value) { this.description = value; }
}

//Login.java


public class Login {
private UUID uuid;
private String username;
private String password;
private String salt;
private String md5;
private String sha1;
private String sha256;

@Override
public String toString() {
	return "Login [uuid=" + uuid + ", username=" + username + ", password=" + password + ", salt=" + salt + ", md5="
			+ md5 + ", sha1=" + sha1 + ", sha256=" + sha256 + "]";
}
public UUID getUUID() { return uuid; }
public void setUUID(UUID value) { this.uuid = value; }

public String getUsername() { return username; }
public void setUsername(String value) { this.username = value; }

public String getPassword() { return password; }
public void setPassword(String value) { this.password = value; }

public String getSalt() { return salt; }
public void setSalt(String value) { this.salt = value; }

public String getMd5() { return md5; }
public void setMd5(String value) { this.md5 = value; }

public String getSha1() { return sha1; }
public void setSha1(String value) { this.sha1 = value; }

public String getSha256() { return sha256; }
public void setSha256(String value) { this.sha256 = value; }
}

//Name.java


public class Name {
private String title;
private String first;
private String last;

@Override
public String toString() {
	return "Name [title=" + title + ", first=" + first + ", last=" + last + "]";
}
public String getTitle() { return title; }
public void setTitle(String value) { this.title = value; }

public String getFirst() { return first; }
public void setFirst(String value) { this.first = value; }

public String getLast() { return last; }
public void setLast(String value) { this.last = value; }
}

//Picture.java


public class Picture {
private String large;
private String medium;
private String thumbnail;

@Override
public String toString() {
	return "Picture [large=" + large + ", medium=" + medium + ", thumbnail=" + thumbnail + "]";
}
public String getLarge() { return large; }
public void setLarge(String value) { this.large = value; }

public String getMedium() { return medium; }
public void setMedium(String value) { this.medium = value; }

public String getThumbnail() { return thumbnail; }
public void setThumbnail(String value) { this.thumbnail = value; }



 
}


 
 
 
 
 
 }

	 

