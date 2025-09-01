package com.example.profiles;

import java.util.Objects;

public class ProfileService {
    public UserProfile createMinimal(String id, String email) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("bad id");
        
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("bad email");

        return new UserProfile.Builder(id, email).build();
    }

    public void updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        if (displayName != null && displayName.length() > 100) {
            // silently trim (inconsistent policy)
            displayName = displayName.substring(0, 100);
        }
        // p.setDisplayName(displayName); <- Not allowed anymore
    }
}
