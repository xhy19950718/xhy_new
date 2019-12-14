package com.xhy_new_cms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xhy_new_cms.pojo.Article;
import com.xhy_new_cms.pojo.User;
import com.xhy_new_cms.util.CmsMd5Util;
import com.xhy_new_cms.util.JsonResult;


@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	@ResponseBody
	@RequestMapping("/login")
	public Object login(User user,HttpSession session) {
		User userInfo=adminService.selectForUsername(user.getUsername());
		if(userInfo==null) {
			return JsonResult.fail(1001, "’À∫≈Œ¥◊¢≤·£°");
		}else {
			if(CmsMd5Util.string2MD5(user.getPassword()).equals(userInfo.getPassword())) {
				return JsonResult.sucess();
			}else {
				return JsonResult.fail(1002, "’À∫≈√‹¬Î ‰»Î¥ÌŒÛ");
			}
			
		}
		
		
		
	}
	
	
	@RequestMapping("/user")
	public String userHtml(User user,Model model,@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum, 1);
		List<User> list=adminService.selectUserList(user);
		PageInfo pageInfo=new PageInfo(list);
		model.addAttribute("pageInfo",pageInfo);
		return "admin/user";
	}
	
	
	@RequestMapping("/article")
	public String articleHtml(Article article,Model model,@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum, 1);
		List<Article> list=adminService.selectArticleList(article);
		PageInfo pageInfo=new PageInfo(list);
		model.addAttribute("pageInfo", pageInfo);
		return "admin/article";
	}
	
	@RequestMapping("/home")
	public String homeHtml() {
		return null;
	}
	
	
	@RequestMapping("/index")
	public String indexHtml() {
		return "admin/index";
	}
	
}
