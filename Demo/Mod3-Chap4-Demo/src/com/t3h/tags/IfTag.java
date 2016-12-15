package com.t3h.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class IfTag implements Tag{

	private Boolean test;
	
	public Boolean getTest() {
		return test;
	}
	
	public void setTest(Boolean test) {
		this.test = test;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {

		if(test){
			return EVAL_BODY_INCLUDE;
		}
		
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		return null;
	}

	@Override
	public void release() {
		
	}

	@Override
	public void setPageContext(PageContext arg0) {
		
	}

	@Override
	public void setParent(Tag arg0) {
		
	}
	
	

}
