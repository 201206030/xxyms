package net.happystudy.xxyms.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class BootApplicationListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent){
            //存储角色菜单表，当relation表中的数据改变时，需要重新查询存储
            ApplicationContext context = ((ContextRefreshedEvent) event).getApplicationContext();
        }
        
    }

}
