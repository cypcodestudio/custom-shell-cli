package com.cypcode.custom_shell_cli.command;

import com.cypcode.custom_shell_cli.service.ProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HomeCommand {

    @Autowired
    private ProcessorService processor;

    @ShellMethod(key = "c-home", value = "welcome to cypcode")
    public String home(){
        return String.format("running spring custom shell cypcode-cli");
    }

    @ShellMethod(key = "process", value = "submit process")
    public String process(
            @ShellOption(value = "type", defaultValue = "retrieve") String processType,
            @ShellOption(value = "name", defaultValue = "null") String name,
            @ShellOption(value = "id", defaultValue = "1") int id
    ){
        return processor.process(processType, name, id);
    }
}
