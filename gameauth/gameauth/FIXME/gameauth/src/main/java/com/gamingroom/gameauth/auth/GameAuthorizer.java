
package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	
        // authorize method based on BasicAuth Security Example to return roles that 
    	// are not null and contain a specified role
    	return user.getRoles() != null && user.getRoles().contains(role);
    	
    }
}