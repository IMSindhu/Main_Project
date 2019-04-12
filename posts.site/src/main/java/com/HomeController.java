package com;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.CommentDAOImpl;
import dao.PostDAOImpl;
import dao.UserDAOImpl;
import model.Comments;
import model.Post;
import model.User;

@Controller
public class HomeController {

	PostDAOImpl pImpl = new PostDAOImpl();
	CommentDAOImpl cImpl = new CommentDAOImpl();
	UserDAOImpl uImpl = new UserDAOImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user(@RequestParam(value = "userName") String userName) {
		ModelAndView view = new ModelAndView("user");
		view.addObject("userName", userName);
		return view;
	}

	@RequestMapping("/add")
	public ModelAndView addPost() {

		return new ModelAndView("add", "command", new Post());
	}

	// @RequestMapping(value = "/add", method = RequestMethod.GET)
	/*
	 * public ModelAndView addPost(@RequestParam(value = "title") String title,...)
	 * {
	 * 
	 * int res = impl.add(new Post(0,title,body));
	 * 
	 * String result = (res == 1) ? "post added" : "post couldn't be added";
	 * ModelAndView view = new ModelAndView("result");
	 * view.addObject("result",result); return view;
	 */

	@RequestMapping(value = "/addpost", method = RequestMethod.POST)
	public ModelAndView addPost(@ModelAttribute("post") Post post) {
		System.out.println(post);
		ModelAndView view = new ModelAndView("/result");

		int res = pImpl.insert(post);

		String result = (res == 1) ? "post added" : "post couldn't be added";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deletePost(@RequestParam(value = "id") int id) {

		int res = pImpl.delete(id);

		String result = (res == 1) ? "post deleted" : "post couldn't be deleted";

		ModelAndView view = new ModelAndView("result");
		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewPosts() {

		List<Post> list = null;
		try {
			list = pImpl.view();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all");
		view.addObject("list", list);
		return view;
	}

	/* comments implementation */
	@RequestMapping(value = "/addcomment", method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute("comments") Comments comments) {
		System.out.println(comments);
		ModelAndView view = new ModelAndView("/result");

		int res = cImpl.insertComment(comments);

		String result = (res == 1) ? "comment added" : "comment couldn't be added";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/editcomment", method = RequestMethod.PUT)
	public ModelAndView updateComment(@ModelAttribute("comments") Comments comments) {
		System.out.println(comments);
		ModelAndView view = new ModelAndView("/result");

		int res = cImpl.updateComment(comments);

		String result = (res == 1) ? "comment added" : "comment couldn't be added";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/deletecomment", method = RequestMethod.GET)
	public ModelAndView deleteComment(@RequestParam(value = "cid") int cid) {

		int res = cImpl.deleteComment(cid);

		String result = (res == 1) ? "comment deleted" : "comment couldn't be deleted";

		ModelAndView view = new ModelAndView("result");
		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/viewcomment", method = RequestMethod.GET)
	public ModelAndView viewComment() {

		List<Comments> list = null;
		try {
			list = cImpl.viewAllComment();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ModelAndView view = new ModelAndView("view_all_comment");
		view.addObject("list", list);
		return view;
	}

	/* user implementation */
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public ModelAndView signIn(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView view = new ModelAndView("/result");

		boolean res = uImpl.signIn(user);

		String result = (res == true) ? "sigin success " : "signin unsucessfull";

		view.addObject("result", result);
		return view;
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView signUp(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView view = new ModelAndView("/result");

		boolean res = uImpl.signIn(user);

		String result = (res == true) ? "signup success" : "signup unsucessfull";

		view.addObject("result", result);
		return view;
	}

}
