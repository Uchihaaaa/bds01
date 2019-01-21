package com.bds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bds.entity.Client;
import com.bds.entity.House;
import com.bds.entity.Image;
import com.bds.entity.Staff;
import com.bds.service.ClientService;
import com.bds.service.HouseService;
import com.bds.service.ImageService;
import com.bds.service.StaffService;

@RestController
public class JsonController {
	
	@Autowired
	private HouseService houseService;
	
	@Autowired
	private StaffService staffService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ImageService imageService;
	
	@GetMapping("/getImage")
	public List<Image> getImage(int houseId) {
		return houseService.findAllImageByHouseId(houseId);
	}
	
	@GetMapping("/deleteImage/{id}")
	public String delete(@PathVariable int id) {
		imageService.delete(id);
		return "done";
	}
	
	@GetMapping("/findOne")
	public House findOne(int id) {
		return houseService.getById(id);
	}
	
	@GetMapping("/findOneStaff")
	public Staff findOneStaff(int id) {
		return staffService.getOne(id);
	}
	
	@GetMapping("/findOneClient")
	public Client findOneClient(int id) {
		return clientService.getOne(id);
	}
}
