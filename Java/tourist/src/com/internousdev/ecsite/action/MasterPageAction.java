package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MasterPageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String result;

	public String execute() {

		result = "login";

		if (session.containsKey("id")) {
			result = ERROR;
		}

		if (session.containsKey("masterId")) {
			result = SUCCESS;
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession (Map<String, Object> session) {
		this.session = session;
	}


}
