package com.example.useful.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="user")
public class Users {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String name;
	private String description;
	private String userRole;
	
		
		public Users() {
		super();
	}


		public Users(String name, String description, String userRole) {
			
			this.name = name;
			this.description = description;
			this.userRole = userRole;
		}

		

		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getUserRole() {
			return userRole;
		}


		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}


		@Override
		public String toString() {
			return "Users [userId=" + userId + ", name=" + name + ", description=" + description + ", userRole="
					+ userRole + "]";
		}
	
	
}
