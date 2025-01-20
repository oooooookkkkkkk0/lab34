package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Character extends Human implements SpecificPerson{
    Logger logger = LogManager.getLogger(this.getClass());
    protected final String name;
    protected Character (String profession, Gender gender, Place residents, String name) {
        super(profession, gender, residents);
        this.name = name;
    }

    public abstract String getName();

    public abstract String say();

    public void greet(){
        logger.info("{} - {}", this.name, this.profession);
    }
}
