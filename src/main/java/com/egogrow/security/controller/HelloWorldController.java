package com.egogrow.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.egogrow.security.user.MemberInfo;

@Controller
public class HelloWorldController {
	
	@Autowired
	private SecurityContextLogoutHandler securityContextLogoutHandle;
	
	@RequestMapping(value = {"/home","/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model, Authentication auth) {
		MemberInfo member = (MemberInfo) auth.getPrincipal();
		System.out.println(auth);
		System.out.println(member);
		model.addAttribute("auth", auth );
		model.addAttribute("vo", member );
		model.addAttribute("user", member.getName());

		return "welcome";
	}

	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public String adminPage(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = principal instanceof UserDetails ? ((UserDetails) principal)
				.getUsername() : principal.toString();
		model.addAttribute("user", userName);
		return "admin/index";
	}

	@RequestMapping(value = "/dba/index", method = RequestMethod.GET)
	public String dbaPage(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = principal instanceof UserDetails ? ((UserDetails) principal)
				.getUsername() : principal.toString();
		model.addAttribute("user", userName);
		return "dba/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request,HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			securityContextLogoutHandle.logout(request, response, auth);
		}
		return "redirect:/home";
	}

	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = principal instanceof UserDetails ? ((UserDetails) principal)
				.getUsername() : principal.toString();
		model.addAttribute("user", userName);
		return "accessDenied";
	}
	
	@RequestMapping(value = "/authenticationFailure", method = RequestMethod.GET)
	public String authenticationFailure(HttpServletRequest request){
		request.setAttribute("authenticationFailureResult", "failure");
		return "login";
	}
}