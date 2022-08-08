package com.vikas.Library_management_system.service;

import java.util.List;

import com.vikas.Library_management_system.entity.Publisher;


public interface PublisherService {

	public List<Publisher> findAllPublishers();

	public Publisher findPublisherById(Long id);

	public void createPublisher(Publisher publisher);

	public void updatePublisher(Publisher publisher);

	public void deletePublisher(Long id);

}
