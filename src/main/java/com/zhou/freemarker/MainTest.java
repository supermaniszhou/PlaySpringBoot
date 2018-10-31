package com.zhou.freemarker;

/**
 * Created by Administrator on 2018/4/20.
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.util.ResourceUtils;

public class MainTest {
    public static void main(String[] args) throws Exception{
        File file= ResourceUtils.getFile("classpath:static/test.ftl");

//        Configuration configuration = new Configuration();
//        configuration.setObjectWrapper(new DefaultObjectWrapper());
//        configuration.setTemplateLoader(new ClassTemplateLoader(MainTest.class, "classpath:static/"));
//        try {
//            Template template = configuration.getTemplate("test.ftl");
//            StringWriter writer = new StringWriter();
//            Map<String, Object> context = new HashMap<String, Object>();
//
//            context.put("message", "我的第一个Maven_FreeMarker程序");
//
//            template.process(context, writer);
//            System.out.println(writer.toString());
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (TemplateException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }
}
