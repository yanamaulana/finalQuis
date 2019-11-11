package com.example.MvcMysql;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class MasterController {
	
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/")
	public String usermain(Model model) {
		List<Tbluser> listUsers = userService.listAll();
		model.addAttribute("listUsers", listUsers);
		return "user";
	}
	

//	@RequestMapping("/user")
//	public String user(Model model) {
//		List<Tbluser> listUsers = userService.listAll();
//		model.addAttribute("listUsers", listUsers);
//		return "user";
//	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteForm(@PathVariable(name = "id") Integer id) {
		userService.delete(id);
		return "userdeleted";
	}
	
	@RequestMapping(value = "/updateform/{id}", method = RequestMethod.GET)
    public String showEditTbluserPage(@PathVariable(name = "id") Integer id, Model model) {
		Tbluser tbluser = userService.get(id);
		model.addAttribute("tbluser", tbluser);
        return "updateform";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String SaveUser(@Valid Tbluser tbluser, BindingResult result, 
			ModelMap model, RedirectAttributes redirectattributes) {
		if (result.hasErrors()) {
			return "useradded";
		}
		userService.save(tbluser);
		return "useradd";
	}
	
	@RequestMapping(value = "/updateform/update", method = RequestMethod.POST)
	public String UpdateUser(@Valid Tbluser tbluser, BindingResult result, 
			ModelMap model, RedirectAttributes redirectattributes) {
		if (result.hasErrors()) {
			return "updateform";
		}
		userService.save(tbluser);
		return "userupdated";
	}
	
	@RequestMapping(value = "useradded", method = RequestMethod.GET)
	public String userform(ModelMap model) {
		Tbluser tbluser = new Tbluser();
		model.addAttribute("tbluser", tbluser);
		return "useradded";
	}
	
	

	@Autowired
	private AssetService AssetService;
	
	@RequestMapping("/asset")
	public String assetmain(Model model) {
		List<Asset> listAssets = AssetService.listAll();
		model.addAttribute("listAssets", listAssets);
		return "asset";
	}
	
	@RequestMapping(value = "assetadd", method = RequestMethod.GET)
	public String usernewnich(ModelMap model) {
		Asset asset = new Asset();
		model.addAttribute("asset", asset);
		return "assetaddform";
	}

	@RequestMapping(value = "/asset/save1", method = RequestMethod.POST)
	public String SaveAsset(@Valid Asset asset, BindingResult result, ModelMap model,
			RedirectAttributes redirectattributes) {
		if (result.hasErrors()) {
			return "assetaddform";
		}
		AssetService.save1(asset);
		return "assetaddsuccess";
	}

	@RequestMapping(value = "/asset/update1/{id}", method = RequestMethod.GET)
	public String showEditAssetPage(@PathVariable(name = "id") int assetid, Model model) {
		Asset asset = AssetService.get(assetid);
		model.addAttribute("asset", asset);
		return "asseteditform";
	}

	@RequestMapping(value = "/asset/update1/update", method = RequestMethod.POST)
	public String UpdateAsset(@Valid Asset asset, BindingResult result, ModelMap model,
			RedirectAttributes redirectattributes) {
		if (result.hasErrors()) {
			return "asseteditform";
		}
		AssetService.save1(asset);
		return "assetupdatesuccess";
	}

	@RequestMapping(value = "/asset/delete1/{id}", method = RequestMethod.GET)
	public String deleteForm1(@PathVariable(name = "id") int assetid) {
		AssetService.delete1(assetid);
		return "assetdeletesuccess";
	}
	

//	@ModelAttribute("brands")
//	public List<String> initializeSections() {
//
//		List<String> brands = new ArrayList<String>();
//		brands.add("PANASONIC");
//		brands.add("SAMSUNG");
//		brands.add("SANYO");
//		return brands;
//	}
}

