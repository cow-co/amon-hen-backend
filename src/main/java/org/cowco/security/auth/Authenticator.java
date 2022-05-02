package org.cowco.security.auth;

public interface Authenticator {
    /**
     * Provides an interface to retrieve the given user (if the username and
     * password are correct)
     * from the implemented user store (eg. LDAP or a database)
     * 
     * @param name     Username for looking up the user
     * @param password Authentication key for the user
     * @return A representation of the user
     */
    User retrieveUser(String name, String password);
}
