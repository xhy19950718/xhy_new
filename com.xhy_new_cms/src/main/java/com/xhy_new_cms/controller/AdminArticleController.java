package com.xhy_new_cms.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xhy_new_cms.pojo.Article;
import com.xhy_new_cms.util.JsonResult;

@Controller
@RequestMapping("/admin/")
public class AdminArticleController {

	@Autowired
	private AdminArticleService adminArticleService;
	
	
	//删除文章
	@ResponseBody
	@RequestMapping("delete.do")
	public Object deleteArticle(Article article) {
		
		int flag=adminArticleService.deleteArticle(article.getId());
		
		if(flag>0) {
			JsonResult.sucess();
		}else {
			return JsonResult.fail(1003, "删除成功！");
			
		}
		
	}
	
	//审核
	@ResponseBody
	@RequestMapping("updatestatus.do")
	public Object updatestatus(Article article) {
		int flag=adminArticleService.updatestatus(article.getId());
		if(flag>0) {
			return JsonResult.sucess();
		}else {
			return JsonResult.fail(1004, "出错了");
		}
	}
	
	//查看文章详情
	@ResponseBody
	@RequestMapping("selectArticle.do")
	public Object selectArticleById(Article article) {
		Article articleInfo=adminArticleService.selectArticleById(article.getId());
		if(articleInfo==null) {
			return JsonResult.fail(1005,"无效得文章");
		}else {
			return JsonResult.sucess(articleInfo);
		}
	}
	
}
