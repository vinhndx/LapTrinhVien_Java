package com.t3h.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag{

	private PageContext pageContext;
	private String ten;
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try {
			pageContext.getOut().print("Hello " + ten + ", ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		return null;
	}

	@Override
	public void release() {
		
	}

	@Override
	public void setPageContext(PageContext abc) {
		this.pageContext = abc;
	}

	@Override
	public void setParent(Tag arg0) {
		
	}

}
