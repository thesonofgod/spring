package com.codewithshan.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	
	// annotate the class as an entity and map to the db table
	
	//define the fields
	
	
	//annotate the fields with db column names
	
	//create constructors
	
	//generate setters/getters methods
	
	//generate toString() method
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
public InstructorDetail(int id, String youtubeChannel, String hobby) {
		super();
		this.id = id;
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
@Column(name="youtube_channel")
	private String youtubeChannel;

@Column(name="hobby")
	private String hobby;



//add new field for instructor and also add getter/setter methods

@OneToOne(mappedBy="instructorDetail",cascade=CascadeType.ALL)
private Instructor instructor;


//add one to one annotation 

public Instructor getInstructor() {
	return instructor;
}

public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}

@Override
public String toString() {
	return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
}
	
}
