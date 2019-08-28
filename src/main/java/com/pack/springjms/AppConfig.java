package com.pack.springjms;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ MessageConfig.class })
public class AppConfig 
{
    
}
