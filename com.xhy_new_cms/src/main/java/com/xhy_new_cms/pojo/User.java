package com.xhy_new_cms.pojo;

import java.sql.Date;
import java.util.List;

public class User {
	private int id;
	private String username;
	private String password;
	private String nickname;
	private String birthday;
	private int gender;
	private int locked;
	private String create_time;
	private String update_time;
	private String url;
	private int score;
	private List<Article> articlelist;
	private List<Comment> commentList;
	public User() {
		super();
	}
	
	
	
	public List<Article> getArticlelist() {
		return articlelist;
	}



	public void setArticlelist(List<Article> articlelist) {
		this.articlelist = articlelist;
	}



	public List<Comment> getCommentList() {
		return commentList;
	}



	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", create_time="
				+ create_time + ", update_time=" + update_time + ", url=" + url + ", score=" + score + ", articlelist="
				+ articlelist + ", commentList=" + commentList + "]";
	}
	
	
	
	
}
