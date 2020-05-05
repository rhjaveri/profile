package com.picturesque.profile.development;

import com.picturesque.profile.databaseModels.Group;
import com.picturesque.profile.databaseModels.GroupMD;
import com.picturesque.profile.databaseModels.Person;
import com.picturesque.profile.databaseModels.PersonMD;
import com.picturesque.profile.repos.GroupMDRepository;
import com.picturesque.profile.repos.GroupRepository;
import com.picturesque.profile.repos.PersonMDRepository;
import com.picturesque.profile.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;

public class TestingRepos {


    @Autowired
    public PersonRepository personRepository;

    @Autowired
    public GroupRepository groupRepository;

    @Autowired
    public PersonMDRepository personMDRepository;

    @Autowired
    public GroupMDRepository groupMDRepository;


    public void testRepositories() {
        Group exampleGroup = new Group(1, "Rohil", new ArrayList<Person>(), "This is a bio");
        groupRepository.save(exampleGroup);
        System.out.println(groupRepository.findById(1));

        Person examplePerson = new Person(1, "Kartik", "rhjaveri", "abc", "123",
                "password", new byte[1], 100);
        personRepository.save(examplePerson);
        System.out.println(personRepository.findById(1));

        GroupMD exampleGroupMD = new GroupMD(1, "groupMD", new Date());
        groupMDRepository.save(exampleGroupMD);
        System.out.println(groupMDRepository.findById(1));

        PersonMD examplePersonMD = new PersonMD(1, "personMD", new Date(),
                new Date(), new Date(), 100, new ArrayList<Integer>());
        personMDRepository.save(examplePersonMD);
        System.out.println(personMDRepository.findById(1));

    }







}
