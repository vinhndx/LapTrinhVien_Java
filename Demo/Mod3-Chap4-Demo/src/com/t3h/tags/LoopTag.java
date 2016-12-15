package com.t3h.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class LoopTag implements IterationTag {

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		if(count >= 0){
			return EVAL_BODY_INCLUDE;
		}
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPageContext(PageContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public int doAfterBody() throws JspException {
		
		if(count-- > 0){
			return EVAL_BODY_AGAIN;
		}
		
		return SKIP_BODY;
	}

}
