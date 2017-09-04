package com.cgm.controller;

import java.util.Locale;
import java.util.Map;
import com.cgm.builder.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.domain.Message;
import com.cgm.domain.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Salut");
		return "forward:/login";
	}
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView account() {
	      return new ModelAndView("account", "command", ArtefactBuilder.anUser());}
*/
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView loginUser(@ModelAttribute ("account") User user, Map model) {
		System.out.println("@@@@@@@LOGIN");
		if (user.getUsername().equals("raluca.plugariu") && user.getPassword().equals("raluca10")) {
			return new ModelAndView("redirect:/profil", model);
		} else {
			return new ModelAndView("redirect:/login", model);
		}

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView createUser(@ModelAttribute ("account") User user) {
		System.out.println("@@@@@@@LOGIN");
		
			return new ModelAndView("login","account",UserBuilder.newUser());
		}
	
	@RequestMapping(value = {"/profil", ""})
    public String viewStats(Map<String, Object> model) {
        return "profil";
    }
	
	
	@RequestMapping(value = "/profil", method = RequestMethod.GET)

	public String showMessages(ModelMap model) {
		model.put("postMessage", UserBuilder.aMessage());
		model.put("messages", UserBuilder.allMessages);
		model.put("userMessage", UserBuilder.userMessages);
		return "profil";

		}
	
	
	@RequestMapping(value = "/profil", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView postMessage(@ModelAttribute ("postMessage") Message message, Map model) {
		UserBuilder.userMessages.add(message); 
			return new ModelAndView("redirect:profil", model);
	}
		
	
	
	@RequestMapping(value = "/friends", method = RequestMethod.GET)
	public String showFriends(ModelMap model) {
		model.put("users", UserBuilder.allUsers);
		model.put("friend", UserBuilder.userFriends);
		return "friends";
		}
	
	@RequestMapping(value = "/friends/{username}", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView folowFriend(@ModelAttribute ("follow")@PathVariable("username") String username, ModelMap model) {
		// should actually search for artist first
		for (User user : UserBuilder.allUsers) {
			if (user.getUsername().toString().equals(username.toString())) {
				UserBuilder.userFriends.add(user);
				model.put("users", UserBuilder.allUsers);
				model.put("friend", UserBuilder.userFriends);
			}
		}
		return new ModelAndView("friends", model);
		
	}
	
}
