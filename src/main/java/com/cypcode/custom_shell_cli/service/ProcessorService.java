package com.cypcode.custom_shell_cli.service;

import org.springframework.stereotype.Service;

@Service
public class ProcessorService {

    public String process(String type, String name, int id){
        return switch (type) {
            case "retrieve" -> retrieve(type, name, id);
            case "create" -> create(type, name, id);
            case "update" -> update(type, name, id);
            case "delete" -> delete(type, name, id);
            default -> String.format("Unavailable process: %s, please see acceptable process-type: retrieve, create, update, delete", type);
        };
    }

    private String retrieve(String type, String name, int id){
        return String.format("Running a process to: %s, user: %s, with id: %d", type, name, id);
    }

    private String create(String type, String name, int id){
        return String.format("Running a process to: %s, user: %s, with id: %d", type, name, id);
    }

    private String update(String type, String name, int id){
        return String.format("Running a process to: %s, user: %s, with id: %d", type, name, id);
    }

    private String delete(String type, String name, int id){
        return String.format("Running a process to: %s, user: %s, with id: %d", type, name, id);
    }
}
