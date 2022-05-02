package org.cowco.database;

// Provides a generic representation for a user, to be stored in a 
// relational database - only used if the Database authentication
// method is enabled.
public class UserEntity {
    private long id;
    private String name;
    private String passwordHash;
}
