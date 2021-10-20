package com.cuit.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringBoot12MailApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void testSimpleMail() {
        //封装简单的邮件内容
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件标题
        message.setSubject("放假通知");
        message.setText("老表你好！");
        //发件人
        message.setFrom("1289411876@qq.com");
        message.setTo("1244674059@qq.com");
        message.setTo("1534129280@qq.com");
        javaMailSender.send(message);
    }

    //发送复杂邮件带附件和html的邮件
    @Test
    public void testMimeMail() throws MessagingException {
        //创建一个发送复杂消息对象
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        //通过消息帮助对象，来设置发送的内容
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        //邮件主题
        messageHelper.setSubject("图片");
        //第2个参数为true表示是html
        messageHelper.setText("<h2 style='color:red'>随便发的</h2>", true);
        //上传文件 (文件名，File或IO对象)
        messageHelper.addAttachment("1.jpg", new File("C:\\Users\\asus\\Desktop\\1.jpg"));
        //发件人
        messageHelper.setFrom("1289411876@qq.com");
        messageHelper.setTo("1244674059@qq.com");
        messageHelper.setTo("1534129280@qq.com");
        messageHelper.setTo("158848996@qq.com");
        javaMailSender.send(mimeMessage);


    }

}
