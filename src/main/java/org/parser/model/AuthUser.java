package org.parser.model;

import java.io.Serializable;

public class AuthUser implements Serializable {
	private static final long serialVersionUID = 5439945553603054387L;

	private String firstName;
	
	private String lastName;
	
	private String name;
	
	private String username;
	
	private String email;

	private String imageUrl;

	private Boolean emailVerified = false;

	private String password;

	private AuthProvider provider;

	private String providerId;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthProvider getProvider() {
		return provider;
	}

	public void setProvider(AuthProvider provider) {
		this.provider = provider;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthUser [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", emailVerified=");
		builder.append(emailVerified);
		builder.append(", password=");
		builder.append(password);
		builder.append(", provider=");
		builder.append(provider);
		builder.append(", providerId=");
		builder.append(providerId);
		builder.append("]");
		return builder.toString();
	}

	
}
